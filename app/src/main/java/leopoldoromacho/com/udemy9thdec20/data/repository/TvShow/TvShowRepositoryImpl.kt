package leopoldoromacho.com.udemy9thdec20.data.repository.TvShow

import android.util.Log
import leopoldoromacho.com.udemy9thdec20.data.model.TvShow.TvShow
import leopoldoromacho.com.udemy9thdec20.data.repository.TvShow.datasource.TvShowRemoteDatasource
import leopoldoromacho.com.udemy9thdec20.domain.repository.TvShowRepository
import java.lang.Exception

class TvShowRepositoryImpl(
    private val tvShowRemoteDatasource: TvShowRemoteDatasource,
) : TvShowRepository {
    override suspend fun getTvShows(): List<TvShow>? {
        return getTvShowsFromAPI()
    }

    suspend fun updateTvShows(): List<TvShow>? {
        val newListOfTvShows = getTvShowsFromAPI()
        return newListOfTvShows
    }

    suspend fun getTvShowsFromAPI(): List<TvShow> {
        lateinit var tvShowList: List<TvShow>
        try {
            val response = tvShowRemoteDatasource.getTvShows()
            val body = response.body()
            if(body!=null){
                tvShowList = body.tvShows
            }
        } catch (exception: Exception) {
            Log.i("MyTag", exception.message.toString())
        }
        return tvShowList
    }


}