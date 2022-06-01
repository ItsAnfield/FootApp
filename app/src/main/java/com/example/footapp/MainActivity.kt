package com.example.footapp

import android.app.AlertDialog
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.TextView
import android.widget.Toast
import com.google.firebase.auth.FirebaseAuth
import com.google.firebase.ktx.Firebase

class MainActivity : AppCompatActivity() {


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        //Setup
        setup()





    }

    // Funcionalidad del Main Activity
    private fun setup(){
        val btnRegister = findViewById<Button>(R.id.btnRegister)
        val emailAuth = findViewById<TextView>(R.id.emailAuth)
        val passAuth= findViewById<TextView>(R.id.passAuth)
        val btnLogIn = findViewById<Button>(R.id.btnLogIn)
        title = "Autenticación"

        btnRegister.setOnClickListener{
            if (emailAuth.text.isNotEmpty() && passAuth.text.isNotEmpty()){

                FirebaseAuth.getInstance().createUserWithEmailAndPassword(emailAuth.text.toString(),
                    passAuth.text.toString()).addOnCompleteListener{
                        if(it.isSuccessful){
                            showHome(it.result?.user?.email ?: "", ProviderType.BASIC)
                        } else{
                            showAlert()
                        }
                }
            }
        }

        btnLogIn.setOnClickListener{
            if (emailAuth.text.isNotEmpty() && passAuth.text.isNotEmpty()){

                FirebaseAuth.getInstance().signInWithEmailAndPassword(emailAuth.text.toString(),
                    passAuth.text.toString()).addOnCompleteListener{
                    if(it.isSuccessful){
                        showHome(it.result?.user?.email ?: "", ProviderType.BASIC)
                    } else{
                        showAlert()
                    }
                }
            }
        }



    }

    // Función que nos muestra el mensaje de Error
    private fun showAlert(){
        val builder = AlertDialog.Builder(this)
        builder.setTitle("Error")
        builder.setMessage("Se ha producido un error autenticando al usuario")
        builder.setPositiveButton("Aceptar",null)
        val dialog: AlertDialog = builder.create()
        dialog.show()
    }

    private fun showHome(email: String, provider: ProviderType){
        val homeIntent = Intent(this, HomeActivity::class.java).apply {
            putExtra("email",email)
            putExtra("provider", provider.name)
        }
        startActivity(homeIntent)
    }
}