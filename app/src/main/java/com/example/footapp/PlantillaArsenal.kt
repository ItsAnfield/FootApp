package com.example.footapp

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class PlantillaArsenal : AppCompatActivity() {


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_plantilla_arsenal)

        val porterosArsenal = findViewById<Button>(R.id.btnporterosArsenal)
        val defensasArsenal = findViewById<Button>(R.id.btnDefensaArsenal)
        val centrocampistasArsenal = findViewById<Button>(R.id.btnCentrocampistasArsenal)
        val delanterosArsenal = findViewById<Button>(R.id.btnDelanterosArsenal)

        // Funcionalidad del icono de la plantilla
        porterosArsenal.setOnClickListener{
            val intent = Intent(this, Ramsdale::class.java)
            startActivity(intent)

        }

        defensasArsenal.setOnClickListener{
            val intent = Intent(this, White::class.java)
            startActivity(intent)

        }

        centrocampistasArsenal.setOnClickListener{
            val intent = Intent(this, Xhaka::class.java)
            startActivity(intent)

        }

        delanterosArsenal.setOnClickListener{
            val intent = Intent(this, Lacazette::class.java)
            startActivity(intent)

        }











    }
}