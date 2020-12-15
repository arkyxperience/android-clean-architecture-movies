package leopoldoromacho.com.udemy9thdec20.presentation.di.tvshow

import dagger.Subcomponent
import leopoldoromacho.com.udemy9thdec20.presentation.tv.TvShowActivity

@TvShowScope
@Subcomponent(modules = [TvShowModule::class])
interface TvShowSubComponent {
    fun inject(tvShowActivity: TvShowActivity)

    @Subcomponent.Factory
    interface Factory{
        fun create(): TvShowSubComponent
    }

}

