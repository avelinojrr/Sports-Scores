package com.example.sportsscores

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.navigation.NavController
import androidx.navigation.Navigation
import androidx.navigation.findNavController
import androidx.navigation.fragment.NavHostFragment
import androidx.navigation.ui.NavigationUI.setupWithNavController
import com.example.sportsscores.databinding.ActivityMainBinding
import com.example.sportsscores.ui.DrawerNavigation

class MainActivity : AppCompatActivity() {

    val drawerNavigation = DrawerNavigation()

    // binding
    private lateinit var binding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

       val navHostFragment = supportFragmentManager.
        findFragmentById(R.id.fragmentContainerView) as NavHostFragment
        val navController = navHostFragment.navController
        setupWithNavController(binding.bottomNavigationView, navController)

      /*  val drawer = Intent(this, DrawerNavigation::class.java) Intenté< extenderla asi pero no me funcionó */

    }

}