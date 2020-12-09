package leopoldoromacho.com.udemy9thdec20.data.repository.artist.datasource

import leopoldoromacho.com.udemy9thdec20.data.model.artist.ArtistList

import retrofit2.Response

interface ArtistRemoteDatasource {
   suspend fun getArtists(): Response<ArtistList>
}