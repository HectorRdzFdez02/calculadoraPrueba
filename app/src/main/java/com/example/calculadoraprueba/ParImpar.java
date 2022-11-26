package com.example.calculadoraprueba;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.Switch;
import android.widget.TextView;
import android.widget.Toast;

public class ParImpar extends AppCompatActivity {

    private EditText etNumeroIntroducido;
    private TextView tvResultado;
    private Switch sNumeroParImpar;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_par_impar);
        etNumeroIntroducido=findViewById(R.id.etNumeroIntroducido);
        tvResultado=findViewById(R.id.tvResultado);
        sNumeroParImpar=findViewById(R.id.sNumeroParImpar);
    }

    public void cerrarParImpar(View view) {
        finish();
    }

    public void calcularParImpar(View view) {
        if (sNumeroParImpar.isChecked() == false) {
            Toast.makeText(this, "Tienes que activar el 'Switchinator'", Toast.LENGTH_SHORT).show();
        } else {
            int numero = Integer.parseInt(etNumeroIntroducido.getText().toString());
            if ((numero % 2) == 0) {
                tvResultado.setText("Par");
            } else {
                tvResultado.setText("Impar");
            }
        }
    }


}