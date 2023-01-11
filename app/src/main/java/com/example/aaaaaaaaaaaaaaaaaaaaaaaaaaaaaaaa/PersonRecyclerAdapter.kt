package com.example.aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.bumptech.glide.Glide

class PersonRecyclerAdapter(private val persons: List<Person>): RecyclerView.Adapter<PersonRecyclerAdapter.PersonViewHolder>() {
    inner class PersonViewHolder(itemView: View): RecyclerView.ViewHolder(itemView) {
        private val imageView: ImageView = itemView.findViewById(R.id.imageView)
        private val textView: TextView = itemView.findViewById(R.id.textView)
        private val textView2: TextView = itemView.findViewById(R.id.textView2)
        fun setData(person: Person) {

            Glide.with(itemView)
                .load(person.imageUrl)
                .into(imageView)

            textView.text = person.title

            textView2.text = person.description

        }
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): PersonViewHolder {
        val itemView = LayoutInflater.from(parent.context).inflate(R.layout.item_person, parent, false)
        return PersonViewHolder(itemView)
    }
    override fun onBindViewHolder(holder: PersonViewHolder, position: Int) {
        holder.setData(persons[position])

    }

    override fun getItemCount() = persons.size
}