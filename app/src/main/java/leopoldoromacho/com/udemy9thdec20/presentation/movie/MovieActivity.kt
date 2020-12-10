package leopoldoromacho.com.udemy9thdec20.presentation.movie

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.databinding.DataBindingUtil
import leopoldoromacho.com.udemy9thdec20.R
import leopoldoromacho.com.udemy9thdec20.databinding.ActivityHomeBinding

class MovieActivity : AppCompatActivity() {

    private lateinit var binding: ActivityHomeBinding
    override fun onCreate(savedInstanceState: Bundle?) {

        super.onCreate(savedInstanceState)

        binding = DataBindingUtil.setContentView(this, R.layout.activity_movie)
    }
}