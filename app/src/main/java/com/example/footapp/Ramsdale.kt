package com.example.footapp

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.TextView
import com.google.firebase.firestore.FirebaseFirestore

class Ramsdale : AppCompatActivity() {

    val db = FirebaseFirestore.getInstance()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_porteros_arsenal)


        val nombreArsenal1 = findViewById<TextView>(R.id.nombreArsenal1)
        val apellidoArsenal1 = findViewById<TextView>(R.id.apellidoArsenal1)
        val nacionalidadArsenal1 = findViewById<TextView>(R.id.nacionalidadArsenal1)
        val edadArsenal1 = findViewById<TextView>(R.id.edadArsenal1)
        val arsenalGO1 = findViewById<Button>(R.id.arsenalGo1)
        val btnNextArsenal1 = findViewById<Button>(R.id.btnNextArsenal1)

        arsenalGO1.setOnClickListener{
            db.collection("/equipos/aMjroQ5RT68MuT7CKINl/jugadores").document("xkT86aq9gv9770ZZOYrx").get().addOnSuccessListener {
                nombreArsenal1.setText(it.get("nombre")as String?)
                apellidoArsenal1.setText(it.get("apellido")as String?)
                edadArsenal1.setText(it.get("edad")as String?)
                nacionalidadArsenal1.setText(it.get("nacionalidad")as String?)

            }

        }

        btnNextArsenal1.setOnClickListener{
            val intent = Intent(this, Leno::class.java)
            startActivity(intent)

        }


    }
}