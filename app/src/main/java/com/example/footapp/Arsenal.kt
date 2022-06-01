package com.example.footapp

import android.content.Intent
import android.media.Image
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.ImageButton
import android.widget.TextView
import android.widget.Toast
import com.google.firebase.firestore.FirebaseFirestore

class Arsenal : AppCompatActivity() {

    val db = FirebaseFirestore.getInstance()


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_arsenal)

        val loadDataArsenal = findViewById<ImageButton>(R.id.dataArsenal)
        val nombreClubArsenal = findViewById<TextView>(R.id.nombreClubArsenal)
        val nombreEstadioArsenal = findViewById<TextView>(R.id.nombreEstadioArsenal)
        val nombreEntrenadorArsenal = findViewById<TextView>(R.id.nombreEntrenadorArsenal)
        val anyoFundacionArsenal = findViewById<TextView>(R.id.anyoFundacionArsenal)
        val plantillaArsenal = findViewById<ImageButton>(R.id.plantillaArsenal)

        // Funcionalidad del icono de la plantilla
        plantillaArsenal.setOnClickListener{
            val intent = Intent(this, PlantillaArsenal::class.java)
            startActivity(intent)

        }

        loadDataArsenal.setOnClickListener{
            db.collection("equipos").document("aMjroQ5RT68MuT7CKINl").get().addOnSuccessListener {
                nombreClubArsenal.setText(it.get("nombre")as String?)
                nombreEstadioArsenal.setText(it.get("estadio")as String?)
                nombreEntrenadorArsenal.setText(it.get("entrenador")as String?)
                anyoFundacionArsenal.setText(it.get("fundacion")as String?)
            }
        }




    }
}