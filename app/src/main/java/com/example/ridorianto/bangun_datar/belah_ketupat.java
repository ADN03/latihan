package com.example.ridorianto.bangun_datar;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;
import android.widget.EditText;
import android.widget.Button;
import android.widget.Toast;

public class belah_ketupat extends AppCompatActivity {
    //Deklarasi Variabel komponen
    EditText d1, d2;
    Button hitung;
    TextView hasil;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        //memanggil file xml
        setContentView(R.layout.belah_ketupat);

        //Deklarasi yang dikaitkan dengan ID Komponen
        d1 = (EditText) findViewById(R.id.d1);
        d2 = (EditText) findViewById(R.id.d2);
        hitung = (Button) findViewById(R.id.hitung);
        hasil = (TextView) findViewById(R.id.hasil);
        //aksi jika tombol Button di klik
        hitung.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                //jika tidak mengisi panjang dan lebar sekaligus maka akan tampil notifikasi
                if (d1.length() == 0 && d2.length() == 0) {
                    Toast.makeText(getApplication(), "d1 dan d2 tidak boleh Kosong", Toast.LENGTH_LONG).show();
                }
                //notifikasi ini akan muncul jika panjangnya tidak diisi
                else if (d1.length() == 0) {
                    Toast.makeText(getApplication(), "d1 tidak boleh kosong", Toast.LENGTH_LONG).show();
                }
                //notifikasi jika lebar tidak diisi
                else if (d2.length() == 0) {
                    Toast.makeText(getApplication(), "d2 tidak boleh kosong", Toast.LENGTH_LONG).show();
                } else {
                    //Deklarasi variabel perhitungan
                    String isiD1 = d1.getText().toString();
                    String isiD2 = d2.getText().toString();
                    double d1 = Double.parseDouble(isiD1);
                    double d2 = Double.parseDouble(isiD2);
                    double hs = belah_ketupat(d1, d2);
                    String output = String.valueOf(hs);
                    hasil.setText(output.toString());

                }
            }

            public double belah_ketupat(double d1, double d2) {return d1 * d2 / 2; }

        });

    }
}



