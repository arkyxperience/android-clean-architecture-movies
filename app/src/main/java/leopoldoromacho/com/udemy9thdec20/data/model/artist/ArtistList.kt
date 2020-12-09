package leopoldoromacho.com.udemy9thdec20.data.model.artist

import com.google.gson.annotations.SerializedName

data class ArtistList(

    @SerializedName("results")
    val artists: List<Artist>

)