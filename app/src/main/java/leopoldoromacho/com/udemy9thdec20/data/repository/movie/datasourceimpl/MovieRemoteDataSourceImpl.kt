package leopoldoromacho.com.udemy9thdec20.data.repository.movie.datasourceimpl

import leopoldoromacho.com.udemy9thdec20.data.api.TMDBService
import leopoldoromacho.com.udemy9thdec20.data.model.movie.MovieList
import leopoldoromacho.com.udemy9thdec20.data.repository.movie.datasource.MovieRemoteDatasource
import retrofit2.Response

class MovieRemoteDataSourceImpl(
        private val tmdbService: TMDBService,
        private val apiKey: String
): MovieRemoteDatasource {

    override suspend fun getMovies(): Response<MovieList> = tmdbService.getPopularMovies(apiKey)

}