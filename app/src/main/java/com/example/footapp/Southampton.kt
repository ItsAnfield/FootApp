package com.example.footapp

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ImageButton
import android.widget.TextView
import com.google.firebase.firestore.FirebaseFirestore

class Southampton : AppCompatActivity() {

    val db = FirebaseFirestore.getInstance()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_southampton)

        val loadDataSouthampton = findViewById<ImageButton>(R.id.dataSouthampton)
        val nombreClub = findViewById<TextView>(R.id.nombreClubSouthampton)
        val nombreEstadio = findViewById<TextView>(R.id.nombreEstadioSouthampton)
        val nombreEntrenador = findViewById<TextView>(R.id.nombreEntrenadorSouthampton)
        val anyoFundacion = findViewById<TextView>(R.id.anyoFundacionSouthampton)

        loadDataSouthampton.setOnClickListener{
            db.collection("equipos").document("EW0Q3sDccCi88VZOREFY").get().addOnSuccessListener {
                nombreClub.setText(it.get("nombre")as String?)
                nombreEstadio.setText(it.get("estadio")as String?)
                nombreEntrenador.setText(it.get("entrenador")as String?)
                anyoFundacion.setText(it.get("fundacion")as String?)

            }
        }
    }
}