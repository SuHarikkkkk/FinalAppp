package com.example.finalapp

import android.media.MediaPlayer
import android.os.Bundle
import android.widget.Button
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class StreetENActivity : AppCompatActivity() {
    private lateinit var mediaPlayer: MediaPlayer
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_street_enactivity)
        val man = findViewById<Button>(R.id.button7)
        mediaPlayer = MediaPlayer.create(this, R.raw.man)

        // Настройка обработчика нажатия на кнопку
        man.setOnClickListener {
            if (mediaPlayer.isPlaying) {
                mediaPlayer.seekTo(0) // Перемотать в начало, если звук уже играет
            }
            mediaPlayer.start() // Воспроизвести звук
        }
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main)) { v, insets ->
            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
            insets
        }
    }
    override fun onDestroy() {
        super.onDestroy()
        // Освободить ресурсы MediaPlayer
        mediaPlayer.release()
    }
}