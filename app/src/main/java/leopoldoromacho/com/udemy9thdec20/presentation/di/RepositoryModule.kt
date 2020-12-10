package leopoldoromacho.com.udemy9thdec20.presentation.di


import dagger.Module
import dagger.Provides
import leopoldoromacho.com.udemy9thdec20.data.repository.movie.MovieRepositoryImpl
import leopoldoromacho.com.udemy9thdec20.data.repository.movie.datasource.MovieCacheDataSource
import leopoldoromacho.com.udemy9thdec20.data.repository.movie.datasource.MovieLocalDataSource
import leopoldoromacho.com.udemy9thdec20.data.repository.movie.datasource.MovieRemoteDatasource
import leopoldoromacho.com.udemy9thdec20.domain.repository.MovieRepository
import javax.inject.Singleton



@Module
class RepositoryModule {

    @Provides
    @Singleton
    fun provideMovieRepository(
        movieRemoteDatasource: MovieRemoteDatasource,
        movieLocalDataSource: MovieLocalDataSource,
        movieCacheDataSource: MovieCacheDataSource
    ): MovieRepository {

        return MovieRepositoryImpl(
            movieRemoteDatasource,
            movieLocalDataSource,
            movieCacheDataSource
        )
    }
}