package com.example.calculadoraprueba;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.graphics.Color;
import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.RadioButton;
import android.widget.Spinner;
import android.widget.TextView;

import org.w3c.dom.Text;

public class Test extends AppCompatActivity {

    private CheckBox cb1y1;
    private CheckBox cb1y2;
    private CheckBox cb2y1;
    private CheckBox cb2y2;

    private CheckBox cb3y1;
    private CheckBox cb3y2;
    private CheckBox cb4y1;
    private CheckBox cb4y2;

    private RadioButton rb5y1;
    private RadioButton rb5y2;
    private RadioButton rb6y1;
    private RadioButton rb6y2;

    private RadioButton rb7y1;
    private RadioButton rb7y2;
    private RadioButton rb8y1;
    private RadioButton rb8y2;

    private Spinner spinerUno;
    private Spinner spinerDos;

    private TextView tvResultadoMostrado;

    private Button comprovar;

    private int contador=0;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_test);

        cb1y1=findViewById(R.id.cb1y1);
        cb1y2=findViewById(R.id.cb1y2);
        cb2y1=findViewById(R.id.cb2y1);
        cb2y2=findViewById(R.id.cb2y2);

        cb3y1=findViewById(R.id.cb3y1);
        cb3y2=findViewById(R.id.cb3y2);
        cb4y1=findViewById(R.id.cb4y1);
        cb4y2=findViewById(R.id.cb4y2);

        rb5y1=findViewById(R.id.rb5y1);
        rb5y2=findViewById(R.id.rb5y2);
        rb6y1=findViewById(R.id.rb6y1);
        rb6y2=findViewById(R.id.rb6y2);

        rb7y1=findViewById(R.id.rb7y1);
        rb7y2=findViewById(R.id.rb7y2);
        rb8y1=findViewById(R.id.rb8y1);
        rb8y2=findViewById(R.id.rb8y2);

        spinerUno=findViewById(R.id.spPreguntaSpinerUno);
        spinerDos=findViewById(R.id.spPreguntaSpinerDos);

        tvResultadoMostrado=findViewById(R.id.tvResultadoMostrado);

        comprovar=findViewById(R.id.comprobar);

    }

    public void limpiarCamposUno(View view){
        rb5y1.setChecked(false);
        rb5y2.setChecked(false);
        rb6y1.setChecked(false);
        rb6y2.setChecked(false);
    }

    public void limpiarCamposDos(View view){
        rb7y1.setChecked(false);
        rb7y1.setChecked(false);
        rb8y1.setChecked(false);
        rb8y1.setChecked(false);
    }

    public void comprobarDatos(View view){

        if(cb1y1.isChecked()==true){
            contador++;
            cb1y1.setBackgroundColor(Color.GREEN);
        }else if(cb1y1.isChecked()==false){
            cb1y1.setBackgroundColor(Color.RED);
            contador--;
        }
        if(cb1y2.isChecked()==true){
            cb1y2.setBackgroundColor(Color.GREEN);
            contador++;
        }else if(cb1y2.isChecked()==false){
            cb1y2.setBackgroundColor(Color.RED);
            contador--;
        }
        if(cb2y1.isChecked()==true){
            cb2y1.setBackgroundColor(Color.GREEN);
            contador++;
        }else if(cb2y1.isChecked()==false){
            cb2y1.setBackgroundColor(Color.RED);
            contador--;
        }
        if(cb2y2.isChecked()==true){
            cb2y2.setBackgroundColor(Color.GREEN);
            contador++;
        }else if(cb2y2.isChecked()==false){
            cb2y2.setBackgroundColor(Color.RED);
            contador--;
        }
        if(cb3y1.isChecked()==true){
            cb3y1.setBackgroundColor(Color.GREEN);
            contador++;
        }else if(cb3y1.isChecked()==false){
            cb3y1.setBackgroundColor(Color.RED);
            contador--;
        }
        if(cb3y2.isChecked()==true){
            cb3y2.setBackgroundColor(Color.GREEN);
            contador++;
        }else if(cb3y2.isChecked()==false){
            cb3y2.setBackgroundColor(Color.RED);
            contador--;
        }
        if(cb4y1.isChecked()==true){
            cb4y1.setBackgroundColor(Color.GREEN);
            contador++;
        }else if(cb4y1.isChecked()==false){
            cb4y1.setBackgroundColor(Color.RED);
            contador--;
        }
        if(cb4y2.isChecked()==true){
            cb4y2.setBackgroundColor(Color.RED);
            contador--;
        }
        if(rb5y1.isChecked()==true){
            rb5y1.setBackgroundColor(Color.RED);
            contador--;
        }
        if(rb5y2.isChecked()==true){
            rb5y2.setBackgroundColor(Color.RED);
            contador--;
        }
        if(rb6y1.isChecked()==true){
            rb6y1.setBackgroundColor(Color.GREEN);
            contador++;
        }else if(rb6y1.isChecked()==false){
            rb6y1.setBackgroundColor(Color.RED);
            contador--;
        }
        if(rb6y2.isChecked()==true){
            rb6y2.setBackgroundColor(Color.RED);
            contador--;
        }
        if(rb7y1.isChecked()==true){
            rb7y1.setBackgroundColor(Color.GREEN);
            contador++;
        }else if(rb7y1.isChecked()==false){
            rb7y1.setBackgroundColor(Color.RED);
            contador--;
        }
        if(rb7y2.isChecked()==true){
            rb7y2.setBackgroundColor(Color.RED);
            contador--;
        }
        if(rb8y1.isChecked()==true){
            rb8y1.setBackgroundColor(Color.RED);
            contador--;
        }
        if(rb8y2.isChecked()==true){
            rb8y2.setBackgroundColor(Color.RED);
            contador--;
        }
        if(spinerUno.getSelectedItemPosition()==2){
            spinerUno.setBackgroundColor(Color.GREEN);
            contador++;
        }else if(spinerUno.getSelectedItemPosition()!=2){
            spinerUno.setBackgroundColor(Color.RED);
            contador--;
        }
        if(spinerDos.getSelectedItemPosition()==0){
            spinerDos.setBackgroundColor(Color.GREEN);
            contador++;
        }else if(spinerDos.getSelectedItemPosition()!=0){
            spinerDos.setBackgroundColor(Color.RED);
            contador--;
        }

        tvResultadoMostrado.setText(""+contador);

        comprovar.setClickable(false);

    }

    public void resetearTest(View view){
        cb1y1.setChecked(false);
        cb1y1.setBackgroundColor(Color.TRANSPARENT);
        cb1y2.setChecked(false);
        cb1y2.setBackgroundColor(Color.TRANSPARENT);
        cb2y1.setChecked(false);
        cb2y1.setBackgroundColor(Color.TRANSPARENT);
        cb2y2.setChecked(false);
        cb2y2.setBackgroundColor(Color.TRANSPARENT);

        cb3y1.setChecked(false);
        cb3y1.setBackgroundColor(Color.TRANSPARENT);
        cb3y2.setChecked(false);
        cb3y2.setBackgroundColor(Color.TRANSPARENT);
        cb4y1.setChecked(false);
        cb4y1.setBackgroundColor(Color.TRANSPARENT);
        cb4y2.setChecked(false);
        cb4y2.setBackgroundColor(Color.TRANSPARENT);

        rb5y1.setChecked(false);
        rb5y1.setBackgroundColor(Color.TRANSPARENT);
        rb5y2.setChecked(false);
        rb5y2.setBackgroundColor(Color.TRANSPARENT);
        rb6y1.setChecked(false);
        rb6y1.setBackgroundColor(Color.TRANSPARENT);
        rb6y2.setChecked(false);
        rb6y2.setBackgroundColor(Color.TRANSPARENT);

        rb7y1.setChecked(false);
        rb7y1.setBackgroundColor(Color.TRANSPARENT);
        rb7y2.setChecked(false);
        rb7y2.setBackgroundColor(Color.TRANSPARENT);
        rb8y1.setChecked(false);
        rb8y1.setBackgroundColor(Color.TRANSPARENT);
        rb8y2.setChecked(false);
        rb8y2.setBackgroundColor(Color.TRANSPARENT);

        spinerUno.setSelection(0);
        spinerUno.setBackgroundColor(Color.WHITE);
        spinerDos.setSelection(0);
        spinerDos.setBackgroundColor(Color.WHITE);

        tvResultadoMostrado.setText("");

    }

    public void cerrarTest(View view){
        finish();
    }



}