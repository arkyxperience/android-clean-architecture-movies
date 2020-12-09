package leopoldoromacho.com.udemy9thdec20.domain.repository

import leopoldoromacho.com.udemy9thdec20.data.model.artist.Artist

interface ArtistRepository {
    suspend fun getArtists():List<Artist>?
    suspend fun updateArtists():List<Artist>?
}