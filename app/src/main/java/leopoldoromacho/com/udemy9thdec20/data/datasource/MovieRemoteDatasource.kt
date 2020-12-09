package leopoldoromacho.com.udemy9thdec20.data.datasource

import leopoldoromacho.com.udemy9thdec20.data.model.movie.Movie
import leopoldoromacho.com.udemy9thdec20.data.model.movie.MovieList
import retrofit2.Response

interface MovieRemoteDatasource {

    suspend fun getMovies(): Response<MovieList>

}