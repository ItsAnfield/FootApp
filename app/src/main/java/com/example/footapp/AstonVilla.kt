package com.example.footapp

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.ImageButton
import android.widget.TextView
import com.google.firebase.firestore.FirebaseFirestore

class AstonVilla : AppCompatActivity() {

    val db = FirebaseFirestore.getInstance()


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_aston_villa)

        val loadDataVilla = findViewById<ImageButton>(R.id.dataVilla)
        val nombreClub = findViewById<TextView>(R.id.nombreClubVilla)
        val nombreEstadio = findViewById<TextView>(R.id.nombreEstadioVilla)
        val nombreEntrenador = findViewById<TextView>(R.id.nombreEntrenadorVilla)
        val anyoFundacion = findViewById<TextView>(R.id.anyoFundacionVilla)
        val plantillaVilla = findViewById<ImageButton>(R.id.plantillaVilla)

        loadDataVilla.setOnClickListener{
            db.collection("equipos").document("lolfkeGassOwIN2YOogh").get().addOnSuccessListener {
                nombreClub.setText(it.get("nombre")as String?)
                nombreEstadio.setText(it.get("estadio")as String?)
                nombreEntrenador.setText(it.get("entrenador")as String?)
                anyoFundacion.setText(it.get("fundacion")as String?)

            }
        }

        // Funcionalidad del icono de la plantilla
        plantillaVilla.setOnClickListener{
            val intent = Intent(this, PlantillaAstonVilla::class.java)
            startActivity(intent)

        }


    }
}