package leopoldoromacho.com.udemy9thdec20.presentation.tv

import androidx.lifecycle.ViewModel
import androidx.lifecycle.liveData
import leopoldoromacho.com.udemy9thdec20.domain.usecase.GetTvShowsUseCase

class TvShowViewModel(
    private val getTvShowsUseCase: GetTvShowsUseCase
): ViewModel() {

    fun getTvShows() = liveData {
        val list = getTvShowsUseCase.execute()
        emit(list)
    }


}