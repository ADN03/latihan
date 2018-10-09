package com.example.ridorianto.bangun_datar;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;
import android.widget.EditText;
import android.widget.Button;
import android.widget.Toast;

public class jajar_genjang extends AppCompatActivity {
    //Deklarasi Variabel komponen
    EditText a, t;
    Button hitung;
    TextView hasil;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        //memanggil file xml
        setContentView(R.layout.jajar_genjang);

        //Deklarasi yang dikaitkan dengan ID Komponen
        a = (EditText) findViewById(R.id.a);
        t = (EditText) findViewById(R.id.t);
        hitung = (Button) findViewById(R.id.hitung);
        hasil = (TextView) findViewById(R.id.hasil);
        //aksi jika tombol Button di klik
        hitung.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                //jika tidak mengisi panjang dan lebar sekaligus maka akan tampil notifikasi
                if (a.length() == 0 && t.length() == 0) {
                    Toast.makeText(getApplication(), "alas dan tinggi tidak boleh Kosong", Toast.LENGTH_LONG).show();
                }
                //notifikasi ini akan muncul jika panjangnya tidak diisi
                else if (a.length() == 0) {
                    Toast.makeText(getApplication(), "alas tidak boleh kosong", Toast.LENGTH_LONG).show();
                }
                //notifikasi jika lebar tidak diisi
                else if (t.length() == 0) {
                    Toast.makeText(getApplication(), "tinggi tidak boleh kosong", Toast.LENGTH_LONG).show();
                } else {
                    //Deklarasi variabel perhitungan
                    String isiAlas = a.getText().toString();
                    String isiTinggi = t.getText().toString();
                    double a = Double.parseDouble(isiAlas);
                    double t = Double.parseDouble(isiTinggi);
                    double hs = jajargenjang(a, t);
                    String output = String.valueOf(hs);
                    hasil.setText(output.toString());

                }
            }

            public double jajargenjang(double a, double t) {return a * t / 2; }

        });

    }
}



