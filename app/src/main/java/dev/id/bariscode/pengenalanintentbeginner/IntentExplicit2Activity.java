package dev.id.bariscode.pengenalanintentbeginner;

import android.support.v7.app.AlertDialog;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.Toast;

public class IntentExplicit2Activity extends AppCompatActivity {

    //Deklarasi View
    EditText etNamaLengkap, etNIS, etAlamat, etAsalSekolah;
    RadioGroup rgJenKel;
    RadioButton rbAkhi, rbUkhti;
    Button btKirimData;
    CheckBox cbFootball, cbML, cbCoding;

    String getJenisKelamin, getPilihHoby;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_intent_explicit2);


        //Inisialisasi View
        etNamaLengkap = (EditText)findViewById(R.id.txtNama);
        etNIS = (EditText)findViewById(R.id.txtNIS);
        etAsalSekolah = (EditText)findViewById(R.id.txtAsalSekolah);
        etAlamat = (EditText)findViewById(R.id.txtAlamat);
        rgJenKel = (RadioGroup)findViewById(R.id.rg_jk);
        rbAkhi = (RadioButton)findViewById(R.id.rb_laki);
        rbUkhti = (RadioButton)findViewById(R.id.rb_perempuan);
        cbFootball = (CheckBox)findViewById(R.id.cbHoby1);
        cbML = (CheckBox)findViewById(R.id.cbHoby2);
        cbCoding = (CheckBox)findViewById(R.id.cbHoby3);


        //Action Button
        btKirimData = (Button)findViewById(R.id.btnKirimData);
        btKirimData.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                methodValidasiInputan();

            }
        });
    }

    //Method Validator
    public void methodValidasiInputan () {
        if(etNamaLengkap.getText().toString().length()==0){
            etNamaLengkap.setError("Isi Nama Lengkap Dulu Bro!!");
            etNamaLengkap.requestFocus();
        }else if(etNIS.getText().toString().length()==0){
            etNIS.setError("Isi NIS Dulu Bro!!");
            etNIS.requestFocus();
        }else if(etAsalSekolah.getText().toString().length()==0){
            etAsalSekolah.setError("Isi Asal Sekolah Dulu Bro!!");
            etAsalSekolah.requestFocus();
        }else if(etAlamat.getText().toString().length()==0){
            etAlamat.setError("Isi Alamat Dulu Bro!!");
            etAlamat.requestFocus();
        }else {
            Toast.makeText(this, "Data Berhasil Diisi dengan Lengkap", Toast.LENGTH_SHORT).show();
            methodValidasiRadioButton();
            methodAmbilDataCheckbox();

            AlertDialog.Builder alert = new AlertDialog.Builder(this);

            alert
                    .setTitle("Informasi Data Siswa")
                    .setMessage(
                                    "Nama Lengkap: " + etNamaLengkap.getText().toString() +
                                    "\nNIS: " + etNIS.getText().toString() +
                                    "\nAsal Sekolah: " + etAsalSekolah.getText().toString() +
                                    "\nAlamat: " + etAlamat.getText().toString() +
                                    "\nJenis Kelamin: " + getJenisKelamin +
                                    "\nHoby: " + getPilihHoby
                    );
            AlertDialog tampilAlert = alert.create();
            tampilAlert.show();
        }
    }

    public void methodValidasiRadioButton() {
        int id = rgJenKel.getCheckedRadioButtonId();
        switch (id){
            case R.id.rb_laki :
                //Toast.makeText(this,"Clicked "+((RadioButton)findViewById(id)).getText(), Toast.LENGTH_SHORT).show();
                getJenisKelamin = "" + ((RadioButton)findViewById(id)).getText();
                break;
            case R.id.rb_perempuan :
                //Toast.makeText(this,"Clicked "+((RadioButton)findViewById(id)).getText(), Toast.LENGTH_SHORT).show();
                getJenisKelamin = "" + ((RadioButton)findViewById(id)).getText();
                break;
        }
    }

    public void methodAmbilDataCheckbox() {
        String tampungPilihHoby;
        tampungPilihHoby = "";

        if (cbFootball.isChecked() == false && cbML.isChecked() == false && cbCoding.isChecked() == false) {
            tampungPilihHoby += "Anda Tidak Memilih Hoby!";
        }
        if(cbFootball.isChecked()){
            tampungPilihHoby += " Football, ";
        }
        if(cbML.isChecked()){
            tampungPilihHoby += "Game ML, ";
        }
        if(cbCoding.isChecked()){
            tampungPilihHoby += "Ngoding.";
        }
        //Toast.makeText(getApplicationContext(), result, Toast.LENGTH_SHORT).show();
        getPilihHoby = tampungPilihHoby;
    }

    //Action OnClick

    public void onClickedButtonErase(View view) {
        etNamaLengkap.setText("");
        etNIS.setText("");
        etAsalSekolah.setText("");
        etAlamat.setText("");

        rbAkhi.setChecked(false);
        rbUkhti.setChecked(false);

        cbFootball.setChecked(false);
        cbML.setChecked(false);
        cbCoding.setChecked(false);
    }

    public void onClickedCheckbox(View view) {
        boolean checked = ((CheckBox) view).isChecked();
        String str="";
        switch(view.getId()) {
            case R.id.cbHoby1:
                str = checked?"Hoby Football Dipilih":"Hoby Football Batal Dipilih";
                break;
            case R.id.cbHoby2:
                str = checked?"Hoby Game ML Dipilih":"Hoby Game ML Batal Dipilih";
                break;
            case R.id.cbHoby3:
                str = checked?"Hoby Ngoding Dipilih":"Hoby Ngoding Batal Dipilih";
                break;
        }
        Toast.makeText(getApplicationContext(), str, Toast.LENGTH_SHORT).show();
    }
}
