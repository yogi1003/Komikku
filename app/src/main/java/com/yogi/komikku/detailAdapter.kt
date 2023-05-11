package com.yogi.komikku

import Person
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import java.util.ArrayList

class detailAdapter(private val persons: ArrayList<Person>):
    RecyclerView.Adapter<detailAdapter.ViewHolder>() {

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
        val view = LayoutInflater.from(parent.context)
            .inflate(R.layout.item_chapter, parent, false)
        return ViewHolder(view)
    }

    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
        val person = persons[position]
        holder.tvEpisode.text = person.chapter.toString()
    }

    override fun getItemCount(): Int {
        return persons.size
    }
    inner class ViewHolder(view: View) : RecyclerView.ViewHolder(view) {
        val tvEpisode: TextView = view.findViewById(R.id.tvEpisode)
    }
}
