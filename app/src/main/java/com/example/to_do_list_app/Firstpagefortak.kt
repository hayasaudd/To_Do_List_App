package com.example.to_do_list_app

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Toast
import androidx.databinding.DataBindingUtil
import androidx.fragment.app.activityViewModels
import androidx.navigation.fragment.findNavController
import com.example.to_do_list_app.data.DataTask
import com.example.to_do_list_app.data.TaskitemSource
import com.example.to_do_list_app.databinding.FragmentFirstpagefortakBinding
import com.example.to_do_list_app.model.TaskViewModel


class Firstpagefortak : Fragment() {
    val sharedviemodel: TaskViewModel by activityViewModels()
var dataset=TaskitemSource().getTasks()
     var binding: FragmentFirstpagefortakBinding? = null
 //   private val sharedViewModel: ViewModel by activityViewModels()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
    }



    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
         binding= DataBindingUtil.inflate(inflater, R.layout.fragment_firstpagefortak,container, false)
         return binding!!.root
    }



    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        lateinit var tasklist : List<DataTask>
        Toast.makeText(context, "here", Toast.LENGTH_SHORT).show()

            binding?.addTasks?.setOnClickListener {

                 var action=FirstpagefortakDirections.actionFirstpagefortakToAddNewTask()
                  findNavController().navigate(action)

            }


     binding?.recyclerView?.adapter =TaskAdapter(dataset)

        // to do model data class
        //to do model2 latinaite

//        binding?.apply {
//            lifecycleOwner=viewLifecycleOwner
//            viewModel = sharedviemodel
//            fragmentAddNewTas = this@Firstpagefortak
//        }

        }

//    fun deteails(){
//        findNavController().navigate(R.id.action_task_Deteails_to_firstpagefortak)

    }


