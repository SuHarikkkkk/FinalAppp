package com.example.finalapp

import android.content.Intent
import android.graphics.Typeface
import android.os.Bundle
import android.widget.Button
import android.widget.TextView
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class EnglishActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_english)

        val locen = findViewById<TextView>(R.id.textView3)
        val streeten = findViewById<Button>(R.id.button3)
        val houseen = findViewById<Button>(R.id.button4)
        val schoolen = findViewById<Button>(R.id.button5)

        locen.textSize = 24f
        streeten.textSize = 20f
        houseen.textSize = 20f
        schoolen.textSize = 20f
        locen.setTypeface(null, Typeface.BOLD)




        streeten.setOnClickListener {
            val intent = Intent(this, StreetENActivity::class.java)
            startActivity(intent)

            ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main)) { v, insets ->
                val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
                v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
                insets
            }
        }
    }
}