package com.ete.descartech;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

import androidx.appcompat.app.AppCompatActivity;

public class PontosDescarte extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activaty_pontos_descarte);

        ImageView agreste =findViewById(R.id.ivagreste);
        ImageView rmr =findViewById(R.id.rmr);
        ImageView zonadamata =findViewById(R.id.zonadamata);

        agreste.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent1 = new Intent(PontosDescarte.this, Agreste.class);
                startActivity(intent1);
            }
        });

        rmr.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent1 = new Intent(PontosDescarte.this, RegiaoMetropolitana.class);
                startActivity(intent1);
            }
        });

        zonadamata.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent1 = new Intent(PontosDescarte.this, ZonaDaMata.class);
                startActivity(intent1);
            }
        });
    }
}
