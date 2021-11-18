package com.example.to_do_list_app

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.activityViewModels
import androidx.navigation.fragment.findNavController
import com.example.to_do_list_app.databinding.FragmentTaskDeteailsBinding
import com.example.to_do_list_app.model.TaskViewModel


class Task_Deteails : Fragment() {
    val sharedviemodel: TaskViewModel by activityViewModels()
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

        binding?.apply {
            lifecycleOwner=viewLifecycleOwner
            viewModel = sharedviemodel
            fragmentdeteils = this@Task_Deteails
        }
        fun goToEditPage(){
            findNavController().navigate(R.id.action_task_Deteails_to_edit_Task)
        }

    }




}