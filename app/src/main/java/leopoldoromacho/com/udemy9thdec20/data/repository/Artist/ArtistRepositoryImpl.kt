package leopoldoromacho.com.udemy9thdec20.data.repository.Artist

import android.util.Log
import leopoldoromacho.com.udemy9thdec20.domain.repository.ArtistRepository
import leopoldoromacho.com.udemy9thdec20.data.repository.artist.datasource.ArtistCacheDataSource
import leopoldoromacho.com.udemy9thdec20.data.repository.artist.datasource.ArtistLocalDataSource
import leopoldoromacho.com.udemy9thdec20.data.repository.artist.datasource.ArtistRemoteDatasource
import leopoldoromacho.com.udemy9thdec20.data.model.artist.Artist



import java.lang.Exception

class ArtistRepositoryImpl(
        private val artistRemoteDatasource: ArtistRemoteDatasource,
        private val artistLocalDataSource: ArtistLocalDataSource,
        private val artistCacheDataSource: ArtistCacheDataSource
) : ArtistRepository {
    override suspend fun getArtists(): List<Artist>? {
        return getArtistsFromCache()
    }

    override suspend fun updateArtists(): List<Artist>? {
        val newListOfArtist = getArtistsFromAPI()
        artistLocalDataSource.clearAll()
        artistLocalDataSource.saveArtistsToDB(newListOfArtist)
        artistCacheDataSource.saveArtistsToCache(newListOfArtist)
        return newListOfArtist
    }

    suspend fun getArtistsFromAPI(): List<Artist> {
        lateinit var artistList: List<Artist>
        try {
            val response = artistRemoteDatasource.getArtists()
            val body = response.body()
            if(body!=null){
                artistList = body.artists
            }
        } catch (exception: Exception) {
            Log.i("MyTag", exception.message.toString())
        }
        return artistList
    }

    suspend fun getArtistsFromDB():List<Artist>{
        lateinit var artistList: List<Artist>
        try {
            artistList = artistLocalDataSource.getArtistsFromDB()
        } catch (exception: Exception) {
            Log.i("MyTag", exception.message.toString())
        }
        if(artistList.size>0){
            return artistList
        }else{
            artistList=getArtistsFromDB()
            artistLocalDataSource.saveArtistsToDB(artistList)
        }

        return artistList
    }

    suspend fun getArtistsFromCache():List<Artist>{
        lateinit var artistList: List<Artist>
        try {
            artistList =artistCacheDataSource.getArtistsFromCache()
        } catch (exception: Exception) {
            Log.i("MyTag", exception.message.toString())
        }
        if(artistList.size>0){
            return artistList
        }else{
            artistList=getArtistsFromDB()
            artistCacheDataSource.saveArtistsToCache(artistList)
        }

        return artistList
    }

}