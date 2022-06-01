package com.example.footapp

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.TextView
import com.google.firebase.firestore.FirebaseFirestore

class McGinn : AppCompatActivity() {

    val db = FirebaseFirestore.getInstance()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_mc_ginn)

        val nombreVilla = findViewById<TextView>(R.id.nombreVilla)
        val apellidoVilla = findViewById<TextView>(R.id.apellidoVilla)
        val nacionalidadVilla = findViewById<TextView>(R.id.nacionalidadVilla)
        val edadVilla = findViewById<TextView>(R.id.edadVilla)
        val posicionVilla = findViewById<TextView>(R.id.posicionVilla)
        val goVilla = findViewById<Button>(R.id.goVilla)
        val moreVilla = findViewById<Button>(R.id.moreVilla)
        val nextVilla = findViewById<Button>(R.id.nextVilla)

        goVilla.setOnClickListener{
            db.collection("/equipos/lolfkeGassOwIN2YOogh/jugadores").document("iam76AAgzFZfMqv1YcIU").get().addOnSuccessListener {
                nombreVilla.setText(it.get("nombre")as String?)
                apellidoVilla.setText(it.get("apellido")as String?)
                edadVilla.setText(it.get("edad")as String?)
                nacionalidadVilla.setText(it.get("nacionalidad")as String?)
                posicionVilla.setText(it.get("posicion")as String?)
            }

        }

        nextVilla.setOnClickListener {
            val intent = Intent(this, Sanson::class.java)
            startActivity(intent)

        }
    }
}