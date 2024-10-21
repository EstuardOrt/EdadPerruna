package com.example.edadperruna

import android.os.Bundle
import android.widget.Button
import android.widget.EditText
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
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main)) { v, insets ->
            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
            insets
        }

        val editAge = findViewById<EditText>(R.id.editableAge)
        val calculate = findViewById<Button>(R.id.calculatorButton)
        val result = findViewById<TextView>(R.id.resultText)

        calculate.setOnClickListener(){
            var age = editAge.text.toString().toInt()
            var resultAge = age * 7
            result.text = "Su edad en años perro es: $resultAge años"
        }
    }
}