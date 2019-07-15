package com.example.alc_challange;

import android.net.http.SslError;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.webkit.SslErrorHandler;
import android.webkit.WebView;
import android.webkit.WebViewClient;


public class activity_a extends AppCompatActivity {

    private WebView MwebView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_a);

        MwebView = findViewById(R.id.about_andela);

        MwebView.setWebViewClient(new WebViewClient()
        {
            public void onReceivedSslError(WebView MwebView, SslErrorHandler handler, SslError sslError)
            {
                handler.proceed();
            }
        });

        MwebView.loadUrl("https://andela.com/alc/");}}
