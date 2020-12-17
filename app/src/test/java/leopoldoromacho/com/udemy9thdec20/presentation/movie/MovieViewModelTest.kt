package leopoldoromacho.com.udemy9thdec20.presentation.movie

import androidx.arch.core.executor.testing.InstantTaskExecutorRule
import androidx.test.ext.junit.runners.AndroidJUnit4

import leopoldoromacho.com.udemy9thdec20.data.model.movie.Movie
import leopoldoromacho.com.udemy9thdec20.data.repository.movie.FakeMovieRepository
import leopoldoromacho.com.udemy9thdec20.domain.usecase.GetMoviesUseCase
import leopoldoromacho.com.udemy9thdec20.domain.usecase.UpdateMoviesUseCase

import org.junit.Before
import org.junit.Rule
import org.junit.Test
import org.junit.runner.RunWith
import com.google.common.truth.Truth.assertThat


// this will help to run simulated android code
@RunWith(AndroidJUnit4::class)
class MovieViewModelTest {

    // swaps the background executor used by the Architecture Components with a different one which executes each task synchronously
    @get:Rule
    var instantTaskExecutorRule = InstantTaskExecutorRule()

    private lateinit var viewModel: MovieViewModel

    @Before
    fun setup(){
        val fakeMovieRepository = FakeMovieRepository()
        val getMoviesUseCase = GetMoviesUseCase(fakeMovieRepository)
        val updateMoviesUseCase = UpdateMoviesUseCase(fakeMovieRepository)
        viewModel = MovieViewModel(getMoviesUseCase, updateMoviesUseCase)
    }

    @Test
    fun testThat_GetMovies_Return_A_Valid_List() {
        val expectedMovies = mutableListOf<Movie>()
        expectedMovies.add(Movie(1, "overview 1", "path 1", "date1", "title 1"))
        expectedMovies.add(Movie(2, "overview 2", "path 2", "date2", "title 2"))

        // we need to convert LiveData to normal data
        val resultMovies = viewModel.getMovies().getOrAwaitValue()

        // import com.google.common.truth.Truth.assertThat - is required
        assertThat(resultMovies).isEqualTo(expectedMovies)
    }


    fun testThat_UpdateMovies_Return_An_Updated_List() {
        val expectedMovies = mutableListOf<Movie>()
        expectedMovies.add(Movie(3, "overview 3", "path 3", "date3", "title 3"))
        expectedMovies.add(Movie(4, "overview 4", "path 4", "date4", "title 4"))

        val resultMovies = viewModel.updateMovies().getOrAwaitValue()

        assertThat(resultMovies).isEqualTo(expectedMovies)
    }
}