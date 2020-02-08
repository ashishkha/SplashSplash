package com.example.splashsplash

import android.content.Intent
import android.os.Bundle
import com.google.android.material.floatingactionbutton.FloatingActionButton
import com.google.android.material.snackbar.Snackbar
import androidx.navigation.findNavController
import androidx.navigation.ui.AppBarConfiguration
import androidx.navigation.ui.navigateUp
import androidx.navigation.ui.setupActionBarWithNavController
import androidx.navigation.ui.setupWithNavController
import androidx.drawerlayout.widget.DrawerLayout
import com.google.android.material.navigation.NavigationView
import androidx.appcompat.app.AppCompatActivity
import androidx.appcompat.widget.Toolbar
import android.view.Menu
import android.view.MenuItem
import androidx.appcompat.app.ActionBarDrawerToggle
import androidx.core.view.GravityCompat
import androidx.fragment.app.Fragment
import androidx.fragment.app.FragmentTransaction
import androidx.navigation.Navigation.findNavController
import kotlinx.android.synthetic.main.activity_nav.*
import kotlinx.android.synthetic.main.activity_stud_event.*
import kotlinx.android.synthetic.main.activity_stud_event.txtFinearts
import kotlinx.android.synthetic.main.activity_stud_event.txtMania
import kotlinx.android.synthetic.main.activity_stud_event.txtMastermind
import kotlinx.android.synthetic.main.activity_stud_event.txtPerformingarts
import kotlinx.android.synthetic.main.activity_stud_event.txtTechnokraft
import kotlinx.android.synthetic.main.activity_stud_event.txtsports
import kotlinx.android.synthetic.main.app_bar_nav.*


class NavActivity: AppCompatActivity(), NavigationView.OnNavigationItemSelectedListener {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_nav)
        setSupportActionBar(toolbar)

        /*txtsports.setOnClickListener {
            val intent = Intent(this, SportsActivity::class.java)
            startActivity(intent)

        }

        txtMania.setOnClickListener {
            val intent = Intent(this, ManiaActivity::class.java)
            startActivity(intent)
        }
        txtPerformingarts.setOnClickListener {
            val intent = Intent(this, PerformingartsActivity::class.java)
            startActivity(intent)
        }
        txtTechnokraft.setOnClickListener {
            val intent = Intent(this, TechnokraftActivity::class.java)
            startActivity(intent)

        }
        txtFinearts.setOnClickListener {
            val intent = Intent(this, FineartsActivity::class.java)
            startActivity(intent)

        }

        txtMastermind.setOnClickListener {
            val intent = Intent(this, MastermindActivity::class.java)
            startActivity(intent)

        }*/



        fab.setOnClickListener { view ->
            Snackbar.make(view, "Replace with your action", Snackbar.LENGTH_LONG)
                .setAction("Action", null).show()

        }

        val toggle = ActionBarDrawerToggle(
            this,
            drawer_layout,
            toolbar,
            R.string.navigation_drawer_open,
            R.string.navigation_drawer_close
        )
        drawer_layout.addDrawerListener(toggle)


        toggle.syncState()

        nav_view.setNavigationItemSelectedListener(this)


    }

    override fun onBackPressed() {
        if (drawer_layout.isDrawerOpen(GravityCompat.START)) {
            drawer_layout.closeDrawer(GravityCompat.START)
        } else {
            super.onBackPressed()
        }
    }

    override fun onCreateOptionsMenu(menu: Menu): Boolean {
        // Inflate the menu; this adds items to the action bar if it is present.
        menuInflater.inflate(R.menu.menu, menu)
        return true
    }


    override fun onOptionsItemSelected(item: MenuItem): Boolean {

        when (item.itemId) {
            R.id.action_settings -> return true
            else -> return super.onOptionsItemSelected(item)

        }

    }

    override fun onNavigationItemSelected(item: MenuItem): Boolean {
        when (item.itemId) {


            R.id.nav_first_fragment -> {
                loadFirst(frag1 = FirstFragment())

            }
            R.id.nav_second_fragment -> {
                loadSecond(frag2 = SecondFragment())
            }
            R.id.nav_third_fragment -> {
                loadSecond(frag2 = SecondFragment())

            }

        }

        drawer_layout.closeDrawer(GravityCompat.START)
        return true
    }

    private fun loadFirst(frag1: FirstFragment) {
        val fm = supportFragmentManager.beginTransaction()
        fm.replace(R.id.frameLayout, frag1)
        fm.commit()

}
    private fun loadSecond(frag2: SecondFragment) {
        val fm = supportFragmentManager.beginTransaction()
        fm.replace(R.id.frameLayout, frag2)
        fm.commit()
    }
    private fun loadThird(frag3: ThirdFragment) {
        val fm = supportFragmentManager.beginTransaction()
        fm.replace(R.id.frameLayout, frag3)
        fm.commit()
    }
}


