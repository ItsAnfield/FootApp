package com.example.footapp

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ImageButton
import android.widget.TextView
import com.google.firebase.firestore.FirebaseFirestore

class Leeds : AppCompatActivity() {

    val db = FirebaseFirestore.getInstance()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_leeds)

        val loadDataLeeds = findViewById<ImageButton>(R.id.dataLeeds)
        val nombreClub = findViewById<TextView>(R.id.nombreClubLeeds)
        val nombreEstadio = findViewById<TextView>(R.id.nombreEstadioLeeds)
        val nombreEntrenador = findViewById<TextView>(R.id.nombreEntrenadorLeeds)
        val anyoFundacion = findViewById<TextView>(R.id.anyoFundacionLeeds)

        loadDataLeeds.setOnClickListener{
            db.collection("equipos").document("yLkwcStHqQWWEA9S8THi").get().addOnSuccessListener {
                nombreClub.setText(it.get("nombre")as String?)
                nombreEstadio.setText(it.get("estadio")as String?)
                nombreEntrenador.setText(it.get("entrenador")as String?)
                anyoFundacion.setText(it.get("fundacion")as String?)

            }
        }
    }
}