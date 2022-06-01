package com.example.footapp

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.ImageButton
import android.widget.TextView
import com.google.firebase.firestore.FirebaseFirestore

class Chelsea : AppCompatActivity() {

    val db = FirebaseFirestore.getInstance()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_chelsea)

        val loadDataChelsea = findViewById<ImageButton>(R.id.loadDataChelsea)
        val nombreClub = findViewById<TextView>(R.id.nombreClubChelsea)
        val nombreEstadio = findViewById<TextView>(R.id.nombreEstadioChelsea)
        val nombreEntrenador = findViewById<TextView>(R.id.nombreEntrenadorChelsea)
        val anyoFundacion = findViewById<TextView>(R.id.anyoFundacionChelsea)

        loadDataChelsea.setOnClickListener{
            db.collection("equipos").document("GQw0cKPJOkeSV4cAh56z").get().addOnSuccessListener {
                nombreClub.setText(it.get("nombre")as String?)
                nombreEstadio.setText(it.get("estadio")as String?)
                nombreEntrenador.setText(it.get("entrenador")as String?)
                anyoFundacion.setText(it.get("fundacion")as String?)

            }
        }


    }
}