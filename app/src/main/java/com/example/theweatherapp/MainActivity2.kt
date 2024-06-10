package com.example.theweatherapp

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.Toast

class MainActivity2 : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main2)

        val exitButton: Button = findViewById(R.id.exitButton)
        exitButton.setOnClickListener {
            //Exits the APP
            finish()
        }

        val detailedView: Button = findViewById(R.id.detailedView)
        detailedView.setOnClickListener {
            val intent = Intent(this, MainActivity3::class.java)
            startActivity(intent)
        }

        //finish the code
        val editText2: EditText = findViewById(R.id.editText2)
        val clearButton: Button = findViewById(R.id.clearButton)
        clearButton.setOnClickListener {
            editText2.text.clear()
            Toast.makeText(this, "Input cleared", Toast.LENGTH_SHORT).show()
        }

        val dates = arrayOf(
            "Monday", "Tuesday", "Wednesday",
            "Thursday", "Frriday", "Saturday", "Sunday"
        )

        val Min = arrayOf(
            "20", "14", "10", "10",
            "5", "25", "15"
        )

        val Max = arrayOf("25", "19", "15", "15", "10", "30", "20")

        val weather = arrayOf(
            "Sunny", "Cloudy", "Rainy",
            "Windy", "Stormy", "Sunny", "Windy"
        )

        for (i in dates.indices) {
            println("${dates[i]}: ${Min[i]}: ${Max[i]}: ${weather[i]}")
        }


    }

}