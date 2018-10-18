package dev.id.bariscode.pengenalanintentbeginner;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class PutExtratoWebViewActivity extends AppCompatActivity {

    EditText etURLPut;
    Button btnActiontoBrowser;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_put_extrato_web_view);

        etURLPut = (EditText)findViewById(R.id.edtURL);
        btnActiontoBrowser = (Button)findViewById(R.id.btnGotoTinyBrowser);

        btnActiontoBrowser.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String getText = etURLPut.getText().toString();

                Intent kirimURL = new Intent(PutExtratoWebViewActivity.this, WebViewIntent1Activity.class);
                kirimURL.putExtra("URL_SENT", getText);
                startActivity(kirimURL);
            }
        });
    }
}
