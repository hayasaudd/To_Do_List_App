package com.example.to_do_list_app

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.activityViewModels
import androidx.navigation.Navigation
import androidx.navigation.fragment.findNavController
import com.example.to_do_list_app.data.DataTask
import com.example.to_do_list_app.databinding.FragmentAddNewTaskBinding
import com.example.to_do_list_app.model.TaskViewModel
import kotlinx.android.synthetic.main.fragment_add_new_task.*

class Add_New_Task : Fragment(R.layout.fragment_add_new_task) {
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
}



