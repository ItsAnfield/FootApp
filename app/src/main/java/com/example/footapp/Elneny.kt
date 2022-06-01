package com.example.footapp

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.TextView
import com.google.firebase.firestore.FirebaseFirestore

class Elneny : AppCompatActivity() {

    val db = FirebaseFirestore.getInstance()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_elneny)

        val nombreArsenal4 = findViewById<TextView>(R.id.nombreArsenal4)
        val apellidoArsenal4 = findViewById<TextView>(R.id.apellidoArsenal4)
        val nacionalidadArsenal4 = findViewById<TextView>(R.id.nacionalidadArsenal4)
        val posicionArsenal4 = findViewById<TextView>(R.id.posicionArsenal4)
        val edadArsenal4 = findViewById<TextView>(R.id.edadArsenal4)
        val arsenalGO4 = findViewById<Button>(R.id.arsenalGo4)
        val btnNextArsenal4 = findViewById<Button>(R.id.btnNextArsenal4)



        arsenalGO4.setOnClickListener{
            db.collection("/equipos/aMjroQ5RT68MuT7CKINl/jugadores").document("mPTvyw6EEVoga9oNNSQZ").get().addOnSuccessListener {
                nombreArsenal4.setText(it.get("nombre")as String?)
                apellidoArsenal4.setText(it.get("apellido")as String?)
                edadArsenal4.setText(it.get("edad")as String?)
                nacionalidadArsenal4.setText(it.get("nacionalidad")as String?)
                posicionArsenal4.setText(it.get("posicion")as String?)
            }

        }

        btnNextArsenal4.setOnClickListener{
            val intent = Intent(this, Partey::class.java)
            startActivity(intent)

        }
    }
}