package com.example.footapp

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ImageButton
import android.widget.TextView
import com.google.firebase.firestore.FirebaseFirestore

class Norwich : AppCompatActivity() {

    val db = FirebaseFirestore.getInstance()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_norwich)

        val loadDataNorwich = findViewById<ImageButton>(R.id.dataNorwich)
        val nombreClub = findViewById<TextView>(R.id.nombreClubNorwich)
        val nombreEstadio = findViewById<TextView>(R.id.nombreEstadioNorwich)
        val nombreEntrenador = findViewById<TextView>(R.id.nombreEntrenadorNorwich)
        val anyoFundacion = findViewById<TextView>(R.id.anyoFundacionNorwich)

        loadDataNorwich.setOnClickListener{
            db.collection("equipos").document("UKxZ6TJnKlqb0rP4J4i5").get().addOnSuccessListener {
                nombreClub.setText(it.get("nombre")as String?)
                nombreEstadio.setText(it.get("estadio")as String?)
                nombreEntrenador.setText(it.get("entrenador")as String?)
                anyoFundacion.setText(it.get("fundacion")as String?)

            }
        }


    }
}