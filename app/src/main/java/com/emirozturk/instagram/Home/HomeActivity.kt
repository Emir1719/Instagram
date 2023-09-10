package com.emirozturk.instagram.Home
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.emirozturk.instagram.Utils.BottomNavBarHelper
import com.emirozturk.instagram.databinding.ActivityHomeBinding

class HomeActivity : AppCompatActivity() {
    private lateinit var binding: ActivityHomeBinding
    private val activityNo = 0
    private val tag = "HomeActivity"

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityHomeBinding.inflate(layoutInflater)
        setContentView(binding.root)

        setupBottomNav()
    }

    ///Bottom navbarı hazırlar.
    private fun setupBottomNav() {
        BottomNavBarHelper.setupNavigation(this, binding.bottomNavigationView)
        val menuItem = binding.bottomNavigationView.menu.getItem(activityNo)
        menuItem.setChecked(true)
    }
}