package leopoldoromacho.com.udemy9thdec20.data.datasource

import leopoldoromacho.com.udemy9thdec20.data.model.movie.Movie

interface MovieCacheDataSource {
    suspend fun getMoviesFromCache():List<Movie>
    suspend fun saveMoviesToCache(movies: List<Movie>)
}