package com.example.lego;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;
import android.app.DatePickerDialog;
import android.app.Dialog;
import android.os.Bundle;
import android.widget.DatePicker;

import androidx.fragment.app.DialogFragment;

import java.util.Calendar;

public class FormularioMain extends AppCompatActivity{
    TextView Departamento = (TextView) findViewById(R.id.DepartamentoO);
    TextView ciudad = (TextView) findViewById(R.id.CiudadO);
    TextView direccion = (TextView) findViewById(R.id.DireccionO);
    TextView postal = (TextView) findViewById(R.id.postal);
    TextView hora = (TextView) findViewById(R.id.horaRe);
    TextView fecha = (TextView) findViewById(R.id.fechaRe);
    TextView depD = (TextView) findViewById(R.id.DepartamentoD);
    TextView ciudadD = (TextView) findViewById(R.id.CiudadD);
    TextView direccionD = (TextView) findViewById(R.id.DireccionD);
    TextView postaD = (TextView) findViewById(R.id.postalD);
    TextView fechaEntrega = (TextView) findViewById(R.id.fechaEntrega);
    TextView titulo = (TextView) findViewById(R.id.titulo);
    TextView tipoMerca = (TextView) findViewById(R.id.tipoMercancia);
    TextView largo = (TextView) findViewById(R.id.largo);
    TextView ancho = (TextView) findViewById(R.id.ancho);
    TextView alto = (TextView) findViewById(R.id.alto);
    TextView descrip = (TextView) findViewById(R.id.detAdd);
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
        AlmacenaDatos();
        Intent intent = new Intent(this, HomeDCActivity.class);
        startActivity(intent);
    }

    public void AlmacenaDatos(){

        boolean activa = true;
        boolean aceptada = false;
        String codigoUsuario = "no hay usuario asignado";
        ingresarDatosBD();

    }


}