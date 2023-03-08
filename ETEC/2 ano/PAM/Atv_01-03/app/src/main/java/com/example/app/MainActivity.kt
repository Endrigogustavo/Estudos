package com.example.app

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.Toast

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val edtnome:EditText = findViewById(R.id.edtnome)
        val btncadastar:Button = findViewById(R.id.cadastrar)
        btncadastar.setOnClickListener{
            val toast = Toast.makeText(this, edtnome.toString(), Toast.LENGTH_SHORT)
            toast.show()
        }
    }
}

