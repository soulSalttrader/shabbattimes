package il.soulSalttrader.shabbattimes.repository

import kotlin.uuid.Uuid

/**
 * Identifies this app installation to the backend (header `X-Installation-Id`).
 *
 * The ID is generated on first use and stable for the life of the installation. It is an
 * identifier, not a secret and not authentication. It is not backed up, so a restore on another
 * device starts a new identity. Clearing app data or reinstalling also creates a new one.
 */
interface InstallationIdRepository {
    suspend fun getOrCreate(): Uuid
}
