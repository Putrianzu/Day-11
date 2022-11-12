package com.chirikualii.materidb.ui.search

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import androidx.core.widget.doOnTextChanged
import com.chirikualii.materidb.R
import com.chirikualii.materidb.data.model.Movie
import com.chirikualii.materidb.databinding.ActivitySearchBinding
import com.chirikualii.materidb.ui.adapter.MovieListAdapter

class SearchActivity : AppCompatActivity() {

    private lateinit var binding: ActivitySearchBinding
    private lateinit var listAdapter : MovieListAdapter
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivitySearchBinding.inflate(layoutInflater)
        setContentView(binding.root)

        listAdapter = MovieListAdapter()
        binding.rvMovie.adapter = listAdapter

        listAdapter.addItem(
            listOf(
                Movie(
                    movieId = "ee",
                    title = "aaa",
                    releaseDate = "bbb",
                    imagePoster = "ccc",
                    backdrop = "ddd",
                    overview = "eee",
                    bookmark = 1),

                Movie(
                    movieId = "ee",
                    title = "aaa",
                    releaseDate = "bbb",
                    imagePoster = "ccc",
                    backdrop = "ddd",
                    overview = "eee",
                    bookmark = 1),

                Movie(
                    movieId = "ee",
                    title = "aaa",
                    releaseDate = "bbb",
                    imagePoster = "ccc",
                    backdrop = "ddd",
                    overview = "eee",
                    bookmark = 1),
            )
        )

        binding.etSearch.doOnTextChanged { text, _, _, _ ->
            Toast.makeText(this, "Searching ${text}", Toast.LENGTH_SHORT).show()
        }
    }
}