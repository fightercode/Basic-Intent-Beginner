package dev.id.bariscode.pengenalanintentbeginner;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    Button btExplicit1, btExplicit2;
    Button btTinyBrowser, btIntentBrowserwithURL, btIntentTinyBrowserwithURL;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        btExplicit1 = (Button)findViewById(R.id.btnIntenExlicit1);
        btExplicit1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(MainActivity.this, IntentExplicit1Activity.class));
            }
        });

        btExplicit2 = (Button)findViewById(R.id.btnIntenExlicit2);
        btExplicit2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent gotoIntentExplicit2 = new Intent(MainActivity.this, IntentExplicit2Activity.class);
                startActivity(gotoIntentExplicit2);
            }
        });

        btTinyBrowser = (Button)findViewById(R.id.btnWebBrowserSederhana);
        btIntentBrowserwithURL = (Button)findViewById(R.id.btnSentURLtoBrowser);
        btIntentTinyBrowserwithURL = (Button)findViewById(R.id.btnSentURLtoTinyBrowser);

        btTinyBrowser.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(MainActivity.this, WebViewIntent1Activity.class));
            }
        });

        btIntentTinyBrowserwithURL.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

            }
        });

        btIntentTinyBrowserwithURL.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

            }
        });
    }

    public void IntentExplicitSimple (View view) {
        Intent gotoIntentExplicit3 = new Intent(MainActivity.this, IntentExplicit3Activity.class);
        startActivity(gotoIntentExplicit3);
    }
}
