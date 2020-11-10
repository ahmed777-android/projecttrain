package com.example.projecttrain

import android.os.Bundle
import com.google.android.material.bottomnavigation.BottomNavigationView
import androidx.appcompat.app.AppCompatActivity
import androidx.navigation.NavController
import androidx.navigation.findNavController
import androidx.navigation.ui.AppBarConfiguration
import androidx.navigation.ui.NavigationUI

import androidx.navigation.ui.setupWithNavController
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {
    lateinit var bottomNav: BottomNavigationView
    lateinit var navController: NavController
    lateinit var appBarConfiguration: AppBarConfiguration
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        bottomNav = bottomNavView

        //bottom navigation
        navController = findNavController(R.id.nav_host_fragment)
        setupBottomNavigation()

        //navigation up buttom
        appBarConfiguration= AppBarConfiguration(navController.graph)
        NavigationUI.setupActionBarWithNavController(this,navController)
    }

    override fun onSupportNavigateUp(): Boolean {
        //return super.onSupportNavigateUp()
      return  NavigationUI.navigateUp(navController,appBarConfiguration)

    }


    private fun setupBottomNavigation() {
        bottomNav.setupWithNavController(navController)
    }
}



