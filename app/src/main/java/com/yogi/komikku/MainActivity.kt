package com.yogi.komikku

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.fragment.app.Fragment
import com.google.android.material.bottomnavigation.BottomNavigationView
import com.yogi.komikku.fragment.PengaturanFragment
import com.yogi.komikku.fragment.UntukmuFragment


class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val pengaturanFragment = PengaturanFragment()
        val untukmuFragment = UntukmuFragment()

        makeCurrentFragment (untukmuFragment)

        val bottomnavigation = findViewById<BottomNavigationView>(R.id.bottom_navigation)

        bottomnavigation.setOnNavigationItemSelectedListener {
            when(it.itemId){
                R.id.menu_untukmu -> makeCurrentFragment(untukmuFragment)
                R.id.menu_pengaturan -> makeCurrentFragment(pengaturanFragment)
            }
            true
        }
//
//        var pengaturan = PengaturanFragment()
//        pengaturan.onCreateView().switchBtn
    }



    fun makeCurrentFragment(fragment: Fragment){
        supportFragmentManager.beginTransaction().apply {
            replace(R.id.fram_nav, fragment)
            commit()
        }

    }

}