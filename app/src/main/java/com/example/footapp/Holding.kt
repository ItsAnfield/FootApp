package com.example.footapp

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.TextView
import com.google.firebase.firestore.FirebaseFirestore

class Holding : AppCompatActivity() {

    val db = FirebaseFirestore.getInstance()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_holding)

        val nombreArsenal5 = findViewById<TextView>(R.id.nombreArsenal5)
        val apellidoArsenal5 = findViewById<TextView>(R.id.apellidoArsenal5)
        val nacionalidadArsenal5 = findViewById<TextView>(R.id.nacionalidadArsenal5)
        val posicionArsenal5 = findViewById<TextView>(R.id.posicionArsenal4)
        val edadArsenal5 = findViewById<TextView>(R.id.edadArsenal5)
        val arsenalGO5 = findViewById<Button>(R.id.arsenalGo5)
        val btnNextArsenal5 = findViewById<Button>(R.id.btnNextArsenal4)



        arsenalGO5.setOnClickListener{
            db.collection("/equipos/aMjroQ5RT68MuT7CKINl/jugadores").document("57jNzNZAAqTgqTqVnpbs").get().addOnSuccessListener {
                nombreArsenal5.setText(it.get("nombre")as String?)
                apellidoArsenal5.setText(it.get("apellido")as String?)
                edadArsenal5.setText(it.get("edad")as String?)
                nacionalidadArsenal5.setText(it.get("nacionalidad")as String?)
                posicionArsenal5.setText(it.get("posicion")as String?)
            }

        }

        btnNextArsenal5.setOnClickListener{
            val intent = Intent(this, Soares::class.java)
            startActivity(intent)

        }
    }
}