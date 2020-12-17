package com.istekno.week6navigationdrawer

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import androidx.databinding.DataBindingUtil
import androidx.navigation.NavController
import androidx.navigation.findNavController
import androidx.navigation.ui.*
import com.istekno.week6navigationdrawer.databinding.ActivityMainBinding
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    private lateinit var mainBinding: ActivityMainBinding
    private lateinit var appBarConfiguration: AppBarConfiguration
    private lateinit var navController: NavController

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        mainBinding = DataBindingUtil.setContentView(this, R.layout.activity_main)
        setSupportActionBar(mainBinding.topAppBar)

        navController = findNavController(R.id.nav_host_fragment)
        appBarConfiguration = AppBarConfiguration(setOf(R.id.nav_all, R.id.nav_main_mail, R.id.nav_social, R.id.nav_promotion,
        R.id.nav_starred, R.id.nav_pending, R.id.nav_sent, R.id.nav_outbox, R.id.nav_draf, R.id.nav_spam,
        R.id.nav_calendar, R.id.nav_contact, R.id.nav_setting, R.id.nav_support), mainBinding.drawerLayout)

        setupActionBarWithNavController(navController, appBarConfiguration)
        mainBinding.navView.setupWithNavController(navController)

        mainBinding.imgProfile.setOnClickListener {
            Toast.makeText(this, "My Profile Clicked!", Toast.LENGTH_SHORT).show()
        }
    }

    override fun onSupportNavigateUp(): Boolean {
        val navController = findNavController(R.id.nav_host_fragment)
        return navController.navigateUp(appBarConfiguration) || super.onSupportNavigateUp()
    }
}