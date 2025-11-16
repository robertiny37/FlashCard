package com.example.flashcardapp

import android.os.Bundle
import android.view.View
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
            val flashcard_question =findViewById<TextView>(R.id.Flashcard_Question)
            val flashcard_answer =findViewById<TextView>(R.id.Flashcard_Answer)

            flashcard_question.setOnClickListener {
                flashcard_question.visibility= View.INVISIBLE
                flashcard_answer.visibility= View.VISIBLE
            }
        }
    }
