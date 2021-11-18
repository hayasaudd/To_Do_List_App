package com.example.to_do_list_app

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Toast
import com.example.to_do_list_app.data.taskitem
import com.example.to_do_list_app.databinding.FragmentFirstpagefortakBinding
import com.example.to_do_list_app.databinding.FragmentTaskDeteailsBinding


class Task_Deteails : Fragment() {
    private var binding: FragmentTaskDeteailsBinding? = null

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

    }

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        binding = FragmentTaskDeteailsBinding.inflate(inflater,container, false)
        // Inflate the layout for this fragment
        return binding!!.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        Toast.makeText(context, "here", Toast.LENGTH_SHORT).show()
        var listoftask = taskitem.getAll()

    }



}