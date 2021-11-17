package com.example.to_do_list_app

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.example.to_do_list_app.data.DataTask

import org.w3c.dom.Text
import java.nio.file.Files.size

class taskAdapter(var list: List<DataTask>
): RecyclerView.Adapter<taskAdapter.itemViewHolder>() {

    class itemViewHolder(view: View): RecyclerView.ViewHolder(view){
        val tasktittel: TextView = view.findViewById(R.id.task)
        val categorytask: TextView = view.findViewById(R.id.category)
        val tasklocation: TextView = view.findViewById(R.id.location)
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): itemViewHolder {
       val adapterlayout = LayoutInflater.from(parent.context)
           .inflate(R.layout.cardoflist, parent, false)
        return itemViewHolder(adapterlayout)

    }

    override fun onBindViewHolder(holder: itemViewHolder, position: Int) {
        var dataitem= list[position]
        holder.tasktittel.text= dataitem.task_tittel
        holder.categorytask.text= dataitem.catigory
        holder.tasklocation.text= dataitem.location
    }

    override fun getItemCount(): Int {
       return list.size
    }

}