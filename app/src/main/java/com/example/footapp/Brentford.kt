package com.example.footapp

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.ImageButton
import android.widget.TextView
import com.google.firebase.firestore.FirebaseFirestore

class Brentford : AppCompatActivity() {

    val db = FirebaseFirestore.getInstance()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_brentford)

        val dataBrentford = findViewById<ImageButton>(R.id.dataBrentford)
        val nombreClub = findViewById<TextView>(R.id.nombreClubBrentford)
        val nombreEstadio = findViewById<TextView>(R.id.nombreEstadioBrentford)
        val nombreEntrenador = findViewById<TextView>(R.id.nombreEntrenadorBrentford)
        val anyoFundacion = findViewById<TextView>(R.id.anyoFundacionBrentford)


        dataBrentford.setOnClickListener {
            db.collection("equipos").document("J0mTddOJzjKtsezuoyoB").get().addOnSuccessListener {
                nombreClub.setText(it.get("nombre") as String?)
                nombreEstadio.setText(it.get("estadio") as String?)
                nombreEntrenador.setText(it.get("entrenador") as String?)
                anyoFundacion.setText(it.get("fundacion") as String?)

            }
        }
    }
}