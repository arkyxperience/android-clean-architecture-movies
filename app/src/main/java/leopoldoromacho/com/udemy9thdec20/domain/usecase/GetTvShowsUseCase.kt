package leopoldoromacho.com.udemy9thdec20.domain.usecase

import leopoldoromacho.com.udemy9thdec20.data.model.TvShow.TvShow
import leopoldoromacho.com.udemy9thdec20.domain.repository.TvShowRepository

class GetTvShowsUseCase(private val tvShowRepository: TvShowRepository) {
    suspend fun execute():List<TvShow>?=tvShowRepository.getTvShows()
}