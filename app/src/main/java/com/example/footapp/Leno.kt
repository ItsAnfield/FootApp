package com.example.footapp

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.TextView
import com.google.firebase.firestore.FirebaseFirestore

class Leno : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {

        val db = FirebaseFirestore.getInstance()

        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_porteros_arsenal2)

        val nombreArsenal2 = findViewById<TextView>(R.id.nombreArsenal2)
        val apellidoArsenal2 = findViewById<TextView>(R.id.apellidoArsenal2)
        val nacionalidadArsenal2 = findViewById<TextView>(R.id.nacionalidadArsenal2)
        val edadArsenal2 = findViewById<TextView>(R.id.edadArsenal2)
        val arsenalGO2 = findViewById<Button>(R.id.arsenalGo2)
        val btnNextArsenal1 = findViewById<Button>(R.id.btnNextArsenal1)

        arsenalGO2.setOnClickListener{
            db.collection("/equipos/aMjroQ5RT68MuT7CKINl/jugadores").document("bKhiaiwTtgodyLuwFqw0").get().addOnSuccessListener {
                nombreArsenal2.setText(it.get("nombre")as String?)
                apellidoArsenal2.setText(it.get("apellido")as String?)
                edadArsenal2.setText(it.get("edad")as String?)
                nacionalidadArsenal2.setText(it.get("nacionalidad")as String?)

            }

        }
        btnNextArsenal1.setOnClickListener{
            val intent = Intent(this, PlantillaArsenal::class.java)
            startActivity(intent)

        }
    }
}