package leopoldoromacho.com.udemy9thdec20.presentation.di.core

import dagger.Component
import leopoldoromacho.com.udemy9thdec20.presentation.di.movie.MovieSubComponent
import leopoldoromacho.com.udemy9thdec20.presentation.di.tvshow.TvShowSubComponent
import javax.inject.Singleton

@Singleton
@Component(modules = [
    AppModule::class,
    NetModule::class,
    DataBaseModule::class,
    UseCaseModule::class,
    RepositoryModule::class,
    RemoteDataModule::class,
    LocalDataModule::class,
    CacheDataModule::class
])

interface AppComponent {

    fun movieSubComponent(): MovieSubComponent.Factory
    fun tvShowSubComponent(): TvShowSubComponent.Factory

}