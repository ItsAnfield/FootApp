package com.example.footapp

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.TextView
import com.google.firebase.firestore.FirebaseFirestore

class Odegaard : AppCompatActivity() {

    val db = FirebaseFirestore.getInstance()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_odegaard)

        val nombreArsenal11 = findViewById<TextView>(R.id.nombreArsenal4)
        val apellidoArsenal11 = findViewById<TextView>(R.id.apellidoArsenal4)
        val nacionalidadArsenal11 = findViewById<TextView>(R.id.nacionalidadArsenal4)
        val posicionArsenal11 = findViewById<TextView>(R.id.posicionArsenal4)
        val edadArsenal11 = findViewById<TextView>(R.id.edadArsenal4)
        val arsenalGO11 = findViewById<Button>(R.id.arsenalGo4)
        val btnNextArsenal11 = findViewById<Button>(R.id.btnNextArsenal4)



        arsenalGO11.setOnClickListener{
            db.collection("/equipos/aMjroQ5RT68MuT7CKINl/jugadores").document("So527bOI0JlCvvdddwRK").get().addOnSuccessListener {
                nombreArsenal11.setText(it.get("nombre")as String?)
                apellidoArsenal11.setText(it.get("apellido")as String?)
                edadArsenal11.setText(it.get("edad")as String?)
                nacionalidadArsenal11.setText(it.get("nacionalidad")as String?)
                posicionArsenal11.setText(it.get("posicion")as String?)
            }

        }

        btnNextArsenal11.setOnClickListener {
            val intent = Intent(this, Lokonga::class.java)
            startActivity(intent)

        }
    }
}