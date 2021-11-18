package com.example.to_do_list_app

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.databinding.DataBindingUtil
import androidx.fragment.app.activityViewModels
import androidx.navigation.fragment.findNavController
import com.example.to_do_list_app.data.taskitem
import com.example.to_do_list_app.databinding.FragmentAddNewTaskBinding
import com.example.to_do_list_app.model.TaskViewModel

class Add_New_Task : Fragment() {
val sharedviemodel: TaskViewModel by activityViewModels()
        private var binding: FragmentAddNewTaskBinding? = null

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

    }

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        binding= FragmentAddNewTaskBinding.inflate(inflater, container, false)
        // Inflate the layout for this fragment
          return binding!!.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        binding?.apply {
            lifecycleOwner=viewLifecycleOwner
            viewModel = sharedviemodel
            fragmentadd = this@Add_New_Task
        }




        }
    fun addtask(){
        findNavController().navigate(R.id.action_add_New_Task_to_firstpagefortak)
    }

       //not shur from this line// binding?.addconst.adapter =TaskAdapter(taskitem.addtask())
    }

