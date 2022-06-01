package com.example.footapp

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.Toast

class Menu3 : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_menu3)

        val btnLiverpool= findViewById<Button>(R.id.btnLiverpool)
        val btnManC = findViewById<Button>(R.id.btnManC)
        val btnManU = findViewById<Button>(R.id.btnManU)
        val btnNewcastle = findViewById<Button>(R.id.btnNewcastle)
        val btnNorwich = findViewById<Button>(R.id.btnNorwich)
        val btnNext = findViewById<Button>(R.id.next3)

        // Funcionalidad del boton Liverpool
        btnLiverpool.setOnClickListener{
            val intent = Intent(this, Liverpool::class.java)
            startActivity(intent)
            Toast.makeText(this, "Welcome back red!", Toast.LENGTH_LONG).show()
        }

        // Funcionalidad del boton Manchester City
        btnManC.setOnClickListener{
            val intent = Intent(this, ManchesterCity::class.java)
            startActivity(intent)
            Toast.makeText(this, "Welcome back cityzen!", Toast.LENGTH_LONG).show()
        }

        // Funcionalidad del boton Manchester United
        btnManU.setOnClickListener{
            val intent = Intent(this, ManchesterUnited::class.java)
            startActivity(intent)
            Toast.makeText(this, "Welcome back red devil!", Toast.LENGTH_LONG).show()
        }

        // Funcionalidad del boton Newcastle
        btnNewcastle.setOnClickListener{
            val intent = Intent(this, Newcastle::class.java)
            startActivity(intent)
            Toast.makeText(this, "Welcome back red magpie!", Toast.LENGTH_LONG).show()
        }

        // Funcionalidad del boton Norwich
        btnNorwich.setOnClickListener{
            val intent = Intent(this, Norwich::class.java)
            startActivity(intent)
            Toast.makeText(this, "Welcome back red Canarie!", Toast.LENGTH_LONG).show()
        }

        // Funcionalidad del boton Siguiente
        btnNext.setOnClickListener{
            val intent = Intent(this, Menu4::class.java)
            startActivity(intent)
        }






    }
}