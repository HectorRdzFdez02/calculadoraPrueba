package com.example.calculadoraprueba;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class AcercaDe extends AppCompatActivity {

    private TextView tvTextoNombreUsuario;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_acerca_de);

        tvTextoNombreUsuario=findViewById(R.id.tvTextoNombreUsuario);

        Bundle b= getIntent().getExtras();
        String nombre=b.getString("nombre");

        tvTextoNombreUsuario.setText(nombre);


    }

    public void volverAcercaDe(View view){
        finish();
    }

}