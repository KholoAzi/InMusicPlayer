// Student Number:ST10461558
// Full Name: Kholofelo Tiisetso Nokuthula Moteno

package com.example.

import android.annotation.SuppressLint
import android.app.AlertDialog
import android.content.Intent
import android.os.Bundle
import android.widget.*
import androidx.appcompat.app.AppCompatActivity
import com.example.inmusicplayer.R
import com.example.inmusicplayer.ui.theme.DetailActivity

class MainActivity : AppCompatActivity() {

    companion object {
        val songTitles = ArrayList<String>(listOf("Kum Nakum", "Too Sweet", "Luther", "Cloud Nine"))
        val artists = ArrayList<String>(listOf("Ringo Madlingozi", "The Macarons", "Kendrick Lamar", "DJ Skies"))
        val ratings = ArrayList<Int>(listOf(5, 3, 4, 2))
        val comments = ArrayList<String>(listOf("Memories", "Best Love Song", "Rap", "Chill mood"))
        val images = ArrayList<Int>(listOf(
            R.drawable.song1, R.drawable.song2, R.drawable.song3, R.drawable.song4
        ))
    }

    private lateinit var btnAdd: Button
    private lateinit var btnDetails: Button
    private lateinit var btnExit: Button

    @SuppressLint("MissingInflatedId")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        btnAdd = findViewById(R.id.btnAdd)
        btnDetails = findViewById(R.id.btnDetails)
        btnExit = findViewById(R.id.btnExit)

        btnAdd.setOnClickListener { showAddDialog() }
        btnDetails.setOnClickListener {
            startActivity(Intent(this, DetailActivity::class.java))
        }
        btnExit.setOnClickListener { finishAffinity() }
    }

    private fun showAddDialog() {
        val dialogLayout = layoutInflater.inflate(R.layout.dialog_add_song, null)
        val edtTitle = dialogLayout.findViewById<EditText>(R.id.edtSongTitle)
        val edtArtist = dialogLayout.findViewById<EditText>(R.id.edtArtist)
        val edtRating = dialogLayout.findViewById<EditText>(R.id.edtRating)
        val edtComment = dialogLayout.findViewById<EditText>(R.id.edtComment)

        AlertDialog.Builder(this)
            .setTitle("Add New Song")
            .setView(dialogLayout)
            .setPositiveButton("Add") { _, _ ->
                val title = edtTitle.text.toString()
                val artist = edtArtist.text.toString()
                val ratingText = edtRating.text.toString()
                val comment = edtComment.text.toString()

                if (title.isBlank() || artist.isBlank() || ratingText.isBlank() || comment.isBlank()) {
                    Toast.makeText(this, "All fields are required", Toast.LENGTH_SHORT).show()
                    return@setPositiveButton
                }

                try {
                    val rating = ratingText.toInt()
                    if (rating in 1..5) {
                        songTitles.add(title)
                        artists.add(artist)
                        ratings.add(rating)
                        comments.add(comment)
                        images.add(R.drawable.song1)
                        Toast.makeText(this, "Song added", Toast.LENGTH_SHORT).show()
                    } else {
                        Toast.makeText(this, "Rating must be between 1 and 5", Toast.LENGTH_SHORT).show()
                    }
                } catch (e: Exception) {
                    Toast.makeText(this, "Rating must be a number", Toast.LENGTH_SHORT).show()
                }
            }
            .setNegativeButton("Cancel", null)
            .show()
    }
}