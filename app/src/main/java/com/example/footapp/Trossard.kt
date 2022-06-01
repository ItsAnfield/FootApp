package com.example.footapp

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.TextView
import com.google.firebase.firestore.FirebaseFirestore

class Trossard : AppCompatActivity() {

    val db = FirebaseFirestore.getInstance()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_trossard)

        val nombreBrighton = findViewById<TextView>(R.id.nombreBrighton)
        val apellidoBrighton = findViewById<TextView>(R.id.apellidoBrighton)
        val nacionalidadBrighton = findViewById<TextView>(R.id.nacionalidadBrighton)
        val edadBrighton = findViewById<TextView>(R.id.edadBrighton)
        val posicionBrighton = findViewById<TextView>(R.id.posicionBrighton)
        val goBrighton = findViewById<Button>(R.id.goBrighton)
        val moreBrighton = findViewById<Button>(R.id.moreBrighton)
        val nextBrighton= findViewById<Button>(R.id.nextBrighton)


        goBrighton.setOnClickListener{
            db.collection("/equipos/C35FcMnIkwzz3tShzbkB/jugadores").document("I90umIn6ox1qKe1O8xtV").get().addOnSuccessListener {
                nombreBrighton.setText(it.get("nombre")as String?)
                apellidoBrighton.setText(it.get("apellido")as String?)
                edadBrighton.setText(it.get("edad")as String?)
                nacionalidadBrighton.setText(it.get("nacionalidad")as String?)
                posicionBrighton.setText(it.get("posicion")as String?)

            }

        }

        nextBrighton.setOnClickListener{
            val intent = Intent(this, Welbeck::class.java)
            startActivity(intent)

        }
    }
}