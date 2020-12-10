package leopoldoromacho.com.udemy9thdec20.data.repository.movie.datasource

import leopoldoromacho.com.udemy9thdec20.data.model.movie.MovieList
import retrofit2.Response

interface MovieRemoteDataSource {

    suspend fun getMovies(): Response<MovieList>

}