package com.example.kvizandroid02

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.webkit.WebView
import android.widget.Button
import android.widget.TextView
import android.widget.Toast


class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        supportActionBar?.hide()

        val buttonExit = findViewById<Button>(R.id.button_exit)
        val buttonStart = findViewById<Button>(R.id.button_start)

        buttonExit.setOnClickListener(this::handExit)
        buttonStart.setOnClickListener(this::startNew)
    }

    fun startNew(view: View) {
        val intent = Intent(this, SecondActivity::class.java)
        startActivity(intent)
    }

    fun handExit(view: View) {
        finish()
    }

}