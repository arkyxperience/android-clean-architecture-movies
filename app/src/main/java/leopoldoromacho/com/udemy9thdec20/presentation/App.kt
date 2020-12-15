package leopoldoromacho.com.udemy9thdec20.presentation

import android.app.Application
import leopoldoromacho.com.udemy9thdec20.BuildConfig
import leopoldoromacho.com.udemy9thdec20.presentation.di.Injector
import leopoldoromacho.com.udemy9thdec20.presentation.di.core.*
import leopoldoromacho.com.udemy9thdec20.presentation.di.movie.MovieSubComponent
import leopoldoromacho.com.udemy9thdec20.presentation.di.tvshow.TvShowSubComponent

class App : Application(), Injector {
    private lateinit var appComponent: AppComponent

    override fun onCreate() {
        super.onCreate()
        appComponent = DaggerAppComponent.builder()
            .appModule(AppModule(applicationContext))
            .netModule(NetModule(BuildConfig.BASE_URL))
            .remoteDataModule(RemoteDataModule(BuildConfig.API_KEY))
            .build()

    }

    override fun createMovieSubComponent(): MovieSubComponent {
        return appComponent.movieSubComponent().create()
    }

    override fun createTvShowSubComponent(): TvShowSubComponent {
        return appComponent.tvShowSubComponent().create()
    }


}