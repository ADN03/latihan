package com.example.ridorianto.bangun_datar;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;


public class Dashboard extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_dashboard);
    }

    public void btn_psg(View view){
        Intent psg = new Intent(Dashboard.this, persegi_panjang.class);
        startActivity(psg);
    }

    public void btn_sgt (View view){
        Intent sgt = new Intent(Dashboard.this, luas_segitiga.class);
        startActivity(sgt);
    }
    public void btn_jjg (View view) {
        Intent jjg = new Intent(Dashboard.this, jajar_genjang.class);
        startActivity(jjg);
    }
    public void btn_psgp (View view) {
        Intent psgp = new Intent(Dashboard.this, persegi.class);
        startActivity(psgp);
    }
    public void btn_blk (View view) {
        Intent blk = new Intent(Dashboard.this, belah_ketupat.class);
        startActivity(blk);
    }
}
