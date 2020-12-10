package leopoldoromacho.com.udemy9thdec20.presentation.di.core


import dagger.Module
import dagger.Provides
import leopoldoromacho.com.udemy9thdec20.data.repository.movie.MovieRepositoryImpl
import leopoldoromacho.com.udemy9thdec20.data.repository.movie.datasource.MovieCacheDataSource
import leopoldoromacho.com.udemy9thdec20.data.repository.movie.datasource.MovieLocalDataSource
import leopoldoromacho.com.udemy9thdec20.data.repository.movie.datasource.MovieRemoteDataSource
import leopoldoromacho.com.udemy9thdec20.domain.repository.MovieRepository
import javax.inject.Singleton



@Module
class RepositoryModule {

    @Provides
    @Singleton
    fun provideMovieRepository(
        movieRemoteDataSource: MovieRemoteDataSource,
        movieLocalDataSource: MovieLocalDataSource,
        movieCacheDataSource: MovieCacheDataSource
    ): MovieRepository {

        return MovieRepositoryImpl(
            movieRemoteDataSource,
            movieLocalDataSource,
            movieCacheDataSource
        )
    }
}