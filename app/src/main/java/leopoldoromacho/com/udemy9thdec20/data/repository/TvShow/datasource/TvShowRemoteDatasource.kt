package leopoldoromacho.com.udemy9thdec20.data.repository.TvShow.datasource

import leopoldoromacho.com.udemy9thdec20.data.model.tvShowList.TvShowList
import retrofit2.Response

interface TvShowRemoteDatasource {
    suspend fun getTvShows(): Response<TvShowList>
}