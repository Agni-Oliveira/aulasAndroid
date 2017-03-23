package com.example.laboratorio.ciclodevida;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class Q02 extends AppCompatActivity {

    EditText edCampoPalavra;
    TextView textPrimeiraLetra, textUltimaLetra;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_q02);


        edCampoPalavra = (EditText) findViewById(R.id.edPalavra);
        textPrimeiraLetra = (TextView) findViewById(R.id.textPrimeraLetra);
        textUltimaLetra = (TextView) findViewById(R.id.textUltimaLetra);


    }


    public void questao2PrimeiraUltimaLetra(View view) {
        String palavra = edCampoPalavra.getText().toString();

        int tamanhoDaPalavra = edCampoPalavra.getText().toString().length();
        int tamanho = palavra.length();
        if (tamanhoDaPalavra < 5)
            Toast.makeText(Q02.this, "informe uma palavra maior que 5 caracteres!",
                    Toast.LENGTH_SHORT).show();
        else {
            String primeiraLetra = "" + palavra.charAt(0);
            String ultimaLetra = "" + palavra.charAt(tamanho - 1);

            textPrimeiraLetra.setText("Primeira Letra:" + primeiraLetra);
            textUltimaLetra.setText("Ultima Letra" + ultimaLetra);


        }
    }
}
