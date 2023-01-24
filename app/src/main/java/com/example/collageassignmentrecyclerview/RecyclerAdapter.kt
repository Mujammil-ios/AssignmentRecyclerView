package com.example.collageassignmentrecyclerview

import android.R
import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.RelativeLayout
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView


class RecyclerAdapter(var context: Context, var newsList: ArrayList<NewsModel>) : RecyclerView.Adapter<RecyclerAdapter.ViewHolder>() {

    inner class ViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {

        private val flowerTextView:TextView = itemView.findViewById(R.id.titileTv)
        fun bind(word: String){
            flowerTextView.text = word
        }
        val nameTextView = itemView.findViewById<TextView>(R.id.txt_title)
        var imageView: ImageView? = null
        var textView: TextView? = null
        var relativeLayout: RelativeLayout? = null
        fun bind(itemView: View) {
            super(itemView)
            imageView = itemView.findViewById<View>(R.id.) as ImageView
            textView = itemView.findViewById<View>(R.id.textView) as TextView
            relativeLayout = itemView.findViewById<View>(R.id.relativeLayout) as RelativeLayout
        }
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
        val view = LayoutInflater.from(parent.context).inflate(R.layout.animated_item, parent, false)
        return ViewHolder(view)
    }

    override fun onBindViewHolder(holder: ViewHolder, position: Int) {

        val item = newsList[position]
        holder.itemView  = item.title
        holder.itemView.txt_date.text = item.date
        holder.itemView.txt_desc.text = item.description
        holder.itemView.txt_title.text = item.title
        holder.itemView.imageView.setImageResource(item.image)
    }

    override fun getItemCount() = newsList.size
}