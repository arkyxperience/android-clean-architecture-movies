package leopoldoromacho.com.udemy9thdec20.data.datasource

import leopoldoromacho.com.udemy9thdec20.data.model.movie.Movie

class MovieCacheDataSourceImpl: MovieCacheDataSource {

    private val movieList = ArrayList<Movie>()

    override suspend fun getMoviesFromCache(): List<Movie> {
        TODO("Not yet implemented")
    }

    override suspend fun saveMoviesToCache(movies: List<Movie>) {
        movieList.clear()
        movieList = ArrayList(movies)
    }

}