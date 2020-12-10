package leopoldoromacho.com.udemy9thdec20.presentation.di.core

import android.content.Context
import dagger.Module
import dagger.Provides
import leopoldoromacho.com.udemy9thdec20.presentation.di.movie.MovieSubComponent
import javax.inject.Singleton

@Module(subcomponents = [MovieSubComponent::class])
class AppModule(private val context: Context) {

    @Singleton
    @Provides
    fun provideApplicationContext():Context{
        return context.applicationContext
    }

}