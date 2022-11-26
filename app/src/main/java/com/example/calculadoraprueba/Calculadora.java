package com.example.calculadoraprueba;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;
import android.widget.ToggleButton;

public class Calculadora extends AppCompatActivity {

    private EditText etNumeroCalculadoraIntroducido;
    private EditText etNumeroCalculadoraIntroducido2;

    private TextView tvResultadoCalculadora;

    private ToggleButton tbCalculadora;

    private String elevacion;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_calculadora);

        etNumeroCalculadoraIntroducido=findViewById(R.id.etNumeroCalculadoraIntroducido);
        etNumeroCalculadoraIntroducido2=findViewById(R.id.etNumeroCalculadoraIntroducido2);

        tvResultadoCalculadora=findViewById(R.id.tvResultadoCalculadora);

        tbCalculadora=findViewById(R.id.tbCalculadora);

    }

    public void cerrarCalculadora(View view){
        finish();
    }

    public void calculadoraSumar(View view){
        calculadoraOperacion(0);
    }

    public void calculadoraRestar(View view){
        calculadoraOperacion(1);
    }

    public void calculadoraMultiplicar(View view){
        calculadoraOperacion(2);
    }

    public void calculadoraDividir(View view){
        calculadoraOperacion(3);
    }

    public void calculadoraElevado(View view){
        calculadoraOperacion(4);
    }

    public void calculadoraOperacion(int operacion){


        String valor1=etNumeroCalculadoraIntroducido.getText().toString();
        String valor2=etNumeroCalculadoraIntroducido2.getText().toString();

        if(!tbCalculadora.isChecked()){
            Toast.makeText(this,"Tienes que activar la calculadora",Toast.LENGTH_SHORT).show();
        }else if(valor1.isEmpty()||valor2.isEmpty()){
            Toast.makeText(this,"No puede estar vacio ningun campo",Toast.LENGTH_SHORT).show();
        }else {

            int numero = Integer.parseInt(valor1);
            int numero2 = Integer.parseInt(valor2);

            switch (operacion) {
                case 0:
                    tvResultadoCalculadora.setText((numero + numero2) + "");
                    break;
                case 1:
                    tvResultadoCalculadora.setText((numero - numero2) + "");
                    break;
                case 2:
                    tvResultadoCalculadora.setText((numero * numero2) + "");
                    break;
                case 3:
                    if (numero2!=0) {
                        tvResultadoCalculadora.setText((numero / numero2) + "");
                    }else{
                        Toast.makeText(this, "No puedes dividir entre 0", Toast.LENGTH_SHORT).show();
                    }
                    break;
                case 4:
                    elevacion=Math.pow(numero,numero2)+"";
                    tvResultadoCalculadora.setText(elevacion);
                    break;
            }
        }

    }

}