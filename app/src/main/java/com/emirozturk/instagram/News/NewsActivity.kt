package com.emirozturk.instagram.News
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.emirozturk.instagram.Utils.BottomNavBarHelper
import com.emirozturk.instagram.databinding.ActivityNewsBinding

class NewsActivity : AppCompatActivity() {
    private lateinit var binding: ActivityNewsBinding
    private val activityNo = 3
    private val tag = "NewsActivity"

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityNewsBinding.inflate(layoutInflater)
        setContentView(binding.root)

        setupBottomNav()
    }

    ///Bottom navbarı hazırlar.
    private fun setupBottomNav() {
        /*BottomNavBarHelper.setupNavigation(this, binding.bottomNavigationView)
        val menuItem = binding.bottomNavigationView.menu.getItem(activityNo)
        menuItem.setChecked(true)*/
    }
}