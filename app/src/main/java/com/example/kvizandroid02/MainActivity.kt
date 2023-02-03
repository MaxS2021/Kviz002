package com.example.kvizandroid02

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.TextView
import android.widget.Toast

class MainActivity : AppCompatActivity() {

    var questionNo = 0
    val questions = listOf(
        "Вопрос 1: фыфофылодлыофлыофыло",
        "Вопрос 2: цунгшцунлорывлофргшг",
        "Вопрос 3: xmzcmsdsdlmkksdlsdlk")
    val rightAnswer = listOf(2,1,3)


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val questText = findViewById<TextView>(R.id.textView2)
        questText.setText(questions[questionNo]+"\n\nA. Вариант 1\n\nB. Вариант 2\n\nC. Вариант 3")

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
        var text1: String
        if ( ans == rightAnswer[questionNo]) {
            text1 = "Правильно!"
            updateQ(questText)
        }
        else {
            // "Попробуйте еще раз!"
            text1 = "Не верный ответ!" }
        Toast.makeText(applicationContext, text1, Toast.LENGTH_SHORT).show()
    }

    fun updateQ(questText: TextView) {
        questionNo++
        questText.setText(questions[questionNo]+"\n\nA. Вариант 1\n\nB. Вариант 2\n\nC. Вариант 3")
    }


}