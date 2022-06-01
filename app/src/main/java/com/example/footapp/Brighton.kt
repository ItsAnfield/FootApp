package com.example.footapp

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.ImageButton
import android.widget.TextView
import com.google.firebase.firestore.FirebaseFirestore
import com.google.firebase.ktx.Firebase

class Brighton : AppCompatActivity() {

    val db = FirebaseFirestore.getInstance()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_brighton)

        val dataBrighton = findViewById<ImageButton>(R.id.dataBrighton)
        val nombreClub = findViewById<TextView>(R.id.nombreClubBrighton)
        val nombreEstadio = findViewById<TextView>(R.id.nombreEstadioBrighton)
        val nombreEntrenador = findViewById<TextView>(R.id.nombreEntrenadorBrighton)
        val anyoFundacion = findViewById<TextView>(R.id.anyoFundacionBrighton)
        val plantillaBrighton = findViewById<ImageButton>(R.id.plantillaBrighton)

        dataBrighton.setOnClickListener{
            db.collection("equipos").document("C35FcMnIkwzz3tShzbkB").get().addOnSuccessListener {
                nombreClub.setText(it.get("nombre")as String?)
                nombreEstadio.setText(it.get("estadio")as String?)
                nombreEntrenador.setText(it.get("entrenador")as String?)
                anyoFundacion.setText(it.get("fundacion")as String?)

            }
        }
        // Funcionalidad del icono de la plantilla
        plantillaBrighton.setOnClickListener{
            val intent = Intent(this, PlantillaBrighton::class.java)
            startActivity(intent)

        }


    }
}