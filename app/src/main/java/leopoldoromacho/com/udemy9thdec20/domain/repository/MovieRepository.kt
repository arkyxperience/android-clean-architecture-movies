package leopoldoromacho.com.udemy9thdec20.domain.repository

import leopoldoromacho.com.udemy9thdec20.data.model.movie.Movie


interface MovieRepository {
    suspend fun getMovies():List<Movie>?
    suspend fun updateMovies():List<Movie>?
}



