package com.example.finalapp

import android.content.Intent
import android.content.res.Configuration
import android.graphics.Color
import android.graphics.Typeface
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.TextView
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_main)

        val welcome = findViewById<TextView>(R.id.textView2)
        val choose = findViewById<TextView>(R.id.textView)
        val english = findViewById<Button>(R.id.button)
        val french = findViewById<Button>(R.id.button2)
        welcome.textSize = 24f
        welcome.setTextColor(Color.BLACK)
        english.textSize = 20f
        french.textSize = 20f

        val rootView = findViewById<View>(R.id.main)
        welcome.setTypeface(null, Typeface.BOLD)
        choose.setTypeface(null, Typeface.ITALIC)



        english.setOnClickListener {
            val intent = Intent(this, EnglishActivity::class.java)
            startActivity(intent)
        }
        french.setOnClickListener {
            val intent2 = Intent(this, FrenchActivity::class.java)
            startActivity(intent2)
        }
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main)) { v, insets ->
            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
            insets
        }
    }

}