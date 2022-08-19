package com.zasa.simplervdrawable

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ImageView
import android.widget.TextView

class NewsActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_news)

        val heading : TextView = findViewById(R.id.tvHeading)
        val ivNews : ImageView = findViewById(R.id.ivNews)
        val tvFullNews : TextView = findViewById(R.id.tvFullNews)

        val bundle : Bundle? = intent.extras
        val headline = bundle!!.getString("heading")
        val newsImage = bundle.getInt("titleImage")
        val fullNews = bundle.getString("fullNews")

        heading.text = headline
        tvFullNews.text = fullNews
        ivNews.setImageResource(newsImage)
        supportActionBar?.title = headline
    }
}