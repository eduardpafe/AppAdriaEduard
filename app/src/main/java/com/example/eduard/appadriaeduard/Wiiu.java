package com.example.eduard.appadriaeduard;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.widget.ListView;

public class Wiiu extends AppCompatActivity {
    ListViewAdapter adapterWiiu;

    String[] joc = new String[]{
            "The Legend of Zelda",
            "Splatoon",
            "Mario Kart 8",
            "Super Smash Bros"
    };

    String[] companyia = new String[]{
            "Nintendo",
            "Nintendo",
            "Nintendo",
            "Bandai Namco Entertainment"
    };

    int[] imatgeJoc = {
            R.mipmap.zelda,
            R.mipmap.splatoon,
            R.mipmap.mariokart,
            R.mipmap.smash
    };

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_wiiu);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);


        final ListView lista = (ListView) findViewById(R.id.listView1);
        adapterWiiu = new ListViewAdapter(this, joc, companyia, imatgeJoc);

        lista.setAdapter(adapterWiiu);
    }

}

