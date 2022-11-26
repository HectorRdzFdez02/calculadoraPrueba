package com.example.calculadoraprueba;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class NumeroAleatorio extends AppCompatActivity {

    private EditText etNumeroMaximo;
    private EditText etNumeroMinimo;
    private TextView tvMostrarResultadoAleatorio;
    private int numeroAleatorio;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_numero_aleatorio);

        etNumeroMaximo=findViewById(R.id.etNumeroMaximo);
        etNumeroMinimo=findViewById(R.id.etNumeroMinimo);
        tvMostrarResultadoAleatorio=findViewById(R.id.tvMostrarResultadoAleatorio);
    }

    public void aleatorizarNumero(View view){
        int numeroMaximo=Integer.parseInt(etNumeroMaximo.getText().toString());
        int numeroMinimo=Integer.parseInt(etNumeroMinimo.getText().toString());
        if(numeroMaximo<numeroMinimo){
            Toast.makeText(this, "El numero maximo no puede ser menor que minimo", Toast.LENGTH_LONG).show();
        }else if(numeroMaximo!=numeroMinimo) {
            numeroAleatorio = (int) (Math.random() * ((numeroMaximo - numeroMinimo) + 1) + numeroMinimo);
            tvMostrarResultadoAleatorio.setText(numeroAleatorio + "");
        }else{
            Toast.makeText(this, "Los Numeros no pueden ser iguales", Toast.LENGTH_SHORT).show();
        }
    }

    public void cerrarAleatorio(View view){
        finish();
    }

}