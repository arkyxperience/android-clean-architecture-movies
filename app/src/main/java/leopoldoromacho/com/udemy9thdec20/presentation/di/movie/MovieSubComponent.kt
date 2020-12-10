package leopoldoromacho.com.udemy9thdec20.presentation.di.movie


import dagger.Subcomponent
import leopoldoromacho.com.udemy9thdec20.presentation.movie.MovieActivity

@MovieScope
@Subcomponent(modules = [MovieModule::class])
interface MovieSubComponent {
    fun inject(movieActivity: MovieActivity)

    @Subcomponent.Factory
    interface Factory{
        fun create():MovieSubComponent
    }

}