package com.example.footapp

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.EditText
import android.widget.ImageButton
import android.widget.TextView
import com.google.firebase.firestore.FirebaseFirestore

class Burnley : AppCompatActivity() {

    val db = FirebaseFirestore.getInstance()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_burnley)

        val loadDataBurnley = findViewById<ImageButton>(R.id.loadDataBurnley)
        val nombreClub = findViewById<EditText>(R.id.nombreClubBurnley)
        val nombreEstadio = findViewById<EditText>(R.id.nombreEstadioBurnley)
        val nombreEntrenador = findViewById<EditText>(R.id.nombreEntrenadorBurnley)
        val anyoFundacion = findViewById<EditText>(R.id.anyoFundacionBurnley)

        loadDataBurnley.setOnClickListener{
            db.collection("equipos").document("oIOFvqYIItIx4BSpaxwZ").get().addOnSuccessListener {
                nombreClub.setText(it.get("nombre")as String?)
                nombreEstadio.setText(it.get("estadio")as String?)
                nombreEntrenador.setText(it.get("entrenador")as String?)
                anyoFundacion.setText(it.get("fundacion")as String?)

            }
        }



    }
}