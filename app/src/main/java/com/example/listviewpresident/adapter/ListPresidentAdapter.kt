package com.example.listviewpresident.adapter

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import android.widget.Toast
import androidx.recyclerview.widget.RecyclerView
import com.bumptech.glide.Glide
import com.example.listviewpresident.R
import com.example.listviewpresident.model.Presiden

class ListPresidentAdapter(private val listPresiden: ArrayList<Presiden>) : RecyclerView.Adapter<ListPresidentAdapter.PresidentViewHolder>() {
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): PresidentViewHolder {
        val view: View = LayoutInflater.from(parent.context).inflate(R.layout.item_president, parent, false)
        return PresidentViewHolder(view)
    }

    override fun getItemCount(): Int {
        return listPresiden.size
    }

    override fun onBindViewHolder(holder: PresidentViewHolder, position: Int) {
        val presiden = listPresiden[position]
        holder.tvName.text = presiden.name
        holder.tvDetail.text = presiden.detail
        Glide.with(holder.itemView.context)
            .load(presiden.poster)
            .into(holder.imgPoster)

        holder.itemView.setOnClickListener{
            Toast.makeText(
                holder.itemView.context, " Kamu memilih " + listPresiden[holder.adapterPosition].name,
                Toast.LENGTH_SHORT
            ).show()
        }
    }

    inner class PresidentViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {
        var tvName: TextView = itemView.findViewById(R.id.tv_item_name)
        var tvDetail: TextView = itemView.findViewById(R.id.tv_item_detail)
        var imgPoster: ImageView = itemView.findViewById(R.id.img_item_poster)
    }
}