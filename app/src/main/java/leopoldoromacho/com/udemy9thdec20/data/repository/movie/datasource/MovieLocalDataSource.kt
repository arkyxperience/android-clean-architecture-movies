package leopoldoromacho.com.udemy9thdec20.data.repository.movie.datasource

import leopoldoromacho.com.udemy9thdec20.data.model.movie.Movie

interface MovieLocalDataSource {
    suspend fun getMoviesFromDB():List<Movie>
    suspend fun saveMoviesToDB(movies: List<Movie>)
    suspend fun clearAll()
}