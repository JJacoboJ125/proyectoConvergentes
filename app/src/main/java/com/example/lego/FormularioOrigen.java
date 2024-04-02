package com.example.lego;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class FormularioOrigen extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_formulario_origen);
    }

    public void seguiaADestino(View view){
        AlmacenaDatos();
        Intent intent = new Intent(this, FormularioDestino.class);
        startActivity(intent);
    }

    public void AlmacenaDatos(){
        String Departamento = String.valueOf((TextView) findViewById(R.id.DepartamentoO));
        String ciudad = String.valueOf((TextView) findViewById(R.id.CiudadO));
        String direccion = String.valueOf((TextView) findViewById(R.id.DireccionO));
        String postal = String.valueOf((TextView) findViewById(R.id.postal));
        String hora = String.valueOf((TextView) findViewById(R.id.horaRe));
        String fecha = String.valueOf((TextView) findViewById(R.id.fechaRe));
    }
}