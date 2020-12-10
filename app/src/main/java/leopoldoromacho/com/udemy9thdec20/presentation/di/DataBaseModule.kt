package leopoldoromacho.com.udemy9thdec20.presentation.di

import android.content.Context
import androidx.room.Room
import dagger.Module
import dagger.Provides
import leopoldoromacho.com.udemy9thdec20.data.db.ArtistDao
import leopoldoromacho.com.udemy9thdec20.data.db.MovieDao
import leopoldoromacho.com.udemy9thdec20.data.db.TMDBDatabase
import leopoldoromacho.com.udemy9thdec20.data.db.TvShowDao
import javax.inject.Singleton

@Module
class DataBaseModule {

    @Singleton
    @Provides
    fun provideMovieDataBase(context: Context):TMDBDatabase {
        return Room.databaseBuilder(context, TMDBDatabase::class.java, "tmdbclient")
        .build()
    }

    @Singleton
    @Provides
    fun provideMovieDao(tmdbDatabase: TMDBDatabase): MovieDao {
        return tmdbDatabase.movieDao()
    }

    @Singleton
    @Provides
    fun provideTvShowDao(tmdbDatabase: TMDBDatabase): TvShowDao {
        return tmdbDatabase.tvShowDao()
    }


    @Singleton
    @Provides
    fun provideArtistDao(tmdbDatabase: TMDBDatabase): ArtistDao {
        return tmdbDatabase.artistDao()
    }
}