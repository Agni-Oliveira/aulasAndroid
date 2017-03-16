package com.example.laboratorio.ciclodevida;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

public class Exercicio1 extends AppCompatActivity {

    EditText numero;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_exercicio1);


        numero = (EditText) findViewById(R.id.edNumero);
    }
    public void enviarResposta(View view){
        int n = Integer.valueOf(numero.getText().toString());
        String msg = "antecessor: " + (n - 1) +
                "Sucessor: " + (n+1) +
                "Quadrado: "+ (n * n)+
                " Raiz Quadrada: " + (Math.sqrt(n));
        if ((n * n)> 50)
            msg += "O quadrado é maior que 50";

        Intent i = new Intent(this, Exercicio1tela2.class);
        i.putExtra("resultado",msg);
        startActivity(i);
    }
}
