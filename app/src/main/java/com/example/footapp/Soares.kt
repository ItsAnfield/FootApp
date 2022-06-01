package com.example.footapp

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.TextView
import com.google.firebase.firestore.FirebaseFirestore

class Soares : AppCompatActivity() {

    val db = FirebaseFirestore.getInstance()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_soares)

        val nombreArsenal6 = findViewById<TextView>(R.id.nombreArsenal7)
        val apellidoArsenal6 = findViewById<TextView>(R.id.apellidoArsenal7)
        val nacionalidadArsenal6 = findViewById<TextView>(R.id.nacionalidadArsenal7)
        val posicionArsenal6 = findViewById<TextView>(R.id.posicionArsenal4)
        val edadArsenal6 = findViewById<TextView>(R.id.edadArsenal7)
        val arsenalGO6 = findViewById<Button>(R.id.arsenalGo7)
        val btnNextArsenal6 = findViewById<Button>(R.id.btnNextArsenal7)

        arsenalGO6.setOnClickListener{
            db.collection("/equipos/aMjroQ5RT68MuT7CKINl/jugadores").document("7B2XiBYggmxFDrfBL32M").get().addOnSuccessListener {
                nombreArsenal6.setText(it.get("nombre")as String?)
                apellidoArsenal6.setText(it.get("apellido")as String?)
                edadArsenal6.setText(it.get("edad")as String?)
                nacionalidadArsenal6.setText(it.get("nacionalidad")as String?)
                posicionArsenal6.setText(it.get("posicion")as String?)
            }

        }

        btnNextArsenal6.setOnClickListener{
            val intent = Intent(this, Tierney::class.java)
            startActivity(intent)

        }
    }
}