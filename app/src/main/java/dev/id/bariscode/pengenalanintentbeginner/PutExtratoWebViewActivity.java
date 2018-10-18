package dev.id.bariscode.pengenalanintentbeginner;

import android.content.Intent;
import android.net.Uri;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class PutExtratoWebViewActivity extends AppCompatActivity {

    EditText etURLPut;
    Button btnActiontoTinyBrowser, btnActiontoBrowser;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_put_extrato_web_view);

        etURLPut = (EditText)findViewById(R.id.edtURL);
        btnActiontoTinyBrowser = (Button)findViewById(R.id.btnSentURLGotoTinyBrowser);

        btnActiontoTinyBrowser.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String getText = "http://" + etURLPut.getText().toString() + "/";
                Toast.makeText(PutExtratoWebViewActivity.this, getText, Toast.LENGTH_SHORT).show();
                Intent kirimURL = new Intent(PutExtratoWebViewActivity.this, TinyBrowserActivity.class);
                kirimURL.putExtra("URL_SENT", getText);
                startActivity(kirimURL);
            }
        });

        btnActiontoBrowser = (Button)findViewById(R.id.btnSentURLGotoBrowser);

        btnActiontoBrowser.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String getUrl = "http://" + etURLPut.getText().toString() + "/";

                startActivity(new Intent(Intent.ACTION_VIEW, Uri.parse(getUrl)));
            }
        });
    }
}
