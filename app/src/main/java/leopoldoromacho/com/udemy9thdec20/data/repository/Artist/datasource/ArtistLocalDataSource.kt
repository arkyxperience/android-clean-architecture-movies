package leopoldoromacho.com.udemy9thdec20.data.repository.artist.datasource

import leopoldoromacho.com.udemy9thdec20.data.model.artist.Artist


interface ArtistLocalDataSource {
  suspend fun getArtistsFromDB():List<Artist>
  suspend fun saveArtistsToDB(artists:List<Artist>)
  suspend fun clearAll()
}