package com.example.logindesign.activities

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.logindesign.R
import com.example.logindesign.fragments.InfoFragment
import com.example.logindesign.fragments.ProfileFragment
import kotlinx.android.synthetic.main.activity_home.*

class HomeActivity : AppCompatActivity(), InfoFragment.OnFragmentInteraction {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_home)

        init()
    }

    private fun init(){
        supportFragmentManager.beginTransaction().add(R.id.frame_layout, InfoFragment()).commit()
    }

    override fun onButtonClicked(name: String, email: String, birth: String, work: String) {
        var fragmentProfile = ProfileFragment.newInstance(name, email, birth, work)
        supportFragmentManager.beginTransaction().replace(R.id.frame_layout, fragmentProfile).commit()
    }
}