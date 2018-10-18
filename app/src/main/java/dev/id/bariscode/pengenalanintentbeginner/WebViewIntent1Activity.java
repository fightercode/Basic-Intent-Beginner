package dev.id.bariscode.pengenalanintentbeginner;

import android.content.Intent;
import android.support.v4.widget.SwipeRefreshLayout;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.KeyEvent;
import android.view.View;
import android.webkit.WebSettings;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import android.widget.EditText;
import android.widget.ImageButton;
import android.widget.Toast;

public class WebViewIntent1Activity extends AppCompatActivity {

    WebView wView;
    WebSettings setWeb;

    ImageButton ivbtnBack, ivbtnNext;

    SwipeRefreshLayout sflBrowser;

    String URL;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_web_view_intent1);
        setTitle("Tiny Browser");

        wView = (WebView)findViewById(R.id.wvBrowser);
        ivbtnBack = (ImageButton)findViewById(R.id.imbBack);
        ivbtnNext = (ImageButton)findViewById(R.id.imbNext);

        final EditText etCari = (EditText)findViewById(R.id.edtSearch);

        Intent getIntent = getIntent();

        URL = "https://google.com/";

        webViewInitial();

        etCari.setOnKeyListener(new View.OnKeyListener() {
            @Override
            public boolean onKey(View view, int keyCode, KeyEvent event) {
                if ((event.getAction() == KeyEvent.ACTION_DOWN) && (keyCode == KeyEvent.KEYCODE_ENTER)) {
                    URL = "http://" + etCari.getText().toString() + "/";
                    webViewInitial();
                    return true;
                }
                return false;
            }
        });

        ivbtnBack.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                wView.goBack();
            }
        });
        ivbtnNext.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                wView.goForward();
            }
        });

        sflBrowser = (SwipeRefreshLayout)findViewById(R.id.refreshLayout);
        sflBrowser.setOnRefreshListener(new SwipeRefreshLayout.OnRefreshListener() {
            @Override
            public void onRefresh() {
                URL = "http://" + etCari.getText().toString() + "/";
                wView.loadUrl(URL);
                sflBrowser.setRefreshing(false);
            }
        });
    }

    public void webViewInitial() {
        setWeb = wView.getSettings();
        setWeb.setJavaScriptEnabled(true);

        wView.setWebViewClient(new WebViewClient());
        wView.loadUrl(URL);
    }

    @Override
    public void onBackPressed() {
        super.onBackPressed();
        startActivity(new Intent(WebViewIntent1Activity.this, MainActivity.class));
        finish();
    }
}
