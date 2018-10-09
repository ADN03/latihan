package com.example.ridorianto.bangun_datar;

/**
 * Created by Rido Rianto on 10/8/2018.
 */

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class persegi extends AppCompatActivity {
    //Deklarasi variabel komponen
    EditText s1;
    Button b;
    TextView hasil;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        //memanggil file xml
        setContentView(R.layout.persegi);

        //Deklarasi yang dikaitkan dengan id file xml
        s1 = (EditText) findViewById(R.id.sisi1);
        b = (Button) findViewById(R.id.button);
        hasil = (TextView) findViewById(R.id.txt_hasil);

        //aksi jika tombol button di klik
        b.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                //toas
                if(s1.length()== 0 ){
                    Toast.makeText(getApplication(),"sisi tidak boleh kosong", Toast.LENGTH_LONG).show();
                }else {
                    //Deklarasi variabel perhitungan
                    String isiPanjang = s1.getText().toString();
                    double s1 = Double.parseDouble(isiPanjang);
                    double hs = persegi (s1);
                    String output = String.valueOf(hs);
                    hasil.setText(output.toString());
                }
            }
        });
    }
    public double persegi(double s1) { return s1*s1; }
}
