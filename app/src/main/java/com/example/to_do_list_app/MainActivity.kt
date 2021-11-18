package com.example.to_do_list_app

import android.app.Activity
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.navigation.NavController
import androidx.navigation.fragment.NavHostFragment
import androidx.navigation.ui.setupActionBarWithNavController
import androidx.recyclerview.widget.RecyclerView
import com.example.to_do_list_app.data.taskitem
import com.example.to_do_list_app.data.tasklist
import com.example.to_do_list_app.databinding.ActivityMainBinding


class MainActivity : AppCompatActivity() {
   private lateinit var binding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?){
        super.onCreate(savedInstanceState)
      binding = ActivityMainBinding.inflate(layoutInflater)
      setContentView(binding.root)

      //var listoftask = taskitem.getAll()

       //binding.recyclerView.adapter = taskAdapter(listoftask)

      /////  //contenar //set //host //nav

        lateinit var navController: NavController
        val navHostFragment = supportFragmentManager
            .findFragmentById(R.id.fragmentcontainer) as NavHostFragment
         navController = navHostFragment.navController

        setupActionBarWithNavController(navController)


    }
}