package leopoldoromacho.com.udemy9thdec20.data.model.tvShowList



import com.google.gson.annotations.SerializedName
import leopoldoromacho.com.udemy9thdec20.data.model.TvShow.TvShow

data class TvShowList(

    @SerializedName("results")
    val tvShows: List<TvShow>
)