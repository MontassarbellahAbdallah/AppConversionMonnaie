package com.conversion.app;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    Button convertirbtn ;
    EditText entree;
    TextView result;
    RadioButton dinarToEuro, EuroToDinar;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        convertirbtn=findViewById(R.id.button);
        entree =findViewById(R.id.editTextNumber);
        result =findViewById(R.id.result);
        dinarToEuro = (RadioButton) findViewById(R.id.dTe);
        EuroToDinar = (RadioButton) findViewById(R.id.eTd);

        convertirbtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                convertir(v);
            }
        });

    }
    public void convertir(View v){
        float montantEntree = Float.parseFloat(entree.getText().toString());

        if (dinarToEuro.isChecked()) {
            float resultatConversion = DinarToEuro(montantEntree);
            result.setText(String.valueOf(resultatConversion));
        } else if (EuroToDinar.isChecked()) {
            float resultatConversion = euroToDinar(montantEntree);
            result.setText(String.valueOf(resultatConversion));
        }

    }
    private float euroToDinar(float valeurEuro){
        return (float) (valeurEuro*2.95);
    }
    private float DinarToEuro(float valeurDinar){
        return (float) (valeurDinar*0.34);
    }
}