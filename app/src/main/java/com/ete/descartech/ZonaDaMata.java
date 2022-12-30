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

public class ZonaDaMata extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_zona_da_mata);

        ListView listZonaDaMata = findViewById(R.id.listZonaDaMata);

        ArrayList<String> pontosDeDescarte = preencherDados();

        ArrayAdapter<String> arrayAdapter = new ArrayAdapter<String>(this, android.R.layout.simple_list_item_1, pontosDeDescarte);
        listZonaDaMata.setAdapter(arrayAdapter);

        listZonaDaMata.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int position, long l) {
                ZonaDaMataWebView zonaDaMataWebView = new ZonaDaMataWebView();
                if (position == 0) {
                    String linkEte = "https://www.google.com/maps/dir//ETE+Senador+Wilson+Campos+-+BR-408,+Paudalho+-+PE/@-7.922334,-35.1928809,13z/data=!4m9!4m8!1m0!1m5!1m1!1s0x7ab091248b18167:0xda21be0ff8767782!2m2!1d-35.1578611!2d-7.9224205!3e0";
                    Intent intent1 = new Intent(ZonaDaMata.this, ZonaDaMataWebView.class); //indo para o webview
                    intent1.putExtra("link", linkEte); //enviando link através da intent para o webview
                    startActivity(intent1);
                }else if (position == 1){
                    String linkCooperativa = "https://www.google.com/maps/dir//Cooperativa+de+Catadores+de+Materiais+Recicl%C3%A1veis+de+Paudalho+(COOPCAPA),+Paudalho+-+PE/@-7.9188485,-35.1995803,13z/data=!3m1!4b1!4m9!4m8!1m0!1m5!1m1!1s0x7ab09b11f354255:0x6d606dae68eba315!2m2!1d-35.1645605!2d-7.918935!3e0";
                    Intent intent1 = new Intent(ZonaDaMata.this, ZonaDaMataWebView.class); //indo para o webview
                    intent1.putExtra("link", linkCooperativa); //enviando link através da intent para o webview
                    startActivity(intent1);
                }else {
                    Toast.makeText(ZonaDaMata.this, "Inválido", Toast.LENGTH_SHORT).show();
                }
            }
        });
    }

    private ArrayList<String> preencherDados(){
        ArrayList<String> dados = new ArrayList<String>();
        dados.add("ETE - Senador Wilson Campos - Paudalho");
        dados.add("COOPACAPA - Paudalho");
        return dados;
    }
}