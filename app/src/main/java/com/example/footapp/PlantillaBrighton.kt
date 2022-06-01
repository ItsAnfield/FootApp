package com.example.footapp

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class PlantillaBrighton : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_plantilla_brighton)

        val porterosBrighton = findViewById<Button>(R.id.porterosBrighton)
        val defensasBrighton = findViewById<Button>(R.id.defensasBrighton)
        val mediosBrighton = findViewById<Button>(R.id.centrocampistasBrighton)
        val delanterosBrighton = findViewById<Button>(R.id.delanterosBrighton)

        // Funcionalidad del icono de la plantilla
        defensasBrighton.setOnClickListener{
            val intent = Intent(this, Veltman::class.java)
            startActivity(intent)

        }

        porterosBrighton.setOnClickListener{
            val intent = Intent(this, Steele::class.java)
            startActivity(intent)

        }

        mediosBrighton.setOnClickListener{
            val intent = Intent(this, Mwepu::class.java)
            startActivity(intent)

        }

        delanterosBrighton.setOnClickListener{
            val intent = Intent(this, Trossard::class.java)
            startActivity(intent)
        }


    }
}