package com.example.footapp

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ImageButton
import android.widget.TextView
import com.google.firebase.firestore.FirebaseFirestore

class WestHam : AppCompatActivity() {

    val db = FirebaseFirestore.getInstance()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_west_ham)

        val loadDataWestHam= findViewById<ImageButton>(R.id.dataWestHam)
        val nombreClub = findViewById<TextView>(R.id.nombreClubWestham)
        val nombreEstadio = findViewById<TextView>(R.id.nombreEstadioWestham)
        val nombreEntrenador = findViewById<TextView>(R.id.nombreEntrenadorWestham)
        val anyoFundacion = findViewById<TextView>(R.id.anyoFundacionWestham)

        loadDataWestHam.setOnClickListener{
            db.collection("equipos").document("Uk7jTrKyD62wg2ldzNjh").get().addOnSuccessListener {
                nombreClub.setText(it.get("nombre")as String?)
                nombreEstadio.setText(it.get("estadio")as String?)
                nombreEntrenador.setText(it.get("entrenador")as String?)
                anyoFundacion.setText(it.get("fundacion")as String?)

            }
        }
    }
}