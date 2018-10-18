package dev.id.bariscode.pengenalanintentbeginner;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

public class TampungData1Activity extends AppCompatActivity {

    TextView tvTampungData1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_tampung_data1);
        setTitle("Tampung Data Intent");

        tvTampungData1 = (TextView)findViewById(R.id.tvTampungNamaMahasiswa);

        Intent getdataIntent = getIntent();
        String ambilNama = getdataIntent.getStringExtra("NAMA_MHS");

        tvTampungData1.setText("Nama Mahasiswa adalah "+ambilNama);
    }

    @Override
    public void onBackPressed() {
        super.onBackPressed();
        this.finish();
    }
}
