package com.example.calculadoraprueba;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.Switch;
import android.widget.TextView;
import android.widget.Toast;

public class NumeroPrimo extends AppCompatActivity {

    private EditText etNumeroPrimoIntroducido;
    private TextView tvResultadoPrimo;
    private Switch sNumeroPrimo;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_numero_primo);
        etNumeroPrimoIntroducido=findViewById(R.id.etNumeroPrimoIntroducido);
        tvResultadoPrimo=findViewById(R.id.tvResultadoPrimo);
        sNumeroPrimo=findViewById(R.id.sNumeroPrimo);
    }

    public void cerrarNumeroPrimo(View view){
        finish();
    }

    public void calcularPrimo(View view){
        if (sNumeroPrimo.isChecked()==false){
            Toast.makeText(this, "Tienes que activar el 'Switchinator'", Toast.LENGTH_SHORT).show();
        }else{
            int numero=Integer.parseInt(etNumeroPrimoIntroducido.getText().toString());
            int contador=2;
            tvResultadoPrimo.setText("Es primo");
            while(contador!=numero) {
                if ((numero % contador)== 0) {
                    tvResultadoPrimo.setText("No es primo");
                    contador=numero;
                }else {
                    contador++;
                }
            }
        }
    }

}