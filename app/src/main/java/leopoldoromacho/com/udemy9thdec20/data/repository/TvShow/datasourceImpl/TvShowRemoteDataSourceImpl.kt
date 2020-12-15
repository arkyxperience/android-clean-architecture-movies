package leopoldoromacho.com.udemy9thdec20.data.repository.TvShow.datasourceImpl

import leopoldoromacho.com.udemy9thdec20.data.api.TMDBService
import leopoldoromacho.com.udemy9thdec20.data.model.tvShowList.TvShowList
import leopoldoromacho.com.udemy9thdec20.data.repository.TvShow.datasource.TvShowRemoteDatasource
import retrofit2.Response

class TvShowRemoteDataSourceImpl(
    private val tmdbService: TMDBService,
    private val apiKey:String
): TvShowRemoteDatasource {
    override suspend fun getTvShows()
            : Response<TvShowList> = tmdbService.getPopularTvShows(apiKey)

}
