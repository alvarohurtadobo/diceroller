package com.arhm.diceroller

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.TextView
import android.widget.Toast
import java.util.Random

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val rollButton:Button = findViewById(R.id.roll_button)
        rollButton.text = "Lets roll"
        rollButton.setOnClickListener {
            Toast.makeText(this, "Presionado", Toast.LENGTH_SHORT).show()
            Toast.makeText(this, "Presionado segundo", Toast.LENGTH_SHORT).show()
            rollDice()
        }
    }

    private fun rollDice() {
        val resultText : TextView = findViewById(R.id.result_text_view)
        val randomInt = Random().nextInt(6)+1
        resultText.text = "Dice rolled $randomInt"
    }
}