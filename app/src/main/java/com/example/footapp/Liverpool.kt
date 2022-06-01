package com.example.footapp

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ImageButton
import android.widget.TextView
import com.google.firebase.firestore.FirebaseFirestore

class Liverpool : AppCompatActivity() {

    val db = FirebaseFirestore.getInstance()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_liverpool)

        val loadDataLiverpool = findViewById<ImageButton>(R.id.dataLiverpool)
        val nombreClub = findViewById<TextView>(R.id.nombreClubLiverpool)
        val nombreEstadio = findViewById<TextView>(R.id.nombreEstadioLiverpool)
        val nombreEntrenador = findViewById<TextView>(R.id.nombreEntrenadorLiverpool)
        val anyoFundacion = findViewById<TextView>(R.id.anyoFUndacionLiverpool)

        loadDataLiverpool.setOnClickListener{
            db.collection("equipos").document("DafDqlQvJStoiL7YZSsF").get().addOnSuccessListener {
                nombreClub.setText(it.get("nombre")as String?)
                nombreEstadio.setText(it.get("estadio")as String?)
                nombreEntrenador.setText(it.get("entrenador")as String?)
                anyoFundacion.setText(it.get("fundacion")as String?)

            }
        }
    }
}