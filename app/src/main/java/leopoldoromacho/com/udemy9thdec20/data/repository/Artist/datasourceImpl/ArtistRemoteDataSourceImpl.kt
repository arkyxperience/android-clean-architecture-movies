package leopoldoromacho.com.udemy9thdec20.data.repository.artist.datasourceImpl

import leopoldoromacho.com.udemy9thdec20.data.api.TMDBService
import leopoldoromacho.com.udemy9thdec20.data.repository.artist.datasource.ArtistRemoteDatasource
import leopoldoromacho.com.udemy9thdec20.data.model.artist.ArtistList
import leopoldoromacho.com.udemy9thdec20.data.model.movie.MovieList
import leopoldoromacho.com.udemy9thdec20.data.repository.movie.datasource.MovieRemoteDatasource
import retrofit2.Response

class ArtistRemoteDataSourceImpl(
        private val tmdbService: TMDBService,
        private val apiKey:String
): ArtistRemoteDatasource {
    override suspend fun getArtists(): Response<ArtistList> = tmdbService.getPopularArtists(apiKey)
}


