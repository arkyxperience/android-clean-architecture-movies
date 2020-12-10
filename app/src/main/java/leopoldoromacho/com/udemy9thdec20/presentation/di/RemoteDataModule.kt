package leopoldoromacho.com.udemy9thdec20.presentation.di

import dagger.Module
import dagger.Provides
import leopoldoromacho.com.udemy9thdec20.data.api.TMDBService
import leopoldoromacho.com.udemy9thdec20.data.repository.movie.datasource.MovieRemoteDatasource
import leopoldoromacho.com.udemy9thdec20.data.repository.movie.datasourceimpl.MovieRemoteDataSourceImpl
import javax.inject.Singleton

@Module
class RemoteDataModule(private val apiKey: String) {
    @Singleton
    @Provides
    fun provideMovieRemoteDataSource(tmdbService: TMDBService): MovieRemoteDatasource {
        return MovieRemoteDataSourceImpl (
            tmdbService, apiKey
        )
    }

}