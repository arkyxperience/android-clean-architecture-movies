package leopoldoromacho.com.udemy9thdec20.presentation.di.core

import dagger.Module
import dagger.Provides
import leopoldoromacho.com.udemy9thdec20.data.api.TMDBService
import leopoldoromacho.com.udemy9thdec20.data.repository.movie.datasource.MovieRemoteDataSource
import leopoldoromacho.com.udemy9thdec20.data.repository.movie.datasourceimpl.MovieRemoteDataSourceImpl
import javax.inject.Singleton

@Module
class RemoteDataModule(private val apiKey: String) {
    @Singleton
    @Provides
    fun provideMovieRemoteDataSource(tmdbService: TMDBService): MovieRemoteDataSource {
        return MovieRemoteDataSourceImpl (
            tmdbService, apiKey
        )
    }

}