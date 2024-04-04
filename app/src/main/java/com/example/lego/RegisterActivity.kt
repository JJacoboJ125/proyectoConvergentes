package com.example.lego

import android.content.Intent
import android.os.Bundle
import android.util.Log
import android.widget.Button
import android.widget.EditText
import android.widget.Spinner
import androidx.appcompat.app.AlertDialog
import androidx.appcompat.app.AppCompatActivity
import com.google.firebase.Firebase
import com.google.firebase.auth.FirebaseAuth
import com.google.firebase.auth.auth
import com.google.firebase.database.FirebaseDatabase
import com.google.firebase.database.database

class RegisterActivity : AppCompatActivity() {
    lateinit var username: EditText
    lateinit var password: EditText
    lateinit var tipoUs: Spinner
    lateinit var reallogin_btn: Button
    private lateinit var auth: FirebaseAuth
    private lateinit var database: FirebaseDatabase

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_register)

        auth = Firebase.auth
        username = findViewById(R.id.username)
        password = findViewById(R.id.password)
        reallogin_btn = findViewById(R.id.reallogin_btn)
        tipoUs = findViewById(R.id.tipoUsuario)
        database=Firebase.database
        setup()
    }

    private fun setup() {
        title = "Register"
        reallogin_btn.setOnClickListener {
            if(username.text.isNotEmpty() && password.text.isNotEmpty()) {
                val usernameIn = username.text.toString()
                val passwordIn = password.text.toString()
                val TipoUs = tipoUs.id
                FirebaseAuth.getInstance().createUserWithEmailAndPassword(usernameIn, passwordIn).addOnCompleteListener{
                    if(it.isSuccessful){
                        //showHome(it.result?.user?.email ?: "Nobrother")
                        showHome()
                        val idUsuario= FirebaseAuth.getInstance().currentUser?.uid
                        val RefDB = FirebaseDatabase.getInstance().getReference("usuarios")

                        if (idUsuario != null) {
                            RefDB.child(idUsuario).setValue(tipoUs.selectedItemId.toString())
                        }





                    } else {
                        showAlertCreate()
                    }
                }
                Log.i("Credenciales revisadas", "Username : $usernameIn and Password: $passwordIn")
            }
        }
    }

    private fun showAlertCreate() {
        val builder = AlertDialog.Builder(this)
        builder.setTitle("Error")
        builder.setMessage("Se produjo un error al crear la cuenta")
        builder.setPositiveButton("Aceptar",null)
        val dialog: AlertDialog = builder.create()
        dialog.show()
    }
    private fun showHome(){
        //val homeIntent = Intent(this, HomeActivity::class.java).apply {
        //putExtra("usuario",usuario)
        //}

        val homeIntent = Intent(this, HomeActivity::class.java)
        startActivity(homeIntent)

    }
    }