package com.example.section1_databinding

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.databinding.DataBindingUtil
import com.example.section1_databinding.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {

    // 바인딩 객체에 대한 참조 변수
   private lateinit var binding : ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        binding = DataBindingUtil.setContentView(this, R.layout.activity_main)

        binding.submitButton.setOnClickListener {
            displayGreeting()
        }
    }

    private fun displayGreeting() {
        // scope functions
        binding.apply {
            greetingTextView.text = "Hello! "+ nameEditText.text
        }
    }
}