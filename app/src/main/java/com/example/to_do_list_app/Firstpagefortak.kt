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
import com.example.to_do_list_app.data.taskitem
import com.example.to_do_list_app.databinding.FragmentFirstpagefortakBinding
import com.example.to_do_list_app.model.TaskViewModel


class Firstpagefortak : Fragment() {
    val sharedviemodel: TaskViewModel by activityViewModels()

    private var binding: FragmentFirstpagefortakBinding? = null
 //   private val sharedViewModel: ViewModel by activityViewModels()

    override fun onCreate(savedInstanceState: Bundle?) {


        super.onCreate(savedInstanceState)

    }
         // private  var binding: FragmentFirstpagefortakBinding? = null


    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
         binding= DataBindingUtil.inflate(inflater, R.layout.fragment_firstpagefortak,container, false)
        // val fragmentBing = FragmentFirstpagefortakBinding.inflate(inflater, container, false) //  binding = fragmentBing // var listoftask = taskitem.getAll() // binding.getStartFragment().adapter //  binding.recyclerview.adapter = taskAdapter(listoftask) //return inflater.inflate(R.layout.fragment_firstpagefortak, container, false)
        return binding!!.root
    }



    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        lateinit var tasklist : List<DataTask>
        Toast.makeText(context, "here", Toast.LENGTH_SHORT).show()



            binding?.addTasks?.setOnClickListener {
////////

var action=FirstpagefortakDirections.actionFirstpagefortakToAddNewTask()
                findNavController().navigate(action)
            //test button
           //Toast.makeText(context, "here", Toast.LENGTH_SHORT).show()
            }
        //var listoftask = tasklist

        // view.recycler_view.layoutManager = LinearLayoutManager(activity)

     binding?.recyclerView?.adapter =TaskAdapter(taskitem.getAll())

        // to do model data class
        //to do model2 latinaite

        binding?.apply {
            lifecycleOwner=viewLifecycleOwner
            viewModel = sharedviemodel
            fragmentAddNewTas = this@Firstpagefortak
        }

        }

    fun deteails(){
        findNavController().navigate(R.id.action_firstpagefortak_to_task_Deteails)
    }


}