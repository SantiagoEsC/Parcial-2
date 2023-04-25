package com.example.parcial2;

import static com.example.parcial2.R.id.numero;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    EditText numero;
    TextView resultado;
    Button Calcular;

    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        numero = findViewById(R.id.numero);
        Calcular = findViewById(R.id.calcular);


        resultado = findViewById(R.id.resultado);
        Calcular.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                int n =Integer.parseInt(numero.getText().toString());
                int fibonacci= fibonacci(n);
                resultado.setText("El resultado es: "+ fibonacci);

            }
        });


    }
    private int fibonacci(int n)
    {
        if(n<=1)
        {
            return n;
        }else {
            return fibonacci(n - 1)+ fibonacci(n -2);
        }
    }


}