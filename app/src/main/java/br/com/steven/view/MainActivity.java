package br.com.steven.view;

import android.os.Bundle;
import android.webkit.WebView;
import android.webkit.WebViewClient;

import androidx.appcompat.app.AppCompatActivity;

import br.com.steven.R;

public class MainActivity extends AppCompatActivity {

    WebView minhaWeb;

    @Override
    protected void onCreate(Bundle savedInstanceState) {

        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        minhaWeb = findViewById(R.id.webViewTeste);
        minhaWeb.getSettings().setJavaScriptEnabled(true);
        minhaWeb.setWebViewClient(new WebViewClient());
        minhaWeb.loadUrl("https://github.com/StevenSantosGuimaraes");

    }

}