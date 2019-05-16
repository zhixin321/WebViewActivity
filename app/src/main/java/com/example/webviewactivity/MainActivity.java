package com.example.webviewactivity;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.webkit.WebChromeClient;
import android.webkit.WebView;
import android.webkit.WebViewClient;

public class MainActivity extends AppCompatActivity {
    WebView webView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        webView = findViewById(R.id.wvMain);
        webView.loadUrl("file:///android_asset/Registration.html");

        webView.getSettings().setJavaScriptEnabled(true);
        webView.setWebViewClient(new WebViewClient(){

            @Override

            public boolean shouldOverrideUrlLoading(WebView view, String url){
                return false;
            }

        });
        webView.setWebChromeClient(new WebChromeClient());
    }
}
