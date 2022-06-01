package com.example.footapp

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ImageButton
import android.widget.TextView
import com.google.firebase.firestore.FirebaseFirestore

class ManchesterUnited : AppCompatActivity() {

    val db = FirebaseFirestore.getInstance()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_manchester_united)

        val loadDataManchesterUnited = findViewById<ImageButton>(R.id.dataManUnited)
        val nombreClub = findViewById<TextView>(R.id.nombreClubManUnited)
        val nombreEstadio = findViewById<TextView>(R.id.nombreEstadioManUnited)
        val nombreEntrenador = findViewById<TextView>(R.id.nombreEntrenadorManUnited)
        val anyoFundacion = findViewById<TextView>(R.id.anyoFundacionManUnited)

        loadDataManchesterUnited.setOnClickListener{
            db.collection("equipos").document("u2FzmGISFQrzry5UQ9dW").get().addOnSuccessListener {
                nombreClub.setText(it.get("nombre")as String?)
                nombreEstadio.setText(it.get("estadio")as String?)
                nombreEntrenador.setText(it.get("entrenador")as String?)
                anyoFundacion.setText(it.get("fundacion")as String?)

            }
        }
    }
}