package com.example.atv_22_03

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.TextView
import android.widget.Toast
import java.util.*


class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        //Variavel do botao
        val rollButton: Button = findViewById(R.id.roll_button)
        val soma: Button = findViewById(R.id.Count)
        soma.setOnClickListener {
            soma()

        }
        rollButton.setOnClickListener {
            rollDice()
        }
    }


    private fun rollDice() {
        //
        val randomInt = (1..6).random()

        val texto: TextView = findViewById(R.id.texto)
        texto.text = randomInt.toString()
    }

    private fun soma(){

            val Text: TextView = findViewById(R.id.texto)

            if (Text.text == "Random Number") {
                Text.text = "1"

            }
            else
            {
                var Int = Text.text.toString().toInt()

                if (Int < 6) {

                    Int++
                    Text.text = Int.toString()
                }
        }
    }
}