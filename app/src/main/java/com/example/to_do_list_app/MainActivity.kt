package com.example.to_do_list_app

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.navigation.NavController
import androidx.navigation.fragment.NavHostFragment
import androidx.navigation.ui.setupActionBarWithNavController

import com.example.to_do_list_app.databinding.ActivityMainBinding


class MainActivity : AppCompatActivity() {
   private lateinit var binding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?){
        super.onCreate(savedInstanceState)
      binding = ActivityMainBinding.inflate(layoutInflater)
      setContentView(binding.root)

        lateinit var navController: NavController
        val navHostFragment = supportFragmentManager
            .findFragmentById(R.id.fragmentcontainer) as NavHostFragment
         navController = navHostFragment.navController

        setupActionBarWithNavController(navController)


    }


}