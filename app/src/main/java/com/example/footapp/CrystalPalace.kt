package com.example.footapp

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ImageButton
import android.widget.TextView
import com.google.firebase.firestore.FirebaseFirestore

class CrystalPalace : AppCompatActivity() {

    val db = FirebaseFirestore.getInstance()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_crystal_palace)

        val loadDataPalace = findViewById<ImageButton>(R.id.dataPalace)
        val nombreClub = findViewById<TextView>(R.id.nombreClubPalace)
        val nombreEstadio = findViewById<TextView>(R.id.nombreEstadioPalace)
        val nombreEntrenador = findViewById<TextView>(R.id.nombreEntrenadorPalace)
        val anyoFundacion = findViewById<TextView>(R.id.anyoFundacionPalace)

        loadDataPalace.setOnClickListener{
            db.collection("equipos").document("XReu2hwMgAUr8w9DjSx2").get().addOnSuccessListener {
                nombreClub.setText(it.get("nombre")as String?)
                nombreEstadio.setText(it.get("estadio")as String?)
                nombreEntrenador.setText(it.get("entrenador")as String?)
                anyoFundacion.setText(it.get("fundacion")as String?)

            }
        }
    }
}