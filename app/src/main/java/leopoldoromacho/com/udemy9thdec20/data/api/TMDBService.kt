package leopoldoromacho.com.udemy9thdec20.data.api


import leopoldoromacho.com.udemy9thdec20.data.model.movie.MovieList
import retrofit2.Response
import retrofit2.http.GET
import retrofit2.http.Query

interface TMDBService {


    @GET("movie/popular")
    suspend fun getPopularMovies(
            @Query(
                    "api_key"
            ) apiKey: String
    ): Response<MovieList>



}