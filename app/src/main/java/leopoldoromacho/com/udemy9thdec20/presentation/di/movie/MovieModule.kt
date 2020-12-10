package leopoldoromacho.com.udemy9thdec20.presentation.di.movie

import dagger.Module
import dagger.Provides
import leopoldoromacho.com.udemy9thdec20.domain.usecase.GetMoviesUseCase
import leopoldoromacho.com.udemy9thdec20.presentation.movie.MovieViewModelFactory
import leopoldoromacho.com.udemy9thdec20.domain.usecase.UpdateMoviesUseCase

@Module
class MovieModule {
    @MovieScope
    @Provides
    fun provideMovieViewModelFactory(
            getMoviesUseCase: GetMoviesUseCase,
            UpdateMoviesUseCase: UpdateMoviesUseCase
    ): MovieViewModelFactory {
        return MovieViewModelFactory(
                getMoviesUseCase,
                UpdateMoviesUseCase
        )
    }

}