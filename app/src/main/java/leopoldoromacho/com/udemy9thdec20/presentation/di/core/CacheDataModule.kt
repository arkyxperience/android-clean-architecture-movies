package leopoldoromacho.com.udemy9thdec20.presentation.di.core

import dagger.Module
import dagger.Provides
import leopoldoromacho.com.udemy9thdec20.data.repository.movie.datasource.MovieCacheDataSource
import leopoldoromacho.com.udemy9thdec20.data.repository.movie.datasourceimpl.MovieCacheDataSourceImpl
import javax.inject.Singleton


@Module
class CacheDataModule {
    @Singleton
    @Provides
    fun provideMovieCacheDataSource(): MovieCacheDataSource {
        return MovieCacheDataSourceImpl()
    }

}