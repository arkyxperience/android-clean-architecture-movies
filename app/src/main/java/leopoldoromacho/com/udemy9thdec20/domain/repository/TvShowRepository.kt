package leopoldoromacho.com.udemy9thdec20.domain.repository

import leopoldoromacho.com.udemy9thdec20.data.model.TvShow.TvShow

interface TvShowRepository {
    suspend fun getTvShows():List<TvShow>?
    suspend fun updateTvShows():List<TvShow>?
}

