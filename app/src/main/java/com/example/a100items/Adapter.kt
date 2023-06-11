package com.example.a100items

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import android.widget.Toast
import androidx.recyclerview.widget.RecyclerView

class Adapter(
    private val context: Context,
    private val courseImg: ArrayList<Int>,
    private val courseName: ArrayList<String>
) : RecyclerView.Adapter<Adapter.ViewHolder>() {
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
        val view =
            LayoutInflater.from(parent.context).inflate(R.layout.list_item, parent, false)
        return ViewHolder(view)
    }

    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
        val res = courseImg[position]
        holder.images.setImageResource(res)
        holder.text.text = courseName[position]
    }

    override fun getItemCount(): Int {
        return courseImg.size
    }

    inner class ViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView),
        View.OnClickListener {
        val images: ImageView = itemView.findViewById(R.id.courseImg)
        val text: TextView = itemView.findViewById(R.id.courseName)

        init {
            itemView.setOnClickListener(this)
        }

        override fun onClick(v: View?) {
            val position = adapterPosition
            val clickedItem = courseName[position]
            Toast.makeText(itemView.context, "Clicked on $clickedItem", Toast.LENGTH_SHORT)
                .show()

        }
    }
}