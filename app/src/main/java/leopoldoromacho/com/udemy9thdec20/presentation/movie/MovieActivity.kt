package leopoldoromacho.com.udemy9thdec20.presentation.movie

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.view.Menu
import android.view.MenuInflater
import android.view.View
import android.widget.Toast
import androidx.databinding.DataBindingUtil
import androidx.lifecycle.Observer
import androidx.lifecycle.ViewModelProvider
import androidx.recyclerview.widget.LinearLayoutManager
import leopoldoromacho.com.udemy9thdec20.R
import leopoldoromacho.com.udemy9thdec20.databinding.ActivityHomeBinding
import leopoldoromacho.com.udemy9thdec20.databinding.ActivityMovieBinding
import leopoldoromacho.com.udemy9thdec20.presentation.di.core.Injector
import leopoldoromacho.com.udemy9thdec20.presentation.movie.MovieViewModel
import leopoldoromacho.com.udemy9thdec20.R.menu.update
import javax.inject.Inject

class MovieActivity : AppCompatActivity() {

    @Inject
    lateinit var factory: MovieViewModelFactory

    private lateinit var movieViewModel: MovieViewModel
    private lateinit var binding:ActivityMovieBinding
    private lateinit var adapter: MovieAdapter

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        binding = DataBindingUtil.setContentView(this,R.layout.activity_movie)
        (application as Injector).createMovieSubComponent().inject(this)

        movieViewModel = ViewModelProvider(this,factory).get(MovieViewModel::class.java)

        // triggerASingleMovieRequestForTestingPurposes()

        initRecyclerView()
    }

    override fun onCreateOptionsMenu(menu: Menu?): Boolean {
        val inflater: MenuInflater = menuInflater
        inflater.inflate(R.menu.update, menu)
        return true
    }

    private fun initRecyclerView(){
        binding.movieRecyclerView.layoutManager = LinearLayoutManager(this)
        adapter = MovieAdapter()
        binding.movieRecyclerView.adapter = adapter
        displayPopularMovies()
    }

    private fun displayPopularMovies(){
        binding.movieProgressBar.visibility = View.VISIBLE
        val responseLiveData = movieViewModel.getMovies()
        responseLiveData.observe(this, Observer {
            if(it!=null){
                adapter.setList(it)
                adapter.notifyDataSetChanged()
                binding.movieProgressBar.visibility = View.GONE
            }else{
                binding.movieProgressBar.visibility = View.GONE
                Toast.makeText(applicationContext,"No data available",Toast.LENGTH_LONG).show()
            }
        })
    }

    private fun triggerASingleMovieRequestForTestingPurposes() {
        val responseLiveData = movieViewModel.getMovies()
        responseLiveData.observe(this, Observer {

            val listOfMovies = it
            val duration = Toast.LENGTH_SHORT
            var text = ""

            if (listOfMovies != null) {
                text = "List of movies received. Size: " + listOfMovies.size
            }
            else {
                text = "The object received was null"
            }
            val toast = Toast.makeText(applicationContext, text, duration)
            toast.show()

        })
    }
}

