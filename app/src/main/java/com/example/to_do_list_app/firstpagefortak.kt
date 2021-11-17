package com.example.to_do_list_app

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Toast
import androidx.recyclerview.widget.LinearLayoutManager
import com.example.to_do_list_app.data.taskitem
import com.example.to_do_list_app.data.tasklist
import com.example.to_do_list_app.databinding.FragmentFirstpagefortakBinding
import kotlinx.android.synthetic.main.activity_main.view.*
import kotlinx.android.synthetic.main.fragment_firstpagefortak.view.*


class firstpagefortak : Fragment() {

    private lateinit var binding: FragmentFirstpagefortakBinding

    override fun onCreate(savedInstanceState: Bundle?) {

        super.onCreate(savedInstanceState)

    }
         // private  var binding: FragmentFirstpagefortakBinding? = null


    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
         binding= FragmentFirstpagefortakBinding.inflate(inflater, container, false)
        // val fragmentBing = FragmentFirstpagefortakBinding.inflate(inflater, container, false) //  binding = fragmentBing // var listoftask = taskitem.getAll() // binding.getStartFragment().adapter //  binding.recyclerview.adapter = taskAdapter(listoftask) //return inflater.inflate(R.layout.fragment_firstpagefortak, container, false)
        return binding.root
    }


    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        Toast.makeText(context, "here", Toast.LENGTH_SHORT).show()
         var listoftask = taskitem.getAll()

       // view.recycler_view.layoutManager = LinearLayoutManager(activity)
        view.recycler_view.adapter =taskAdapter(listoftask)
    }

}