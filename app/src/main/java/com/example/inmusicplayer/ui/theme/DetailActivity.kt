package com.example.inmusicplayer.ui.theme

import android.annotation.SuppressLint
import android.os.Bundle
import android.widget.*
import androidx.appcompat.app.AppCompatActivity
import com.example.inmusicplayer.MainActivity
import com.example.inmusicplayer.R

class DetailActivity : AppCompatActivity() {

    private lateinit var btnAverage: Button
    private lateinit var btnBack: Button
    private lateinit var listView: ListView
    private lateinit var tvAverage: TextView

    @SuppressLint("SetTextI18n", "MissingInflatedId")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_detail)

        btnAverage = findViewById(R.id.btnAverage)
        btnBack = findViewById(R.id.btnBack)
        listView = findViewById(R.id.songListView)
        tvAverage = findViewById(R.id.tvAverage)


        listView.adapter = SongAdapter(this)

        btnAverage.setOnClickListener {
            val avg = MainActivity.ratings.average()
            tvAverage.text = "Average Rating: %.2f".format(avg)
        }

        btnBack.setOnClickListener {
            finish()
        }
    }
}