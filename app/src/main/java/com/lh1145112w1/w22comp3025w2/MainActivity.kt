package com.lh1145112w1.w22comp3025w2

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.lh1145112w1.w22comp3025w2.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    //private ActivityMainBinding binding;
    private lateinit var binding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)
    }
}