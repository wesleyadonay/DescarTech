package com.ete.descartech;



import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.Toast;


import androidx.appcompat.app.AppCompatActivity;

import java.util.ArrayList;


public class Agreste  extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_agreste);

        ListView listAgreste = findViewById(R.id.listAgreste);

        ArrayList<String> pontosDeDescarte = preencherDados();

        ArrayAdapter<String> arrayAdapter = new ArrayAdapter<String>(this, android.R.layout.simple_list_item_1, pontosDeDescarte);
        listAgreste.setAdapter(arrayAdapter);

        listAgreste.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int position, long l) {
                AgresteWebView agresteWebView = new AgresteWebView();
                if (position == 0) {
                    String linkCaruaru = "https://www.google.com/maps/dir//Descarte+Eletr%C3%B4nicos+Caruaru+-+R.+17+-+Kennedy,+Caruaru+-+PE,+55036-720/@-8.2897645,-35.9746215,17z/data=!4m9!4m8!1m0!1m5!1m1!1s0x7a98bea1f58cec7:0xfcc9947fbeb599e3!2m2!1d-35.9724328!2d-8.2897645!3e0";
                    Intent intent1 = new Intent(Agreste.this, AgresteWebView.class); //indo para o webview
                    intent1.putExtra("link", linkCaruaru); //enviando link através da intent para o webview
                    startActivity(intent1);
                } else {
                    Toast.makeText(Agreste.this, "Inválido", Toast.LENGTH_SHORT).show();
                }
            }
        });
    }

    private ArrayList<String> preencherDados () {
        ArrayList<String> dados = new ArrayList<String>();
        dados.add("Descartes Eletronicos - Caruaru");

        return dados;
    }
}
