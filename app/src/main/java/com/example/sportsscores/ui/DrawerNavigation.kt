package com.example.sportsscores.ui

import android.os.Bundle
import android.view.MenuItem
import android.widget.Toast
import androidx.appcompat.app.ActionBarDrawerToggle
import androidx.appcompat.app.AppCompatActivity
import com.example.sportsscores.R
import com.example.sportsscores.databinding.ActivityMainBinding

class DrawerNavigation : AppCompatActivity() {

    // binding
    private lateinit var binding: ActivityMainBinding

    // Toggle
    private lateinit var toggle: ActionBarDrawerToggle


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.apply {
            toggle = ActionBarDrawerToggle(this@DrawerNavigation, drawerLayout, R.string.open, R.string.close)
            drawerLayout.addDrawerListener(toggle)
            toggle.syncState()

            supportActionBar?.setDisplayHomeAsUpEnabled(true)

            navView.setNavigationItemSelectedListener {
                when(it.itemId) {
                    R.id.nfl -> {
                        Toast.makeText(this@DrawerNavigation, "NFL Scores", Toast.LENGTH_SHORT).show()
                    }
                    R.id.mlb -> {
                        Toast.makeText(this@DrawerNavigation, "MLB Scores", Toast.LENGTH_SHORT).show()
                    }
                    R.id.nba -> {
                        Toast.makeText(this@DrawerNavigation, "NBA Scores", Toast.LENGTH_SHORT).show()
                    }
                    R.id.nhl -> {
                        Toast.makeText(this@DrawerNavigation, "NHL Scores", Toast.LENGTH_SHORT).show()
                    }

                }
                true

            }

        }

    }

    override fun onOptionsItemSelected(item: MenuItem): Boolean {
        if (toggle.onOptionsItemSelected(item)) {
            true
        }
        return super.onOptionsItemSelected(item)
    }

}

