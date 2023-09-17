package com.napa.activityfragmentexample.presentation.main

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.fragment.app.Fragment
import com.napa.activityfragmentexample.R
import com.napa.activityfragmentexample.databinding.ActivityMainBinding
import com.napa.activityfragmentexample.presentation.fragmentone.FragmentOne
import com.napa.activityfragmentexample.presentation.fragmentthree.FragmentThree
import com.napa.activityfragmentexample.presentation.fragmenttwo.FragmentTwo

class MainActivity : AppCompatActivity() {

    private val binding : ActivityMainBinding by lazy {
        ActivityMainBinding.inflate(layoutInflater)
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(binding.root)
    }

}