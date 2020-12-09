package leopoldoromacho.com.udemy9thdec20.data.db

import androidx.room.Database
import androidx.room.RoomDatabase

import leopoldoromacho.com.udemy9thdec20.data.model.TvShow.TvShow
import leopoldoromacho.com.udemy9thdec20.data.model.artist.Artist
import leopoldoromacho.com.udemy9thdec20.data.model.movie.Movie

@Database(entities = [Movie::class, TvShow::class, Artist::class],
version = 1,
exportSchema = false
)

abstract class TMDBDatabase: RoomDatabase() {
    abstract fun movieDao(): MovieDao
    abstract fun tvShowDao(): TvShowDao
    abstract fun artistDao(): ArtistDao
}