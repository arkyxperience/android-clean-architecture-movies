package leopoldoromacho.com.udemy9thdec20.data.repository

import android.util.Log
import leopoldoromacho.com.udemy9thdec20.data.datasource.MovieCacheDataSource
import leopoldoromacho.com.udemy9thdec20.data.datasource.MovieLocalDataSource
import leopoldoromacho.com.udemy9thdec20.data.datasource.MovieRemoteDatasource
import leopoldoromacho.com.udemy9thdec20.data.model.movie.Movie
import leopoldoromacho.com.udemy9thdec20.data.model.movie.MovieList
import leopoldoromacho.com.udemy9thdec20.domain.repository.MovieRepository
import retrofit2.Response

class MovieRepositoryImpl(
    private val movieRemoteDataSource: MovieRemoteDatasource,
    private val movieLocalDatasource: MovieLocalDataSource,
    private val movieCacheDatasource: MovieCacheDataSource
) : MovieRepository {

    override suspend fun getMovies(): List<Movie>? {
        TODO("Not yet implemented")
    }

    override suspend fun updateMovies(): List<Movie>? {
        TODO("Not yet implemented")
    }

    suspend fun getMoviesFromAPI(): List<Movie> {
        lateinit var movieList: List<Movie>

        try {
            val response = movieRemoteDataSource.getMovies()
            val body = response.body()
            if (body != null) {
                movieList = body.movies
            }

        } catch (exception: Exception) {
            Log.i("MyTag", exception.message.toString())
        }

        return movieList
    }

}