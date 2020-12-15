package leopoldoromacho.com.udemy9thdec20.presentation.di.tvshow

import dagger.Module
import dagger.Provides
import leopoldoromacho.com.udemy9thdec20.domain.usecase.GetTvShowsUseCase
import leopoldoromacho.com.udemy9thdec20.presentation.tv.TvShowViewModelFactory


@Module
class TvShowModule {
    @TvShowScope
    @Provides
    fun provideTvShowViewModelFactory(
        getTvShowsUseCase: GetTvShowsUseCase
    ): TvShowViewModelFactory {
        return TvShowViewModelFactory(
            getTvShowsUseCase
        )
    }

}