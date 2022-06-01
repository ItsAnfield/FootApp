package com.example.footapp

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.TextView
import com.google.firebase.firestore.FirebaseFirestore

class Lacazette : AppCompatActivity() {

    val db = FirebaseFirestore.getInstance()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_lacazette)

        val nombreArsenal9 = findViewById<TextView>(R.id.nombreArsenal4)
        val apellidoArsenal9 = findViewById<TextView>(R.id.apellidoArsenal4)
        val nacionalidadArsenal9 = findViewById<TextView>(R.id.nacionalidadArsenal4)
        val posicionArsenal9 = findViewById<TextView>(R.id.posicionArsenal4)
        val edadArsenal9 = findViewById<TextView>(R.id.edadArsenal4)
        val arsenalGO9 = findViewById<Button>(R.id.arsenalGo4)
        val btnNextArsenal9 = findViewById<Button>(R.id.btnNextArsenal4)



        arsenalGO9.setOnClickListener{
            db.collection("/equipos/aMjroQ5RT68MuT7CKINl/jugadores").document("LQ5z2K2LMxSwuaWfig4C").get().addOnSuccessListener {
                nombreArsenal9.setText(it.get("nombre")as String?)
                apellidoArsenal9.setText(it.get("apellido")as String?)
                edadArsenal9.setText(it.get("edad")as String?)
                nacionalidadArsenal9.setText(it.get("nacionalidad")as String?)
                posicionArsenal9.setText(it.get("posicion")as String?)
            }

        }

        btnNextArsenal9.setOnClickListener{
            val intent = Intent(this, Pepe::class.java)
            startActivity(intent)

        }
    }
}