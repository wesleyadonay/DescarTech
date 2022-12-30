package com.ete.descartech;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

import androidx.appcompat.app.AppCompatActivity;

public class Mandamentos7 extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_mandamentos7);

        ImageView setaesquerda =findViewById(R.id.setavoltar);
        ImageView setadireita =findViewById(R.id.setadireita);

        setaesquerda.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent1 = new Intent(Mandamentos7.this, Mandamentos6.class);
                startActivity(intent1);
            }
        });
        setadireita.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent1 = new Intent(Mandamentos7.this, Mandamentos8.class);
                startActivity(intent1);
            }
        });

    }
}
