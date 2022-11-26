package com.example.calculadoraprueba;


import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.Toast;

import java.util.Locale;

public class MainActivity extends AppCompatActivity {

    private EditText etPalabra;
    private String idioma;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        etPalabra=findViewById(R.id.etPalabra);

    }

    @Override
    protected void onResume() {
        super.onResume();
        idioma=""+Locale.getDefault().getDisplayLanguage();
        Log.d("buscador",idioma);

        switch (idioma){
            case "es":
                cambiarPubli();
                break;
            case "español":
                cambiarPubli();
                break;
            default:
                break;
        }
    }

    public void cambiarPubli(){

        ImageView ivPublicidad;
        ivPublicidad=findViewById(R.id.ivPublicidad);
        ivPublicidad.setImageResource(R.drawable.calvicie);

    }

    public boolean onCreateOptionsMenu(Menu menu){
        getMenuInflater().inflate(R.menu.menu, menu);
        return true;
    }

    public boolean onOptionsItemSelected(MenuItem item){
        int id=item.getItemId();
        switch(id){
            case R.id.miOpcionSalir:
                cerrar(null);
                break;
            case R.id.miOpcionAcercaDe:
                abrirAcercaDe(null);
                break;
            case R.id.miOpcionCalculadora:
                abrirCalculadora(null);
                break;
        }
        return super.onOptionsItemSelected(item);
    }

    public void abrirCalculadora (View view){
        Intent i=new Intent(this, Calculadora.class);
        startActivity(i);
    }

    public void abrirParImpar (View view){
        Intent i=new Intent(this, ParImpar.class);
        startActivity(i);
    }

    public void abrirNumeroPrimo (View view){
        Intent i=new Intent(this, NumeroPrimo.class);
        startActivity(i);
    }

    public void abrirTest (View view){
        Intent i=new Intent(this, Test.class);
        startActivity(i);
    }

    public void abrirAleatorio (View view){
        Intent i=new Intent(this, NumeroAleatorio.class);
        startActivity(i);
    }

    public void abrirVarios (View view){
        Intent i=new Intent(this, Varios.class);
        startActivity(i);
    }

    public void abrirAcercaDe(View view){

        String palabra=etPalabra.getText().toString();

        if(palabra.isEmpty()==false) {
            Intent i = new Intent(this, AcercaDe.class);

            Bundle b=new Bundle();
            b.putString("nombre", palabra);
            i.putExtras(b);

            startActivity(i);
        }else{
            Toast.makeText(this, "No puedes dejar tu nombre vacio", Toast.LENGTH_SHORT).show();
        }
    }

    public void cerrar (View view){
        finish();
    }

}