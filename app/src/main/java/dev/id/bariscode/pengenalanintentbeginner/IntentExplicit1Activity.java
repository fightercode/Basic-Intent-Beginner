package dev.id.bariscode.pengenalanintentbeginner;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class IntentExplicit1Activity extends AppCompatActivity {

    EditText etNamaMahasiswa;
    Button btKirimData;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_intent_explicit1);
        setTitle("Intent Put Extra");

        etNamaMahasiswa = (EditText)findViewById(R.id.txtNamaMahasiswa);
        btKirimData = (Button)findViewById(R.id.btnKirim);
        btKirimData.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String tampungNamaMahasiswa = etNamaMahasiswa.getText().toString();

                Intent KirimData = new Intent(getApplicationContext(), TampungData1Activity.class);
                KirimData.putExtra("NAMA_MHS", tampungNamaMahasiswa);
                startActivity(KirimData);
            }
        });

    }
}
