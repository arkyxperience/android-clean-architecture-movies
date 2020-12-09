package leopoldoromacho.com.udemy9thdec20.domain.usecase

import leopoldoromacho.com.udemy9thdec20.data.model.artist.Artist
import leopoldoromacho.com.udemy9thdec20.domain.repository.ArtistRepository

class GetArtistsUseCase(private val artistRepository: ArtistRepository) {
    suspend fun execute():List<Artist>? = artistRepository.getArtists()
}