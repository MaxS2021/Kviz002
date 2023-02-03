package com.example.kvizandroid02

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.Toast

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val buttonA = findViewById<Button>(R.id.button2)
        val buttonB = findViewById<Button>(R.id.button5)
        val buttonC = findViewById<Button>(R.id.button6)

        buttonA.setOnClickListener {
            Toast.makeText(applicationContext, "Правильно!", Toast.LENGTH_SHORT).show()
        }
        buttonB.setOnClickListener {
            Toast.makeText(applicationContext, "Ответ не верный!", Toast.LENGTH_SHORT).show()
        }
        buttonC.setOnClickListener {
            Toast.makeText(applicationContext, "Попробуйте еще раз!", Toast.LENGTH_SHORT).show()
        }
    }
}