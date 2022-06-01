package com.example.footapp

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.Toast

class Menu1 : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_menu1)

        val btnVilla = findViewById<Button>(R.id.btnVilla)
        val btnArsenal = findViewById<Button>(R.id.btnArsenal)
        val btnBrentford = findViewById<Button>(R.id.btnBrentford)
        val btnBrighton = findViewById<Button>(R.id.btnBrighton)
        val btnBurnley = findViewById<Button>(R.id.btnBurnley)

        val btnNext1 = findViewById<Button>(R.id.next1)

        // Funcionalidad del boton Aston Villa
        btnVilla.setOnClickListener{
            val intent = Intent(this, AstonVilla::class.java)
            startActivity(intent)
            Toast.makeText(this, "Bienvenido Villano!", Toast.LENGTH_LONG).show()
        }

        // Funcionalidad del botón Arsenal
        btnArsenal.setOnClickListener{
            val intent = Intent(this,Arsenal::class.java)
            startActivity(intent)
            Toast.makeText(this,"Welcome back Gunner", Toast.LENGTH_LONG).show()
        }

        // Funcionalidad del botón Brentford
        btnBrentford.setOnClickListener{
            val intent = Intent(this,Brentford::class.java)
            startActivity(intent)
            Toast.makeText(this,"Welcome back!", Toast.LENGTH_LONG).show()
        }

        // Funcionalidad del botón Brighton
        btnBrighton.setOnClickListener{
            val intent = Intent(this,Brighton::class.java)
            startActivity(intent)
            Toast.makeText(this,"Welcome back Seagull!", Toast.LENGTH_LONG).show()
        }

        // Funcionalidad del botón Burnley
        btnBurnley.setOnClickListener{
            val intent = Intent(this,Burnley::class.java)
            startActivity(intent)
            Toast.makeText(this,"Welcome back Claret!", Toast.LENGTH_LONG).show()
        }

        // Funcionalidad del botón Siguiente
        btnNext1.setOnClickListener{
            val intent = Intent(this,Menu2::class.java)
            startActivity(intent)

        }




    }
}