package leopoldoromacho.com.udemy9thdec20.presentation.movie

import androidx.lifecycle.ViewModel
import androidx.lifecycle.liveData
import leopoldoromacho.com.udemy9thdec20.domain.usecase.GetMoviesUseCase
import leopoldoromacho.com.udemy9thdec20.domain.usecase.UpdateMoviesUseCase

class MovieViewModel(
    private val getMoviesUseCase: GetMoviesUseCase,
    private val updateMoviesUseCase: UpdateMoviesUseCase
): ViewModel() {

    fun getMovies() = liveData {
        val movieList = getMoviesUseCase.execute()
        emit(movieList)
    }

    fun updateMovies() = liveData {
        val movieList = updateMoviesUseCase.execute()
        emit(movieList)
    }

}