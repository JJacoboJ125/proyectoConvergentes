package com.example.lego;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class FormularioMain extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_formulario_origen);
    }

    public void seguiaADestino(View view){
        AlmacenaDatos();
        setContentView(R.layout.activity_formulario_destino);
    }
    public void seguiaACarga(View view){
        AlmacenaDatos();
        setContentView(R.layout.activity_formulario_carga);
    }
    public void ingresarDatosBD(){

    }
    public void VolverAInicio(View view){
        ingresarDatosBD();
        AlmacenaDatos();
        Intent intent = new Intent(this, HomeDCActivity.class);
        startActivity(intent);
    }

    public void AlmacenaDatos(){
        String Departamento = String.valueOf((TextView) findViewById(R.id.DepartamentoO));
        String ciudad = String.valueOf((TextView) findViewById(R.id.CiudadO));
        String direccion = String.valueOf((TextView) findViewById(R.id.DireccionO));
        String postal = String.valueOf((TextView) findViewById(R.id.postal));
        String hora = String.valueOf((TextView) findViewById(R.id.horaRe));
        String fecha = String.valueOf((TextView) findViewById(R.id.fechaRe));
        String depD = String.valueOf((TextView) findViewById(R.id.DepartamentoD));
        String ciudadD = String.valueOf((TextView) findViewById(R.id.CiudadD));
        String direccionD = String.valueOf((TextView) findViewById(R.id.DireccionD));
        String postaD = String.valueOf((TextView) findViewById(R.id.postalD));
        String fechaEntrega = String.valueOf((TextView) findViewById(R.id.fechaEntrega));
        String titulo = String.valueOf((TextView) findViewById(R.id.titulo));
        String tipoMerca = String.valueOf((TextView) findViewById(R.id.tipoMercancia));
        String largo = String.valueOf((TextView) findViewById(R.id.largo));
        String ancho = String.valueOf((TextView) findViewById(R.id.ancho));
        String alto = String.valueOf((TextView) findViewById(R.id.alto));
        String descrip = String.valueOf((TextView) findViewById(R.id.detAdd));
        boolean activa = true;
        boolean aceptada = false;
        String codigoUsuario = "no hay usuario asignado";


    }
}