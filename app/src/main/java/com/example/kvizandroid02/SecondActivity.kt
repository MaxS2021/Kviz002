package com.example.kvizandroid02

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.TextView
import android.widget.Toast

class SecondActivity : AppCompatActivity() {

    var questionNo = 0
    var questions = listOf("Каковы два официальных языка для разработки Android? \n\n " +
            "A) Kotlin и Java \n\n B) Java и Python \n\n C) Kotlin и Python",
        "Как вы определяете функцию в Kotlin? \n\n A) void \n\n B) var \n\n C) fun",
        "Для чего используется переменная? \n\n A) Хранить данные \n\n B) Для вставки случайного значения \n\n C) Что бы найти её значение",
        "Что означает SDK в Android SDK?? \n\n A) Software Development Kit \n\n B) Software Development Kotlin \n\n C) Something Don't Know")

    var rightAnswers = listOf(1, 3, 1, 1)
    var countWrongAnswer = 0

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_second)
        supportActionBar?.hide()

        val questText = findViewById<TextView>(R.id.textView2)
        questText.text = questions[questionNo]
        countWrongAnswer = 0
        val buttonA = findViewById<Button>(R.id.button2)
        val buttonB = findViewById<Button>(R.id.button5)
        val buttonC = findViewById<Button>(R.id.button6)

        buttonA.setOnClickListener {
            showToast(1, questText)
        }
        buttonB.setOnClickListener {
            showToast(2, questText)
        }
        buttonC.setOnClickListener {
            showToast(3, questText)
        }

    }

    fun showToast(ans: Int, questText: TextView) {
        val text1: String
        if ( ans == rightAnswers[questionNo]) {
            text1 = "Правильно!"
            Toast.makeText(applicationContext, text1, Toast.LENGTH_SHORT).show()
            updateQ(questText)
        }
        else {
            text1 = "Не верный ответ!"
            Toast.makeText(applicationContext, text1, Toast.LENGTH_SHORT).show()
            updateA(questText)
        }
    }

    fun updateQ(questText: TextView) {
        if (countWrongAnswer < 4) {
            questionNo++
            if (questionNo > questions.size - 1) questionNo = 0
            questText.text = questions[questionNo]
        }
    }

    fun updateA(questText: TextView) {
        countWrongAnswer++
        if (countWrongAnswer > 3) {
            questText.text = "Вы исчерпали количество попыток. \n\nЧтобы пройти викторину заново\n\nВернитесь на главный экран"
            questionNo = 0
        }
    }

}