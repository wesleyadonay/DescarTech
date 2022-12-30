package com.ete.descartech;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        ImageView saibamais1 =findViewById(R.id.saibamais1);
        ImageView saibamais2 =findViewById(R.id.saibamais2);
        ImageView saibamais3 =findViewById(R.id.saibamais3);
        ImageView pontosdescarte =findViewById(R.id.pontosdedescarte);

        saibamais1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent1 = new Intent(MainActivity.this, Ambiente.class);
                startActivity(intent1);
            }
        });

        saibamais2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent2 = new Intent(MainActivity.this, Saude.class);
                startActivity(intent2);
            }
        });

        saibamais3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent2 = new Intent(MainActivity.this, Mandamentos.class);
                startActivity(intent2);
            }
        });

        pontosdescarte.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent2 = new Intent(MainActivity.this, PontosDescarte.class);
                startActivity(intent2);
            }
        });
    }
}