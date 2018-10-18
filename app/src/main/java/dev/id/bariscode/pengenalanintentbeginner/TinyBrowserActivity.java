package dev.id.bariscode.pengenalanintentbeginner;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.webkit.WebSettings;
import android.webkit.WebView;
import android.webkit.WebViewClient;

public class TinyBrowserActivity extends AppCompatActivity {

    WebView wView;
    WebSettings setWeb;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_tiny_browser);
        setTitle("Tiny Browser get URL");

        wView = (WebView)findViewById(R.id.wvTinyBrowser);

        Intent getIntent = getIntent();

        String URL_Get = getIntent.getStringExtra("URL_SENT");

        setWeb = wView.getSettings();
        setWeb.setJavaScriptEnabled(true);

        wView.setWebViewClient(new WebViewClient());
        wView.loadUrl(URL_Get);
    }
}
