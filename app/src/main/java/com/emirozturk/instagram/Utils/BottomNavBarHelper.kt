package com.emirozturk.instagram.Utils
import android.content.Context
import android.content.Intent
import android.view.MenuItem
import com.emirozturk.instagram.Home.HomeActivity
import com.emirozturk.instagram.News.NewsActivity
import com.emirozturk.instagram.Profile.ProfileActivity
import com.emirozturk.instagram.R
import com.emirozturk.instagram.Search.SearchActivity
import com.emirozturk.instagram.Share.ShareActivity
import com.google.android.material.bottomnavigation.BottomNavigationView

class BottomNavBarHelper {
    //Javadaki static yapısı gibi bir yapı.
    companion object {
        ///Gezinmeyi ayarlar.
        fun setupNavigation(context: Context, bottomNavbar: BottomNavigationView) {
            bottomNavbar.setOnItemSelectedListener { item ->
                when (item.itemId) {
                    R.id.ic_home -> {
                        //Home iconuna tıklandı.
                        val intent = Intent(context, HomeActivity::class.java).addFlags(Intent.FLAG_ACTIVITY_NO_ANIMATION)
                        context.startActivity(intent)
                    }
                    R.id.ic_search -> {
                        val intent = Intent(context, SearchActivity::class.java).addFlags(Intent.FLAG_ACTIVITY_NO_ANIMATION)
                        context.startActivity(intent)
                    }
                    R.id.ic_share -> {
                        val intent = Intent(context, ShareActivity::class.java).addFlags(Intent.FLAG_ACTIVITY_NO_ANIMATION)
                        context.startActivity(intent)
                    }
                    R.id.ic_news -> {
                        val intent = Intent(context, NewsActivity::class.java).addFlags(Intent.FLAG_ACTIVITY_NO_ANIMATION)
                        context.startActivity(intent)
                    }
                    R.id.ic_profile -> {
                        val intent = Intent(context, ProfileActivity::class.java).addFlags(Intent.FLAG_ACTIVITY_NO_ANIMATION)
                        context.startActivity(intent)
                    }
                }
                true
            }
        }
    }
}
