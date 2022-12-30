package com.ete.descartech;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

import androidx.appcompat.app.AppCompatActivity;

public class Mandamentos8 extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_mandamentos8);

        ImageView setaesquerda =findViewById(R.id.setavoltar);
        ImageView setadireita =findViewById(R.id.setadireita);

        setaesquerda.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent1 = new Intent(Mandamentos8.this, Mandamentos7.class);
                startActivity(intent1);
            }
        });
        setadireita.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent1 = new Intent(Mandamentos8.this, Mandamentos9.class);
                startActivity(intent1);
            }
        });

    }
}
