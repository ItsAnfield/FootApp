package com.example.footapp

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.TextView
import com.google.firebase.firestore.FirebaseFirestore

class Lokonga : AppCompatActivity() {

    val db = FirebaseFirestore.getInstance()


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_lokonga)

        val nombreArsenal12 = findViewById<TextView>(R.id.nombreArsenal4)
        val apellidoArsenal12 = findViewById<TextView>(R.id.apellidoArsenal4)
        val nacionalidadArsenal12 = findViewById<TextView>(R.id.nacionalidadArsenal4)
        val posicionArsenal12 = findViewById<TextView>(R.id.posicionArsenal4)
        val edadArsenal12 = findViewById<TextView>(R.id.edadArsenal4)
        val arsenalGO12 = findViewById<Button>(R.id.arsenalGo4)
        val btnNextArsenal12 = findViewById<Button>(R.id.btnNextArsenal4)



        arsenalGO12.setOnClickListener{
            db.collection("/equipos/aMjroQ5RT68MuT7CKINl/jugadores").document("VSg5et5tH9sfWZLnSzN9").get().addOnSuccessListener {
                nombreArsenal12.setText(it.get("nombre")as String?)
                apellidoArsenal12.setText(it.get("apellido")as String?)
                edadArsenal12.setText(it.get("edad")as String?)
                nacionalidadArsenal12.setText(it.get("nacionalidad")as String?)
                posicionArsenal12.setText(it.get("posicion")as String?)
            }

        }

        btnNextArsenal12.setOnClickListener{
            val intent = Intent(this, Rowe::class.java)
            startActivity(intent)

        }
    }
}