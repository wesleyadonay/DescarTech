package com.ete.descartech;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

import androidx.appcompat.app.AppCompatActivity;

public class Mandamentos6 extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_mandamentos6);

        ImageView setaesquerda =findViewById(R.id.setavoltar);
        ImageView setadireita =findViewById(R.id.setadireita);

        setaesquerda.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent1 = new Intent(Mandamentos6.this, Mandamentos5.class);
                startActivity(intent1);
            }
        });
        setadireita.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent1 = new Intent(Mandamentos6.this, Mandamentos7.class);
                startActivity(intent1);
            }
        });

    }
}
