package com.example.aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ImageView
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView

class MainActivity : AppCompatActivity() {
    private lateinit var imageView: ImageView
    private lateinit var recyclerAdapter: PersonRecyclerAdapter
    private lateinit var recyclerview: RecyclerView
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        recyclerview =findViewById(R.id.recycle)
        recyclerAdapter = PersonRecyclerAdapter(getData())
        recyclerview.layoutManager = LinearLayoutManager(this)
        recyclerview.adapter = recyclerAdapter
    }
    private fun getData():List<Person>{
        val persons  = ArrayList<Person>()
        persons.add(Person(
            "https://s3-prod-europe.autonews.com/s3fs-public/Opel%20Astra.jpg",
            "nikusha",
            "gldaneli"
        ))
        persons.add(Person(
            "https://s3-prod-europe.autonews.com/s3fs-public/Opel%20Astra.jpg",
            "datoie",
            "mtawmindeli"
        ))
        persons.add(Person(
            "https://maxtondesign.com/eng_pl_Front-Splitter-V-2-Mercedes-Benz-CLS-AMG-Line-53AMG-C257-10226_6.jpg",
            "givia",
            "GOAT"
        ))
        persons.add(Person(
            "https://www.bmw.com.ge/content/dam/bmw/common/all-models/m-series/m5-sedan/2021/Overview/bmw-m5-cs-onepager-gallery-m5-cs-03-wallpaper.jpg",
            "ikako",
            "sololakeli"
        ))
        persons.add(Person(
            "https://i.insider.com/60f860760729770012b91c62?width=700",
            "alexa",
            "latvieli"
        ))
        persons.add(Person(
            "https://images.hive.blog/0x0/https://cdn.steemitimages.com/DQmX7g4WWHd7GMZKhdJLciCssG7n9UUxJfDyfb69HL51VMq/1200px-Ferrari_458_Italia_--_05-18-2011.jpg",
            "niko",
            "italieli"
        ))

        return persons
    }
}