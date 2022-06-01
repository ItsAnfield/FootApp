package com.example.footapp

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ImageButton
import android.widget.TextView
import com.google.firebase.firestore.FirebaseFirestore

class Leicester : AppCompatActivity() {

    val db = FirebaseFirestore.getInstance()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_leicester)

        val loadDataLeicester = findViewById<ImageButton>(R.id.dataLeicester)
        val nombreClub = findViewById<TextView>(R.id.nombreClubLeicester)
        val nombreEstadio = findViewById<TextView>(R.id.nombreEstadioLeicester)
        val nombreEntrenador = findViewById<TextView>(R.id.nombreEntrenadorLeicester)
        val anyoFundacion = findViewById<TextView>(R.id.anyoFundacionLeicester)

        loadDataLeicester.setOnClickListener{
            db.collection("equipos").document("kH7XYNPfLleQxVQWC3Cp").get().addOnSuccessListener {
                nombreClub.setText(it.get("nombre")as String?)
                nombreEstadio.setText(it.get("estadio")as String?)
                nombreEntrenador.setText(it.get("entrenador")as String?)
                anyoFundacion.setText(it.get("fundacion")as String?)

            }
        }
    }
}