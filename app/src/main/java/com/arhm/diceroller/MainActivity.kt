package com.arhm.diceroller

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.ImageView
import android.widget.TextView
import android.widget.Toast
import androidx.databinding.DataBindingUtil
import com.arhm.diceroller.databinding.ActivityMainBinding
import java.util.Random

class MainActivity : AppCompatActivity() {
    private lateinit var binding: ActivityMainBinding
    // val binding = DataBindingUtil.setContentView<ActivityMainBinding>(this, R.layout.activity_main)
    lateinit var diceImage: ImageView
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        // setContentView(R.layout.activity_main)
        binding = DataBindingUtil.setContentView(this, R.layout.activity_main)
        binding.rollButton.text= "Lets roll with binding"
        binding.rollButton.setOnClickListener {
            Toast.makeText(this, "Presionado", Toast.LENGTH_SHORT).show()
            Toast.makeText(this, "Presionado segundo", Toast.LENGTH_SHORT).show()
            rollDice()
        }
        diceImage = binding.diceImage
    }

    private fun rollDice() {
        val resultText : TextView = findViewById(R.id.result_text_view)
        val randomInt = Random().nextInt(6)+1
        resultText.text = "Dice rolled $randomInt"

        val drawableResource = when(randomInt){
            1 -> R.drawable.dice_1
            2 -> R.drawable.dice_2
            3 -> R.drawable.dice_3
            4 -> R.drawable.dice_4
            5 -> R.drawable.dice_5
            else -> R.drawable.dice_6
        }

        diceImage.setImageResource(drawableResource)
    }
}