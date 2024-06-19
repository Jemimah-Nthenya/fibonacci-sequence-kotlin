package com.akirachix.fibonacci

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.appcompat.view.menu.MenuView.ItemView
import androidx.recyclerview.widget.RecyclerView
import androidx.recyclerview.widget.RecyclerView.ViewHolder


class Numbers(var numberlist: List<Int>):RecyclerView.Adapter<NumberHolder>(){

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): NumberHolder {
        val itemView = LayoutInflater.from(parent.context)
            .inflate(R.layout.number_list, parent,false)
        return NumberHolder(itemView)
    }

    override fun onBindViewHolder(holder: NumberHolder, position: Int) {
        holder.tvNumber.text = numberlist[position].toString()
    }

    override fun getItemCount(): Int {
        return numberlist.size
    }
}
class NumberHolder(itemView: View):ViewHolder(itemView){
        var tvNumber = itemView.findViewById<TextView>(R.id.tvNumber)
    }





