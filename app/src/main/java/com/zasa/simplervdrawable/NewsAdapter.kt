package com.zasa.simplervdrawable

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView

/**
 **@Project -> SimpleRVDrawable
 **@Author -> Sangeeth on 8/17/2022
 */
class NewsAdapter(private val newsList : ArrayList<News>) : RecyclerView.Adapter<NewsAdapter.ViewHolder>() {

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
        val itemView = LayoutInflater.from(parent.context).inflate(R.layout.item_news, parent, false)
        return ViewHolder(itemView)
    }

    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
        val currentItem = newsList[position]
        holder.titleImage.setImageResource(currentItem.titleImage)
        holder.heading.text = currentItem.heading
    }

    override fun getItemCount() = newsList.size

    inner class ViewHolder(itemView :View) : RecyclerView.ViewHolder(itemView) {
        val titleImage : ImageView = itemView.findViewById(R.id.ivImage)
        val heading : TextView = itemView.findViewById(R.id.tvHeading)
    }

}