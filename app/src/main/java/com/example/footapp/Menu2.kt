package com.example.footapp

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.Toast

class Menu2 : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_menu2)

        val btnChelsea = findViewById<Button>(R.id.btnChelsea)
        val btnCrystalPalace = findViewById<Button>(R.id.btnPalace)
        val btnEverton = findViewById<Button>(R.id.btnEverton)
        val btnLeeds = findViewById<Button>(R.id.btnLeeds)
        val btnLeicester = findViewById<Button>(R.id.btnLeicester)
        val btnNext = findViewById<Button>(R.id.next2)


        // Funcionalidad del boton Chelsea
        btnChelsea.setOnClickListener{
            val intent = Intent(this, Chelsea::class.java)
            startActivity(intent)
            Toast.makeText(this, "Bienvenido!", Toast.LENGTH_LONG).show()
        }

        // Funcionalidad del boton Crystal Palace
        btnCrystalPalace.setOnClickListener{
            val intent = Intent(this, CrystalPalace::class.java)
            startActivity(intent)
            Toast.makeText(this, "Welcome back Eagle!", Toast.LENGTH_LONG).show()
        }

        // Funcionalidad del boton Everton
        btnEverton.setOnClickListener{
            val intent = Intent(this, Everton::class.java)
            startActivity(intent)
            Toast.makeText(this, "Welcome back Toffee!", Toast.LENGTH_LONG).show()
        }

        // Funcionalidad del boton Leeds
        btnLeeds.setOnClickListener{
            val intent = Intent(this, Leeds::class.java)
            startActivity(intent)
            Toast.makeText(this, "Welcome back white!", Toast.LENGTH_LONG).show()
        }

        // Funcionalidad del boton Leicester
        btnLeicester.setOnClickListener{
            val intent = Intent(this, Leicester::class.java)
            startActivity(intent)
            Toast.makeText(this, "Welcome back Fox!", Toast.LENGTH_LONG).show()
        }

        // Funcionalidad del boton Siguiente
        btnNext.setOnClickListener{
            val intent = Intent(this, Menu3::class.java)
            startActivity(intent)
        }


    }
}