package com.example.footapp

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.TextView
import com.google.firebase.firestore.FirebaseFirestore

class Xhaka : AppCompatActivity() {

    val db = FirebaseFirestore.getInstance()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_xhaka)

        val nombreArsenal7 = findViewById<TextView>(R.id.nombreArsenal7)
        val apellidoArsenal7 = findViewById<TextView>(R.id.apellidoArsenal7)
        val nacionalidadArsenal7 = findViewById<TextView>(R.id.nacionalidadArsenal7)
        val posicionArsenal7 = findViewById<TextView>(R.id.posicionArsenal4)
        val edadArsenal7 = findViewById<TextView>(R.id.edadArsenal7)
        val arsenalGO7 = findViewById<Button>(R.id.arsenalGo7)
        val btnNextArsenal7 = findViewById<Button>(R.id.btnNextArsenal7)



        arsenalGO7.setOnClickListener{
            db.collection("/equipos/aMjroQ5RT68MuT7CKINl/jugadores").document("HjgZoxthaxSJ6Z8ZZTMH").get().addOnSuccessListener {
                nombreArsenal7.setText(it.get("nombre")as String?)
                apellidoArsenal7.setText(it.get("apellido")as String?)
                edadArsenal7.setText(it.get("edad")as String?)
                nacionalidadArsenal7.setText(it.get("nacionalidad")as String?)
                posicionArsenal7.setText(it.get("posicion")as String?)
            }

        }

        btnNextArsenal7.setOnClickListener{
            val intent = Intent(this, Odegaard::class.java)
            startActivity(intent)

        }
    }
}