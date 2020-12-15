package leopoldoromacho.com.udemy9thdec20.presentation.di

import leopoldoromacho.com.udemy9thdec20.presentation.di.movie.MovieSubComponent
import leopoldoromacho.com.udemy9thdec20.presentation.di.tvshow.TvShowSubComponent

interface Injector {
    fun createMovieSubComponent(): MovieSubComponent
    fun createTvShowSubComponent(): TvShowSubComponent
    //fun createArtistSubComponent():ArtistSubComponent
}