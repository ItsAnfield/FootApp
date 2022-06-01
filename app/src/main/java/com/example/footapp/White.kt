package com.example.footapp

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.TextView
import com.google.firebase.firestore.FirebaseFirestore

class White : AppCompatActivity() {

    val db = FirebaseFirestore.getInstance()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_white)

        val nombreArsenal3 = findViewById<TextView>(R.id.nombreArsenal3)
        val apellidoArsenal3 = findViewById<TextView>(R.id.apellidoArsenal3)
        val nacionalidadArsenal3 = findViewById<TextView>(R.id.nacionalidadArsenal3)
        val edadArsenal3 = findViewById<TextView>(R.id.edadArsenal3)
        val posicionArsenal3 = findViewById<TextView>(R.id.posicionArsenal4)
        val arsenalGO3 = findViewById<Button>(R.id.arsenalGo3)
        val btnNextArsenal3 = findViewById<Button>(R.id.btnNextArsenal3)

        arsenalGO3.setOnClickListener{
            db.collection("/equipos/aMjroQ5RT68MuT7CKINl/jugadores").document("PR0QZVkI5FCu4XIzy2k9").get().addOnSuccessListener {
                nombreArsenal3.setText(it.get("nombre")as String?)
                apellidoArsenal3.setText(it.get("apellido")as String?)
                edadArsenal3.setText(it.get("edad")as String?)
                nacionalidadArsenal3.setText(it.get("nacionalidad")as String?)
                posicionArsenal3.setText(it.get("posicion")as String?)

            }

        }

        btnNextArsenal3.setOnClickListener{
            val intent = Intent(this, Tomiyasu::class.java)
            startActivity(intent)

        }
    }
}