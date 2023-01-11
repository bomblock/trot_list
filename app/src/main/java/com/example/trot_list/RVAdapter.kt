package com.example.trot_list

import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView

class RVAdapter (val items: MutableList<String>): RecyclerView.Adapter<RVAdapter.ViewHolder>(){
    override fun onCreateViewHolder(parent:ViewGroup, viewType: Int): RVAdapter.ViewHolder{

    }
    override fun onBindViewHolder(holder:RVAdapter.ViewHolder, position: Int) {

    }

    override fun getItemCount():Int {

    }
    inner class ViewHold(itemView : View) : RecyclerView.ViewHolder(itemView) {
    }

}
