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

public class RegiaoMetropolitana extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_regiao_metropolitana);

        ListView listRMR = findViewById(R.id.listRMR);

        ArrayList<String> pontosDeDescarte = preencherDados();

        ArrayAdapter<String> arrayAdapter = new ArrayAdapter<String>(this, android.R.layout.simple_list_item_1, pontosDeDescarte);
        listRMR.setAdapter(arrayAdapter);

        listRMR.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int position, long l) {
                RegiaoMetropolitanaWebView regiaoMetropolitanaWebView = new RegiaoMetropolitanaWebView();
                if (position == 0) {
                    String link1 = "https://www.google.com/maps/dir//REEECicle+-+Intelig%C3%AAncia+em+Reciclagem+-+R.+Prof.+Mussa+Hazin,+108+-+Iputinga,+Recife+-+PE,+52171-011/@-8.6606331,-42.1965288,6z/data=!4m8!4m7!1m0!1m5!1m1!1s0x7ab1936f9fb79bf:0x5e99941d49f7d352!2m2!1d-34.9424551!2d-8.0376417";
                    Intent intent1 = new Intent(RegiaoMetropolitana.this, RegiaoMetropolitanaWebView.class); //indo para o webview
                    intent1.putExtra("link", link1); //enviando link através da intent para o webview
                    startActivity(intent1);
                }else if (position == 1){
                    String link2 = "https://www.google.com/maps/dir//Doe+Eletroeletr%C3%B4nicos+-+Av.+da+Recupera%C3%A7%C3%A3o+-+Apipucos,+Recife+-+PE/@-8.6606331,-42.1965288,6z/data=!4m8!4m7!1m0!1m5!1m1!1s0x7ab17431b14afc1:0x7212ac9e072acec2!2m2!1d-34.9317996!2d-7.9856881";
                    Intent intent1 = new Intent(RegiaoMetropolitana.this, RegiaoMetropolitanaWebView.class); //indo para o webview
                    intent1.putExtra("link", link2); //enviando link através da intent para o webview
                    startActivity(intent1);
                }
                else if (position == 2){
                    String link3 = "https://www.google.com/maps/dir//Eco+Esta%C3%A7%C3%A3o+Tot%C3%B3+-+Tv.+Onze+de+Agosto+-+Curado,+Recife+-+PE,+50791-480/@-8.6606331,-42.1965288,6z/data=!4m8!4m7!1m0!1m5!1m1!1s0x7ab1c12dbcc03bd:0xed47efb81e22ecdd!2m2!1d-34.9718038!2d-8.0777778";
                    Intent intent1 = new Intent(RegiaoMetropolitana.this, RegiaoMetropolitanaWebView.class); //indo para o webview
                    intent1.putExtra("link", link3); //enviando link através da intent para o webview
                    startActivity(intent1);
                }else if (position == 3){
                    String link4 = "https://www.google.com/maps/dir//Ecodigital+-+Descarte+J%C3%A1+-+R.+do+Jangadeiro,+1000+-+Candeias,+Jaboat%C3%A3o+dos+Guararapes+-+PE,+54430-315/@-8.6606331,-42.1965288,6z/data=!4m8!4m7!1m0!1m5!1m1!1s0x7ab1ef6fc1d0895:0xbd377ebb01d0ce75!2m2!1d-34.9281801!2d-8.1931831";
                    Intent intent1 = new Intent(RegiaoMetropolitana.this, RegiaoMetropolitanaWebView.class); //indo para o webview
                    intent1.putExtra("link", link4); //enviando link através da intent para o webview
                    startActivity(intent1);
                }else {
                    Toast.makeText(RegiaoMetropolitana.this, "Inválido", Toast.LENGTH_SHORT).show();
                }
            }
        });
    }

    private ArrayList<String> preencherDados(){
        ArrayList<String> dados = new ArrayList<String>();
        dados.add("REEECicle - Recife");
        dados.add("Doe Eletronicos - Recife");
        dados.add("Eco Estação Totó - Recife");
        dados.add("Eco Digital - Jaboatão do Guararapes");
        return dados;
    }
}