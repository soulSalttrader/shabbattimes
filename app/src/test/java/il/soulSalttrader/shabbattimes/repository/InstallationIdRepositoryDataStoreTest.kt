package il.soulSalttrader.shabbattimes.repository

import androidx.datastore.preferences.core.PreferenceDataStoreFactory
import androidx.datastore.preferences.core.edit
import io.kotest.core.spec.style.FunSpec
import io.kotest.engine.spec.tempdir
import io.kotest.matchers.collections.shouldHaveSize
import io.kotest.matchers.shouldBe
import java.io.File
import kotlinx.coroutines.CoroutineScope
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.SupervisorJob
import kotlinx.coroutines.async
import kotlinx.coroutines.awaitAll
import kotlinx.coroutines.cancel
import kotlinx.coroutines.flow.first

class InstallationIdRepositoryDataStoreTest : FunSpec({
    val scope = CoroutineScope(SupervisorJob() + Dispatchers.IO)
    val dir = tempdir()
    var n = 0
    fun newStore() = PreferenceDataStoreFactory.create(scope = scope) {
        File(dir, "t${n++}.preferences_pb")
    }
    afterSpec { scope.cancel() }

    context("first use") {
        test("should create a valid UUID and persist it") {
            val store = newStore()
            val id = InstallationIdRepositoryDataStore(store).getOrCreate()
            store.data.first()[InstallationIdRepositoryDataStore.KEY] shouldBe id.toString()
        }
    }

    context("later use") {
        test("should return the same id on every call") {
            val repo = InstallationIdRepositoryDataStore(newStore())
            repo.getOrCreate() shouldBe repo.getOrCreate()
        }

        test("should return the stored id from a new repository instance") {
            val store = newStore()
            val first = InstallationIdRepositoryDataStore(store).getOrCreate()
            InstallationIdRepositoryDataStore(store).getOrCreate() shouldBe first
        }
    }

    context("concurrency") {
        test("should create exactly one id under concurrent first calls") {
            val repo = InstallationIdRepositoryDataStore(newStore())
            val ids = (1..100).map { async(Dispatchers.Default) { repo.getOrCreate() } }.awaitAll()
            ids.toSet() shouldHaveSize 1
        }

        test("should return the same ID across repository instances sharing one DataStore") {
            val store = newStore()
            val ids = (1..100).map {
                async(Dispatchers.Default) { InstallationIdRepositoryDataStore(store).getOrCreate() }
            }.awaitAll()
            ids.toSet() shouldHaveSize 1
        }
    }

    context("corrupt storage") {
        test("should replace a value that is not a UUID") {
            val store = newStore()
            store.edit { it[InstallationIdRepositoryDataStore.KEY] = "garbage" }
            val id = InstallationIdRepositoryDataStore(store).getOrCreate()
            store.data.first()[InstallationIdRepositoryDataStore.KEY] shouldBe id.toString()
        }
    }
})
