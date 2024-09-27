package com.arhm.diceroller

//import com.arhm.diceroller.databinding.ActivityMainBinding
import android.os.Bundle
import android.os.StrictMode
import android.os.StrictMode.ThreadPolicy
import android.util.Log
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity


class MainActivity : AppCompatActivity() {
    // val binding = DataBindingUtil.setContentView<ActivityMainBinding>(this, R.layout.activity_main)
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        val policy = ThreadPolicy.Builder().permitAll().build()
        StrictMode.setThreadPolicy(policy)
        Log.d("DEBUG","Main activity created")
        setContentView(R.layout.activity_main)
//        val resultText : TextView = findViewById(R.id.result_text_view)
//        binding = DataBindingUtil.setContentView(this, R.layout.activity_main)
//        binding.rollButton.text= "Lets roll with binding"
//        binding.rollButton.setOnClickListener {
//            Toast.makeText(this, "Presionado", Toast.LENGTH_SHORT).show()
//            Toast.makeText(this, "Presionado segundo", Toast.LENGTH_SHORT).show()
//            rollDice()
//        }
//        diceImage = binding.diceImage
    }

//    private fun rollDice() {
//        val resultText : TextView = findViewById(R.id.result_text_view)
//        val randomInt = Random().nextInt(6)+1
//        resultText.text = "Dice rolled $randomInt"
//
//        val drawableResource = when(randomInt){
//            1 -> R.drawable.dice_1
//            2 -> R.drawable.dice_2
//            3 -> R.drawable.dice_3
//            4 -> R.drawable.dice_4
//            5 -> R.drawable.dice_5
//            else -> R.drawable.dice_6
//        }
//
//        diceImage.setImageResource(drawableResource)
//    }
}