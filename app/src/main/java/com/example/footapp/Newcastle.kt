package com.example.footapp

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ImageButton
import android.widget.TextView
import com.google.firebase.firestore.FirebaseFirestore

class Newcastle : AppCompatActivity() {

    val db = FirebaseFirestore.getInstance()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_newcastle)

        val loadDataNewcastle = findViewById<ImageButton>(R.id.dataNewcastle)
        val nombreClub = findViewById<TextView>(R.id.nombreClubNewcastle)
        val nombreEstadio = findViewById<TextView>(R.id.nombreEstadioNewcastle)
        val nombreEntrenador = findViewById<TextView>(R.id.nombreEntrenadorNewcastle)
        val anyoFundacion = findViewById<TextView>(R.id.anyoFundacionNewcastle)

        loadDataNewcastle.setOnClickListener{
            db.collection("equipos").document("zagD9OIGQmp2mLWKHAOq").get().addOnSuccessListener {
                nombreClub.setText(it.get("nombre")as String?)
                nombreEstadio.setText(it.get("estadio")as String?)
                nombreEntrenador.setText(it.get("entrenador")as String?)
                anyoFundacion.setText(it.get("fundacion")as String?)

            }
        }


    }
}