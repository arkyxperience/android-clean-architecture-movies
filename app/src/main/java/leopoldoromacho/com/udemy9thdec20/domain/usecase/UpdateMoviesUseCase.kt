package leopoldoromacho.com.udemy9thdec20.domain.usecase

import leopoldoromacho.com.udemy9thdec20.data.model.movie.Movie
import leopoldoromacho.com.udemy9thdec20.domain.repository.MovieRepository

class UpdateMoviesUseCase(private val movieRepository: MovieRepository)  {
    suspend fun execute():List<Movie>? = movieRepository.updateMovies()
}




