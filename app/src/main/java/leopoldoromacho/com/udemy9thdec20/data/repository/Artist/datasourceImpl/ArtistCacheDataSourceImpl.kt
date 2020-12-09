package leopoldoromacho.com.udemy9thdec20.data.repository.artist.datasourceImpl

import leopoldoromacho.com.udemy9thdec20.data.model.artist.Artist
import leopoldoromacho.com.udemy9thdec20.data.repository.artist.datasource.ArtistCacheDataSource


class ArtistCacheDataSourceImpl : ArtistCacheDataSource {

    private var artistList = ArrayList<Artist>()

    override suspend fun getArtistsFromCache(): List<Artist> {
        return artistList
    }

    override suspend fun saveArtistsToCache(artists: List<Artist>) {
       artistList.clear()
       artistList = ArrayList(artists)
    }
}