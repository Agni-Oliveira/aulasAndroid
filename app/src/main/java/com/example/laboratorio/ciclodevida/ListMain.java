package com.example.laboratorio.ciclodevida;

import android.app.ListActivity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.Toast;

public class ListMain extends ListActivity {


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        String[] values = new String[]
                {"Calculadora",
                        "Principal",
                        "MainActivity",
                        "Exercicio1",
                        "Q02",
                        "Q03",
                        "Q04",
                        "Q05",
                        "Q06",
                        "Q07",
                        "Q08",
                        "Q09",
                        "Q010",
                        "Q011",
                        "Q012"
                };
        ArrayAdapter<String> adapter = new ArrayAdapter<String>(this, android.R.layout.simple_list_item_1, values);
        setListAdapter(adapter);
    }

    @Override
    protected void onListItemClick(ListView l, View v, int position, long id) {
        String item = (String) getListAdapter().getItem(position);
        Toast.makeText(this, item + " selected", Toast.LENGTH_SHORT).show();

        Intent i;
        switch (item){
            case "Calculadora":
                i = new Intent(this, Calculadora.class);
                startActivity(i);
                break;
            case "Principal":
                i = new Intent(this, Principal.class);
                startActivity(i);
                break;
            case "MainActivity":
                i = new Intent(this, MainActivity.class);
                startActivity(i);
                break;
            case "Exercicio1":
            i = new Intent(this, Exercicio1.class);
            startActivity(i);
            break;
            case "Q02":
                i = new Intent(this, Q02.class);
                startActivity(i);
                break;
            case "Q03":
                i = new Intent(this, Q03.class);
                startActivity(i);
                break;
            case "Q04":
                i = new Intent(this, Q04.class);
                startActivity(i);
                break;
            case "Q05":
                i = new Intent(this, Q05.class);
                startActivity(i);
                break;
            case "Q06":
                i = new Intent(this, Q06.class);
                startActivity(i);
                break;
            case "Q07":
                i = new Intent(this, Q07.class);
                startActivity(i);
                break;
            case "Q08":
                i = new Intent(this, Q08.class);
                startActivity(i);
                break;
            case "Q09":
                i = new Intent(this, Q09.class);
                startActivity(i);
                break;
            case "Q10":
                i = new Intent(this, Q10.class);
                startActivity(i);
                break;
            case "Q11":
                i = new Intent(this, Q11.class);
                startActivity(i);
                break;
            case "Q12":
                i = new Intent(this, Q12.class);
                startActivity(i);
                break;

        }
    }
}
