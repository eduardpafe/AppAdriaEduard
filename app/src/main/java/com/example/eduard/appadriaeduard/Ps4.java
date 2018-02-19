package com.example.eduard.appadriaeduard;

import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.widget.ListView;

public class Ps4 extends AppCompatActivity {
    ListViewAdapter adapter;

    String[] joc = new String[]{
            "GTA V",
            "Horizon Zero Dawn",
            "Crash Bandicoot",
            "Battlefield 1",
            "Destiny 2",
            "Tekken 7",
            "OverWatch",
            "NBA 2k18",
            "FIFA 18"
    };

    String[] companyia = new String[]{
            "Rockstar games",
            "Guerrilla Games",
            "Vicarious Visions",
            "EA Digital Illusions CE",
            "Bungie Studios",
            "Bandai Namco",
            "Blizzard Entertainment",
            "Visual Concepts",
            "EA Sports"
    };

    int[] imatgeJoc = {
            R.mipmap.gta,
            R.mipmap.horizon,
            R.mipmap.bandicoot,
            R.mipmap.battlefield,
            R.mipmap.destiny,
            R.mipmap.tekken,
            R.mipmap.overwatch,
            R.mipmap.nba,
            R.mipmap.fifa
    };
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_ps4);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

        final ListView lista = (ListView) findViewById(R.id.listView1);
        adapter = new ListViewAdapter(this, joc, companyia, imatgeJoc);

        lista.setAdapter(adapter);

    }

}
