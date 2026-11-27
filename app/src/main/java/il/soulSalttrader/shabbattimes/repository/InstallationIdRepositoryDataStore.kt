package il.soulSalttrader.shabbattimes.repository

import androidx.datastore.core.DataStore
import androidx.datastore.preferences.core.Preferences
import androidx.datastore.preferences.core.edit
import androidx.datastore.preferences.core.stringPreferencesKey
import il.soulSalttrader.shabbattimes.di.InstallationStore
import jakarta.inject.Inject
import jakarta.inject.Singleton
import kotlin.uuid.Uuid
import kotlinx.coroutines.flow.first

@Singleton
class InstallationIdRepositoryDataStore @Inject constructor(
    @param:InstallationStore private val dataStore: DataStore<Preferences>,
) : InstallationIdRepository {

    override suspend fun getOrCreate(): Uuid =
        dataStore.data.first()[KEY].toUuidOrNull()
            ?: dataStore.edit { prefs ->
                // edit() serializes updates, so concurrent callers re-check the value
                // inside the transaction and preserve the first value written
                if (prefs[KEY].toUuidOrNull() == null) prefs[KEY] = Uuid.random().toString()
            }[KEY].toUuidOrNull()
            ?: error("installation id missing after write")

    private fun String?.toUuidOrNull(): Uuid? =
        this?.let { runCatching { Uuid.parse(it) }.getOrNull() } // corrupt value -> regenerate

    internal companion object {
        val KEY = stringPreferencesKey("installation_id")
    }
}
