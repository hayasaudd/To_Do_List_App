package com.example.to_do_list_app

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import android.widget.ImageButton
import android.widget.TextView
import androidx.cardview.widget.CardView
import androidx.navigation.findNavController
import androidx.recyclerview.widget.RecyclerView
import com.example.to_do_list_app.data.DataTask
import com.example.to_do_list_app.data.TaskitemSource

class TaskAdapter(var list: MutableList<DataTask>)
    : RecyclerView.Adapter<TaskAdapter.itemViewHolder>() {


    var task:TaskitemSource = TaskitemSource()

    class itemViewHolder(view: View): RecyclerView.ViewHolder(view){
        val tasktittel: TextView = view.findViewById(R.id.task)
        val categorytask: TextView = view.findViewById(R.id.category)
        val tasklocation: TextView = view.findViewById(R.id.location)
        val card:CardView=view.findViewById(R.id.card)
        val delet: ImageButton = view.findViewById(R.id.deletTask)
//        val edit: Button = view.findViewById(R.id.EditButton)
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): itemViewHolder {
       val adapterlayout = LayoutInflater.from(parent.context)
           .inflate(R.layout.cardoflist, parent, false)
        return itemViewHolder(adapterlayout)
    }

    override fun onBindViewHolder(holder: itemViewHolder, position: Int) {
        var dataitem= list[position]
        holder.tasktittel.text= dataitem.taskTittel
        holder.categorytask.text= dataitem.description
        holder.tasklocation.text= dataitem.location

        holder.card.setOnClickListener {
            var action =FirstpagefortakDirections.actionFirstpagefortakToTaskDeteails(position)
            holder.itemView.findNavController().navigate(action)
        }
        holder.delet.setOnClickListener{
            task.removeitem(position)
            notifyDataSetChanged() }

//        holder.edit.setOnClickListener{
//
//        }

    }

    override fun getItemCount(): Int {
       return list.size
    }

}