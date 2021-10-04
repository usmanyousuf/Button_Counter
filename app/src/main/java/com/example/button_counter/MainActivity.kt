package com.example.button_counter

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.TextView

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val countButton = findViewById<Button>(R.id.Button1)
        val textview = findViewById<TextView>(R.id.text)
        var count = 0
        countButton.setOnClickListener {
            count += 1
            textview.text = count.toString()
        }
    }
}