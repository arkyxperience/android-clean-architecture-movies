package leopoldoromacho.com.udemy9thdec20.data.model

import androidx.room.Dao
import androidx.room.Insert
import androidx.room.OnConflictStrategy
import androidx.room.Query
import leopoldoromacho.com.udemy9thdec20.data.model.TvShow.TvShow

@Dao
interface TvShowDao {

    @Insert(onConflict = OnConflictStrategy.REPLACE)
    suspend fun saveTVShows(movies: List<TvShow>)

    @Query("DELETE FROM popular_tvShows")
    suspend fun deleteAllTVShows()

    @Query("SELECT * FROM popular_tvShows")
    suspend fun getAllTVShows():List<TvShow>
}