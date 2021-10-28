package com.example.recyclerview

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView

class TheSmithsAdapter(private val context: Context, private val theSmiths: List<TheSmiths>, val listener: (TheSmiths) -> Unit)
    : RecyclerView.Adapter<TheSmithsAdapter.NamasiswaViewHolder>(){

    class NamasiswaViewHolder(view: View): RecyclerView.ViewHolder(view) {

        val imgTheSmiths = view.findViewById<ImageView>(R.id.img_item_photo)
        val nameTheSmiths = view.findViewById<TextView>(R.id.tv_item_name)
        val descTheSmiths = view.findViewById<TextView>(R.id.tv_item_description)

        fun bindView(theSmiths: TheSmiths, listener: (TheSmiths) -> Unit){
            imgTheSmiths.setImageResource(theSmiths.imgTheSmiths)
            nameTheSmiths.text = theSmiths.nameTheSmiths
            descTheSmiths.text = theSmiths.descTheSmiths
            itemView.setOnClickListener{
                listener(theSmiths)
            }
        }
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): NamasiswaViewHolder {
        return NamasiswaViewHolder(
            LayoutInflater.from(context).inflate(R.layout.item_thesmiths, parent, false)
        )
    }

    override fun onBindViewHolder(holder: NamasiswaViewHolder, position: Int) {
        holder.bindView(theSmiths[position], listener)
    }

    override fun getItemCount(): Int = theSmiths.size
}