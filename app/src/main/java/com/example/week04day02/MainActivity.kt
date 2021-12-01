package com.example.week04day02

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.FrameLayout
import androidx.fragment.app.FragmentTransaction

class MainActivity : AppCompatActivity() {

    private var buttonFrag1:Button?= null
    private var buttonFrag2:Button?= null
    private var fragmentContainer:FrameLayout?= null

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        connectViews()
        openFragment1()
        openFragment2()
    }
    private fun connectViews(){
        buttonFrag1 = findViewById(R.id.btnOpenFragment1)
        buttonFrag2 = findViewById(R.id.btnOpenFragment2)
        fragmentContainer = findViewById(R.id.fContainer)
    }
    private fun openFragment1(){
        buttonFrag1?.setOnClickListener {
            //Prepare code to open fragment 1
            val fragmentTransaction:FragmentTransaction = supportFragmentManager.beginTransaction()
            fragmentTransaction.replace(R.id.fContainer,FirstFragment(),"FIRST_FRAGMENT")
//            fragmentTransaction.addToBackStack("FIRST_FRAGMENT") //Optional
            fragmentTransaction.setTransition(FragmentTransaction.TRANSIT_FRAGMENT_OPEN) //Optional
            fragmentTransaction.commit()
        }
    }
    private fun openFragment2(){
        buttonFrag2?.setOnClickListener {
            //Prepare code to open fragment 2
            val fragmentTransaction:FragmentTransaction = supportFragmentManager.beginTransaction()
            fragmentTransaction.replace(R.id.fContainer,SecondFragment(),"SECOND_FRAGMENT")
//            fragmentTransaction.addToBackStack("FIRST_FRAGMENT") //Optional
            fragmentTransaction.setTransition(FragmentTransaction.TRANSIT_FRAGMENT_OPEN) //Optional
            fragmentTransaction.commit()
        }
    }
}