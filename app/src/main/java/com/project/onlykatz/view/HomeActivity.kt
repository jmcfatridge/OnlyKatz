package com.project.onlykatz.view

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.project.onlykatz.R
import com.project.onlykatz.databinding.ActivityMainBinding

class HomeActivity : AppCompatActivity() {

    private val binding by lazy { ActivityMainBinding.inflate(layoutInflater) }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(binding.root)
    }
}