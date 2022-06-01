package com.example.footapp

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.TextView
import com.google.firebase.firestore.FirebaseFirestore

class Pepe : AppCompatActivity() {

    val db = FirebaseFirestore.getInstance()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_pepe)

        val nombreArsenal10 = findViewById<TextView>(R.id.nombreArsenal4)
        val apellidoArsenal10 = findViewById<TextView>(R.id.apellidoArsenal4)
        val nacionalidadArsenal10 = findViewById<TextView>(R.id.nacionalidadArsenal4)
        val posicionArsenal10 = findViewById<TextView>(R.id.posicionArsenal4)
        val edadArsenal10 = findViewById<TextView>(R.id.edadArsenal4)
        val arsenalGO10 = findViewById<Button>(R.id.arsenalGo4)
        val btnNextArsenal10 = findViewById<Button>(R.id.btnNextArsenal4)



        arsenalGO10.setOnClickListener{
            db.collection("/equipos/aMjroQ5RT68MuT7CKINl/jugadores").document("NwN5GFHaKhK33igE1oX2").get().addOnSuccessListener {
                nombreArsenal10.setText(it.get("nombre")as String?)
                apellidoArsenal10.setText(it.get("apellido")as String?)
                edadArsenal10.setText(it.get("edad")as String?)
                nacionalidadArsenal10.setText(it.get("nacionalidad")as String?)
                posicionArsenal10.setText(it.get("posicion")as String?)
            }

        }

        btnNextArsenal10.setOnClickListener {
            val intent = Intent(this, Martinelli::class.java)
            startActivity(intent)
        }
    }
}