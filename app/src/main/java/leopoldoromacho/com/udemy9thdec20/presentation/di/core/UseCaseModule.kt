package leopoldoromacho.com.udemy9thdec20.presentation.di.core

import dagger.Module
import dagger.Provides
import leopoldoromacho.com.udemy9thdec20.domain.repository.MovieRepository
import leopoldoromacho.com.udemy9thdec20.domain.usecase.GetMoviesUseCase
import leopoldoromacho.com.udemy9thdec20.domain.usecase.UpdateMoviesUseCase

@Module
class UseCaseModule {

    @Provides
    fun provideGetMovieUseCase(movieRepository: MovieRepository): GetMoviesUseCase {
        return GetMoviesUseCase(movieRepository)
    }
    @Provides
    fun provideUpdateMovieUseCase(movieRepository: MovieRepository): UpdateMoviesUseCase{
        return UpdateMoviesUseCase(movieRepository)
    }
}