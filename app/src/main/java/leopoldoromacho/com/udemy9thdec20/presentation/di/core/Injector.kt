package leopoldoromacho.com.udemy9thdec20.presentation.di.core

import leopoldoromacho.com.udemy9thdec20.presentation.di.movie.MovieSubComponent

interface Injector {
    fun createMovieSubComponent(): MovieSubComponent
    //fun createTvShowSubComponent():TvShowSubComponent
    //fun createArtistSubComponent():ArtistSubComponent
}