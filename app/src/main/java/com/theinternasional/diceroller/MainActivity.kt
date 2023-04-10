package com.theinternasional.diceroller

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.ImageView
import android.widget.TextView


class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val rollButton: Button = findViewById(R.id.button)
        rollButton.setOnClickListener {
            val diceImage: ImageView = findViewById(R.id.imageView)
            rollButton.setOnClickListener {
                rollDice()
                setIdentity()
            }
        }
    }

    private fun rollDice() {
        val dice = Dice(6)
        val diceRoll = dice.roll()
        val diceImage: ImageView = findViewById(R.id.imageView)
        when (diceRoll) {
            1 -> diceImage.setImageResource(R.drawable.dice_1)
            2 -> diceImage.setImageResource(R.drawable.dice_2)
            3 -> diceImage.setImageResource(R.drawable.dice_3)
            4 -> diceImage.setImageResource(R.drawable.dice_4)
            5 -> diceImage.setImageResource(R.drawable.dice_5)
            6 -> diceImage.setImageResource(R.drawable.dice_6)
        }
    }
    fun setIdentity() {
        val name : TextView = findViewById(R.id.textView2)
        val nim : TextView = findViewById(R.id.textView)
        val kelas : TextView = findViewById(R.id.textView3)

        name.text = "Hafizh Luqmanul Hakim"
        nim.text = "223307098"
        kelas.text = "2D"
    }
}