package leopoldoromacho.com.udemy9thdec20.presentation.di.core

import dagger.Module
import dagger.Provides
import leopoldoromacho.com.udemy9thdec20.domain.repository.MovieRepository
import leopoldoromacho.com.udemy9thdec20.domain.repository.TvShowRepository
import leopoldoromacho.com.udemy9thdec20.domain.usecase.GetMoviesUseCase
import leopoldoromacho.com.udemy9thdec20.domain.usecase.GetTvShowsUseCase
import leopoldoromacho.com.udemy9thdec20.domain.usecase.UpdateMoviesUseCase

@Module
class UseCaseModule {

    // movies
    @Provides
    fun provideGetMovieUseCase(movieRepository: MovieRepository): GetMoviesUseCase {
        return GetMoviesUseCase(movieRepository)
    }
    @Provides
    fun provideUpdateMovieUseCase(movieRepository: MovieRepository): UpdateMoviesUseCase{
        return UpdateMoviesUseCase(movieRepository)
    }


    // tv shows
    @Provides
    fun provideGetTvShowUseCase(tvShowRepository: TvShowRepository): GetTvShowsUseCase {
        return GetTvShowsUseCase(tvShowRepository)
    }
}