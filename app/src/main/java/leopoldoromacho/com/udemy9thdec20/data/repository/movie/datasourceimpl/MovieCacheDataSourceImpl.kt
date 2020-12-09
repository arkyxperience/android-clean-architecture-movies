package leopoldoromacho.com.udemy9thdec20.data.repository.movie.datasourceimpl

import leopoldoromacho.com.udemy9thdec20.data.model.movie.Movie
import leopoldoromacho.com.udemy9thdec20.data.repository.movie.datasource.MovieCacheDataSource

class MovieCacheDataSourceImpl: MovieCacheDataSource {

    private var movieList = ArrayList<Movie>()

    override suspend fun getMoviesFromCache(): List<Movie> {
        return movieList
    }

    override suspend fun saveMoviesToCache(movies: List<Movie>) {
        movieList.clear()
        movieList = ArrayList(movies)
    }

}