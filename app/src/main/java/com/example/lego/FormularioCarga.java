package com.example.lego;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class FormularioCarga extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_formulario_carga);
    }

    public void llevarAmisPublicados(View view){
        AlmacenaDatos();
        Intent intent = new Intent(this, HomeActivity.class);
        startActivity(intent);
    }

    public void AlmacenaDatos(){
        String TipoCarga = String.valueOf((TextView) findViewById(R.id.tipoMercancia));
        String largo = String.valueOf((TextView) findViewById(R.id.largo));
        String ancho = String.valueOf((TextView) findViewById(R.id.ancho));
        String alto = String.valueOf((TextView) findViewById(R.id.alto));
        String peso = String.valueOf((TextView) findViewById(R.id.peso));
        String detalles = String.valueOf((TextView) findViewById(R.id.detAdd));
    }
}