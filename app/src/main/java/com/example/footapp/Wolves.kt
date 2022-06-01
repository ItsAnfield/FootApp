package com.example.footapp

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ImageButton
import android.widget.TextView
import com.google.firebase.firestore.FirebaseFirestore

class Wolves : AppCompatActivity() {

    val db = FirebaseFirestore.getInstance()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_wolves)

        val loadDataWolves = findViewById<ImageButton>(R.id.dataWolves)
        val nombreClub = findViewById<TextView>(R.id.nombreClubWolves)
        val nombreEstadio = findViewById<TextView>(R.id.nombreEstadioWolves)
        val nombreEntrenador = findViewById<TextView>(R.id.nombreEntrenadorWolves)
        val anyoFundacion = findViewById<TextView>(R.id.anyoFundacionWolves)

        loadDataWolves.setOnClickListener{
            db.collection("equipos").document("g6ZjsNQJ7b6iFzO7uYp0").get().addOnSuccessListener {
                nombreClub.setText(it.get("nombre")as String?)
                nombreEstadio.setText(it.get("estadio")as String?)
                nombreEntrenador.setText(it.get("entrenador")as String?)
                anyoFundacion.setText(it.get("fundacion")as String?)

            }
        }
    }
}