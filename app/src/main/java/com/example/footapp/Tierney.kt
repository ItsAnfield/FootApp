package com.example.footapp

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.TextView
import com.google.firebase.firestore.FirebaseFirestore

class Tierney : AppCompatActivity() {

    val db = FirebaseFirestore.getInstance()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_tierney)

        val nombreArsenal8 = findViewById<TextView>(R.id.nombreArsenal4)
        val apellidoArsenal8 = findViewById<TextView>(R.id.apellidoArsenal4)
        val nacionalidadArsenal8 = findViewById<TextView>(R.id.nacionalidadArsenal4)
        val posicionArsenal8 = findViewById<TextView>(R.id.posicionArsenal4)
        val edadArsenal8 = findViewById<TextView>(R.id.edadArsenal4)
        val arsenalGO8 = findViewById<Button>(R.id.arsenalGo4)
        val btnNextArsenal8 = findViewById<Button>(R.id.btnNextArsenal4)



        arsenalGO8.setOnClickListener{
            db.collection("/equipos/aMjroQ5RT68MuT7CKINl/jugadores").document("Ih647WnPDCfnFiITgcw3").get().addOnSuccessListener {
                nombreArsenal8.setText(it.get("nombre")as String?)
                apellidoArsenal8.setText(it.get("apellido")as String?)
                edadArsenal8.setText(it.get("edad")as String?)
                nacionalidadArsenal8.setText(it.get("nacionalidad")as String?)
                posicionArsenal8.setText(it.get("posicion")as String?)
            }

        }

        btnNextArsenal8.setOnClickListener {
            val intent = Intent(this, Tavares::class.java)
            startActivity(intent)

        }
    }
}