package com.example.footapp

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ImageButton
import android.widget.TextView
import com.google.firebase.firestore.FirebaseFirestore

class Everton : AppCompatActivity() {

    val db = FirebaseFirestore.getInstance()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_everton)

        val loadDataEverton = findViewById<ImageButton>(R.id.dataEverton)
        val nombreClub = findViewById<TextView>(R.id.nombreClubEverton)
        val nombreEstadio = findViewById<TextView>(R.id.nombreEstadioEverton)
        val nombreEntrenador = findViewById<TextView>(R.id.nombreEntrenadorEverton)
        val anyoFundacion = findViewById<TextView>(R.id.anyoFundacionEverton)

        loadDataEverton.setOnClickListener{
            db.collection("equipos").document("HKaBe6903el0y1J98tnZ").get().addOnSuccessListener {
                nombreClub.setText(it.get("nombre")as String?)
                nombreEstadio.setText(it.get("estadio")as String?)
                nombreEntrenador.setText(it.get("entrenador")as String?)
                anyoFundacion.setText(it.get("fundacion")as String?)

            }
        }
    }
}