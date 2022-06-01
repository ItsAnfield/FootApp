package com.example.footapp

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.Toast

class Menu4 : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_menu4)

        val btnSouthampton= findViewById<Button>(R.id.btnSouthampton)
        val btnSpurs = findViewById<Button>(R.id.btnSpurs)
        val btnWatford = findViewById<Button>(R.id.btnWatford)
        val btnWestHam = findViewById<Button>(R.id.btnHam)
        val btnWolves = findViewById<Button>(R.id.btnWolves)

        // Funcionalidad del boton Southampton
        btnSouthampton.setOnClickListener{
            val intent = Intent(this, Southampton::class.java)
            startActivity(intent)
            Toast.makeText(this, "Welcome back Saint!", Toast.LENGTH_LONG).show()
        }

        // Funcionalidad del boton Spurs
        btnSpurs.setOnClickListener{
            val intent = Intent(this, Spurs::class.java)
            startActivity(intent)
            Toast.makeText(this, "Welcome back Spur!", Toast.LENGTH_LONG).show()
        }

        // Funcionalidad del boton Watford
        btnWatford.setOnClickListener{
            val intent = Intent(this, Watford::class.java)
            startActivity(intent)
            Toast.makeText(this, "Welcome back Bee!", Toast.LENGTH_LONG).show()
        }

        // Funcionalidad del boton Watford
        btnWatford.setOnClickListener{
            val intent = Intent(this, Watford::class.java)
            startActivity(intent)
            Toast.makeText(this, "Welcome back Bee!", Toast.LENGTH_LONG).show()
        }

        // Funcionalidad del boton West Ham
        btnWestHam.setOnClickListener{
            val intent = Intent(this, WestHam::class.java)
            startActivity(intent)
            Toast.makeText(this, "Welcome back Hammer!", Toast.LENGTH_LONG).show()
        }

        // Funcionalidad del boton Wolves
        btnWolves.setOnClickListener{
            val intent = Intent(this, Wolves::class.java)
            startActivity(intent)
            Toast.makeText(this, "Welcome back Wolf!", Toast.LENGTH_LONG).show()
        }




    }
}