package com.ete.descartech;

import android.os.Bundle;
import android.webkit.WebView;
import android.webkit.WebViewClient;

import androidx.appcompat.app.AppCompatActivity;

public class RegiaoMetropolitanaWebView extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_regiao_metropolitana_web_view);

        WebView webview = findViewById(R.id.webViewRMR);
        webview.setWebViewClient(new WebViewClient());
        webview.getSettings().setJavaScriptEnabled(true);
        Bundle extras = getIntent().getExtras();//recebendo o link que vem da activity Região Metropolitana
        if(extras != null){
            String url = extras.getString("link"); //enetendendo a string que veio da activity Região Metropolitana
            webview.loadUrl(url); //abrindo o webview com o link vindo da activity Região Metropolitana
        }
    }
}