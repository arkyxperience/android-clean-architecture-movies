package leopoldoromacho.com.udemy9thdec20.presentation.di.core
import dagger.Module
import dagger.Provides
import leopoldoromacho.com.udemy9thdec20.data.db.MovieDao
import leopoldoromacho.com.udemy9thdec20.data.repository.movie.datasourceimpl.MovieLocalDataSourceImpl
import leopoldoromacho.com.udemy9thdec20.data.repository.movie.datasource.MovieLocalDataSource
import javax.inject.Singleton


@Module
class LocalDataModule {

    @Singleton
    @Provides
    fun provideMovieLocalDataSource(movieDao: MovieDao):MovieLocalDataSource{
        return MovieLocalDataSourceImpl(movieDao)
    }


}