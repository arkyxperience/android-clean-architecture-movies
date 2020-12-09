package leopoldoromacho.com.udemy9thdec20.data.repository.artist.datasource

import leopoldoromacho.com.udemy9thdec20.data.model.artist.Artist

interface ArtistCacheDataSource {
    suspend fun getArtistsFromCache():List<Artist>
    suspend fun saveArtistsToCache(artists:List<Artist>)

}