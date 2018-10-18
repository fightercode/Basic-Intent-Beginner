package dev.id.bariscode.pengenalanintentbeginner;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class IntentExplicit3Activity extends AppCompatActivity {

    //ButtonDeklarasi
    Button pindahHalaman;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_intent_explicit3);

        pindahHalaman = (Button)findViewById(R.id.btnGotoOtherActivity);

        pindahHalaman.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                //Step 1: Membuat Intent Langsung tanpa Deklarasi
                startActivity(new Intent(IntentExplicit3Activity.this, MainActivity.class));

                //Step 2: Membuat Intent Deklarasi terlebih Dahulu
                //Intent pindahAktifitas = new Intent(IntentExplicit3Activity.this, MainActivity.class);
                //startActivity(pindahAktifitas);
            }
        });
    }

    //Sisipkan Method di Button dengan Menambahkan atribut onClick pada Button
    public void onClickedButtonPindah(View view) {
        startActivity(new Intent(IntentExplicit3Activity.this, MainActivity.class));
    }
}
