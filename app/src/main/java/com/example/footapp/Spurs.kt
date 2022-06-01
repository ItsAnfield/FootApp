package com.example.footapp

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ImageButton
import android.widget.TextView
import com.google.firebase.firestore.FirebaseFirestore

class Spurs : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {

        val db = FirebaseFirestore.getInstance()

        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_spurs)

        val loadDataSpurs = findViewById<ImageButton>(R.id.dataSpurs)
        val nombreClub = findViewById<TextView>(R.id.nombreClubSpurs)
        val nombreEstadio = findViewById<TextView>(R.id.nombreEstadioSpurs)
        val nombreEntrenador = findViewById<TextView>(R.id.nombreEntrenadorSpurs)
        val anyoFundacion = findViewById<TextView>(R.id.anyoFundacionSpurs)

        loadDataSpurs.setOnClickListener{
            db.collection("equipos").document("7hGeQ7sFDIeyuBlkrRKL").get().addOnSuccessListener {
                nombreClub.setText(it.get("nombre")as String?)
                nombreEstadio.setText(it.get("estadio")as String?)
                nombreEntrenador.setText(it.get("entrenador")as String?)
                anyoFundacion.setText(it.get("fundacion")as String?)

            }
        }

    }
}