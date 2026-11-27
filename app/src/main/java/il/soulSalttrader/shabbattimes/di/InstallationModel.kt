package il.soulSalttrader.shabbattimes.di

import android.content.Context
import androidx.datastore.core.DataStore
import androidx.datastore.preferences.core.Preferences
import dagger.Binds
import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.android.qualifiers.ApplicationContext
import dagger.hilt.components.SingletonComponent
import il.soulSalttrader.shabbattimes.repository.InstallationIdRepository
import il.soulSalttrader.shabbattimes.repository.InstallationIdRepositoryDataStore
import jakarta.inject.Singleton

@Module
@InstallIn(SingletonComponent::class)
abstract class InstallationModule {

    @Binds
    @Singleton
    abstract fun bindInstallationIdRepository(
        impl: InstallationIdRepositoryDataStore,
    ): InstallationIdRepository

    companion object {
        @Provides
        @Singleton
        @InstallationStore
        fun provideInstallationDataStore(
            @ApplicationContext context: Context,
        ): DataStore<Preferences> = context.installationDataStore
    }
}
