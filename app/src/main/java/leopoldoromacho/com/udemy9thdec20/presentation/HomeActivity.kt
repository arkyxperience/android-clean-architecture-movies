package leopoldoromacho.com.udemy9thdec20.presentation

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import androidx.databinding.DataBindingUtil
import leopoldoromacho.com.udemy9thdec20.R
import leopoldoromacho.com.udemy9thdec20.databinding.ActivityHomeBinding
import leopoldoromacho.com.udemy9thdec20.presentation.movie.MovieActivity
import leopoldoromacho.com.udemy9thdec20.presentation.tvShows.TvShowActivity

class HomeActivity : AppCompatActivity() {
    private lateinit var binding: ActivityHomeBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        binding = DataBindingUtil.setContentView(this, R.layout.activity_home)

        setUpButtonActionForMovies()

        setUpButtonActionForTvShows()

        setUpButtonActionForArtists()
    }


    private fun setUpButtonActionForMovies() {
        binding.movieButton.setOnClickListener {
            val intent = Intent(this, MovieActivity::class.java)
            startActivity(intent)
        }
    }

    private fun setUpButtonActionForArtists() {
        binding.artistsButton.setOnClickListener {
            val text = "Artists ->Stay tuned - coming next!"
            val duration = Toast.LENGTH_SHORT
            val toast = Toast.makeText(applicationContext, text, duration)
            toast.show()
        }
    }

    private fun setUpButtonActionForTvShows() {
        binding.tvShowsButton.setOnClickListener {
            val intent = Intent(this, TvShowActivity::class.java)
            startActivity(intent)
        }
    }
}