package com.example.inmusicplayer.ui.theme

import android.annotation.SuppressLint
import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.*
import androidx.core.content.ContextCompat
import com.example.inmusicplayer.MainActivity
import com.example.inmusicplayer.R


class SongAdapter(private val context: Context) : BaseAdapter() {
    override fun getCount() = MainActivity.songTitles.size
    override fun getItem(position: Int) = MainActivity.songTitles[position]
    override fun getItemId(position: Int) = position.toLong()

    @SuppressLint("ViewHolder", "MissingInflatedId", "SetTextI18n")
    override fun getView(position: Int, convertView: View?, parent: ViewGroup?): View {
        val view = LayoutInflater.from(context).inflate(R.layout.song_item, parent, false)

        val img = view.findViewById<ImageView>(R.id.songImage)
        val title = view.findViewById<TextView>(R.id.tvTitle)
        val artist = view.findViewById<TextView>(R.id.tvArtist)
        val rating = view.findViewById<TextView>(R.id.tvRating)
        val comment = view.findViewById<TextView>(R.id.tvComment)

        title.text = MainActivity.songTitles[position]
        artist.text = "Artist: ${MainActivity.artists[position]}"
        rating.text = "Rating: ${MainActivity.ratings[position]}"
        comment.text = "Comment: ${MainActivity.comments[position]}"
        img.setImageDrawable(ContextCompat.getDrawable(context, MainActivity.images[position]))

        return view
    }
}