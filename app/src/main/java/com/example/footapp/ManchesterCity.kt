package com.example.footapp

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ImageButton
import android.widget.TextView
import com.google.firebase.firestore.FirebaseFirestore

class ManchesterCity : AppCompatActivity() {

    val db = FirebaseFirestore.getInstance()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_manchester_city)

        val loadDataManchesterCity = findViewById<ImageButton>(R.id.dataManCity)
        val nombreClub = findViewById<TextView>(R.id.nombreClubMancity)
        val nombreEstadio = findViewById<TextView>(R.id.nombreEstadioMancity)
        val nombreEntrenador = findViewById<TextView>(R.id.nombreEntrenadorMancity)
        val anyoFundacion = findViewById<TextView>(R.id.anyoFundacionMancity)

        loadDataManchesterCity.setOnClickListener{
            db.collection("equipos").document("kQ01jGUGqEhMHlJHW9vo").get().addOnSuccessListener {
                nombreClub.setText(it.get("nombre")as String?)
                nombreEstadio.setText(it.get("estadio")as String?)
                nombreEntrenador.setText(it.get("entrenador")as String?)
                anyoFundacion.setText(it.get("fundacion")as String?)

            }
        }
    }
}