package com.example.footapp

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class PlantillaAstonVilla : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_plantilla_aston_villa)

        val porterosVilla = findViewById<Button>(R.id.porterosVilla)
        val defensasVilla = findViewById<Button>(R.id.defensasVilla)
        val mediosVilla = findViewById<Button>(R.id.centrocampistasVilla)
        val delanterosVilla = findViewById<Button>(R.id.delanterosVilla)


        // Funcionalidad del icono de la plantilla
        porterosVilla.setOnClickListener{
            val intent = Intent(this, Emi::class.java)
            startActivity(intent)

        }

        mediosVilla.setOnClickListener{
            val intent = Intent(this, jacobRamsey::class.java)
            startActivity(intent)

        }

        delanterosVilla.setOnClickListener{
            val intent = Intent(this, Bailey::class.java)
            startActivity(intent)

        }

        defensasVilla.setOnClickListener{
            val intent = Intent(this, Hause::class.java)
            startActivity(intent)

        }




    }
}