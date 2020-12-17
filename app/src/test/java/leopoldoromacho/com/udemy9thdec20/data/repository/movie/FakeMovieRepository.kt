package leopoldoromacho.com.udemy9thdec20.data.repository.movie

import leopoldoromacho.com.udemy9thdec20.data.model.movie.Movie
import leopoldoromacho.com.udemy9thdec20.domain.repository.MovieRepository

class FakeMovieRepository: MovieRepository {

    private val movies = mutableListOf<Movie>()

    init {
        movies.add(Movie(1, "overview 1", "path 1", "date1", "title 1"))
        movies.add(Movie(2, "overview 2", "path 2", "date2", "title 2"))
    }

    override suspend fun getMovies(): List<Movie>? {
        return movies
    }

    override suspend fun updateMovies(): List<Movie>? {
        movies.clear()
        movies.add(Movie(3, "overview 3", "path 3", "date3", "title 3"))
        movies.add(Movie(4, "overview 4", "path 4", "date4", "title 4"))
        return movies
    }

}