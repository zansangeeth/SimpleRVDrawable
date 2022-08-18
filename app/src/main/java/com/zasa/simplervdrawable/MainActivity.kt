package com.zasa.simplervdrawable

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView

class MainActivity : AppCompatActivity() {

    private lateinit var rvNews : RecyclerView
    private lateinit var newsList : ArrayList<News>
    private lateinit var imageId : Array<Int>
    private lateinit var heading : Array<String>

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        imageId = arrayOf(
            R.drawable.a,
            R.drawable.b,
            R.drawable.c,
            R.drawable.d,
            R.drawable.e,
            R.drawable.f,
            R.drawable.g,
            R.drawable.h,
            R.drawable.i,
        )

        heading = arrayOf(
            "Biden aims to expand vaccines for adults and children",
            "Just got my first shot, helping the world to be a safer place",
            "Local trains to be suspended in Bengal from tomorrow in view of covid-19",
            "MHA asks states,UTs to ensure there are no fires in hospitals",
            "Australian citizen sues PM Morrison over flight ban from india",
            "Former India hockey coach Kaushik hospitalised after testing positive for COVID",
            "Delhi records 20,960 fresh covid-19 infections, positivity rate at 26.37%",
            "Barcelona church offers open-air space for Ramadan",
            "Trillions of cicadas set to emerge in the US, here's why",
            "Homemaker, economist: Candidates from all walks of life in Bengal assembly"
        )

        rvNews = findViewById(R.id.rvNews)
        rvNews.layoutManager = LinearLayoutManager(this)
        newsList = arrayListOf<News>()

        getUserData()

    }

    private fun getUserData() {
        for (i in imageId.indices){
            val news = News(imageId[i], heading[i])
            newsList.add(news)
        }
        var adapter = NewsAdapter(newsList)
        rvNews.adapter = adapter

        adapter.setOnItemClickListener(object : NewsAdapter.onItemClickListner{
            override fun onItemlick(position: Int) {
                Toast.makeText(this@MainActivity, "user clicked position $position", Toast.LENGTH_SHORT).show()

            }

        })
    }
}