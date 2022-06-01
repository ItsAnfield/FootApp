package com.example.footapp

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ImageButton
import android.widget.TextView
import com.google.firebase.firestore.FirebaseFirestore

class Watford : AppCompatActivity() {

    val db = FirebaseFirestore.getInstance()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_watford)

        val loadDataWatford = findViewById<ImageButton>(R.id.dataWatford)
        val nombreClub = findViewById<TextView>(R.id.nombreClubWatford)
        val nombreEstadio = findViewById<TextView>(R.id.nombreEstadioWatford)
        val nombreEntrenador = findViewById<TextView>(R.id.nombreEntrenadorWatford)
        val anyoFundacion = findViewById<TextView>(R.id.anyoFundacionWatford)

        loadDataWatford.setOnClickListener{
            db.collection("equipos").document("yllXdZ1JO33R4dcs5GZv").get().addOnSuccessListener {
                nombreClub.setText(it.get("nombre")as String?)
                nombreEstadio.setText(it.get("estadio")as String?)
                nombreEntrenador.setText(it.get("entrenador")as String?)
                anyoFundacion.setText(it.get("fundacion")as String?)

            }
        }
    }
}