package com.example.lego

import android.content.Intent
import android.os.Bundle
import android.os.PersistableBundle
import android.util.Log
import android.widget.Button
import android.widget.EditText
import androidx.appcompat.app.AppCompatActivity
import com.google.firebase.auth.FirebaseAuth

class HomeActivity : AppCompatActivity(){
   // lateinit var usernameIN: EditText
    // lateinit var cerrar_btn:Button

    override fun onCreate(savedInstanceState: Bundle?, persistentState: PersistableBundle?) {

        //usernameIN = findViewById(R.id.usernameIN)
        super.onCreate(savedInstanceState, persistentState)
        setContentView(R.layout.activity_home)
        //val bundle = intent.extras
        //val username = bundle?.getString("username")
        //setup(username?: "Yipi")



    }

    private fun iniciarForm(){
        val FormIntent = Intent(this, FormularioOrigen::class.java)
        startActivity(FormIntent)

    }




  //  private fun setup(username:String){
    //      title = "Inicio"
      //    usernameIN.setText(username)
//
  //        cerrar_btn.setOnClickListener {
    //          FirebaseAuth.getInstance().signOut()
      //        onBackPressed()
        //  }
      //}

}
