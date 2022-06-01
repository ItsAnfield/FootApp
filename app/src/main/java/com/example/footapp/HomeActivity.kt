package com.example.footapp

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.TextView
import android.widget.Toast
import com.google.firebase.auth.FirebaseAuth
import com.google.firebase.auth.FirebaseAuth.getInstance

enum class ProviderType{
    BASIC
}
class HomeActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_home)

        val btnEntrar = findViewById<Button>(R.id.entrarApp)

        // Funcionalidad del boton Entrar
        btnEntrar.setOnClickListener{
            val intent = Intent(this, Menu1::class.java)
            startActivity(intent)
            Toast.makeText(this, "Los datos de las plantillas solo estan disponibles en 3 clubes", Toast.LENGTH_LONG).show()
        }

        // Setup
        val bundle = intent.extras
        val email = bundle?.getString("email")
        val provider =bundle?.getString("provider")
        setup(email ?:"", provider ?:"")
    }

    private fun setup(email: String, provider: String){
        val homeEmail = findViewById<TextView>(R.id.homeEmail)
        val proveedorHome = findViewById<TextView>(R.id.proveedorHome)
        val btnLogOut = findViewById<Button>(R.id.btnLogOut)

        title = "Inicio"
        homeEmail.text = email
        proveedorHome.text = provider

        btnLogOut.setOnClickListener{
            FirebaseAuth.getInstance().signOut()
            onBackPressed()
        }
    }
}