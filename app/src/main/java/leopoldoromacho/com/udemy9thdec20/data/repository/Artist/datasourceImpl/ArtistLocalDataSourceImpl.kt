package leopoldoromacho.com.udemy9thdec20.data.repository.artist.datasourceImpl

import leopoldoromacho.com.udemy9thdec20.data.model.artist.Artist

import kotlinx.coroutines.CoroutineScope
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.launch
import leopoldoromacho.com.udemy9thdec20.data.db.ArtistDao
import leopoldoromacho.com.udemy9thdec20.data.repository.artist.datasource.ArtistLocalDataSource


class ArtistLocalDataSourceImpl(private val artistDao: ArtistDao): ArtistLocalDataSource {
    override suspend fun getArtistsFromDB(): List<Artist> {
       return artistDao.getArtists()
    }

    override suspend fun saveArtistsToDB(artists: List<Artist>) {
        CoroutineScope(Dispatchers.IO).launch {
            artistDao.saveArtists(artists)
        }
    }

    override suspend fun clearAll() {
       CoroutineScope(Dispatchers.IO).launch {
           artistDao.deleteAllArtists()
       }
    }
}