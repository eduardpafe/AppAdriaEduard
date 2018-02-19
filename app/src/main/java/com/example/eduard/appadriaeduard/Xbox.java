package com.example.eduard.appadriaeduard;


import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.widget.ListView;

public class Xbox extends AppCompatActivity {
    ListViewAdapter adapter;

    String[] joc = new String[]{
            "FIFA 18",
            "Forza Horizon 3",
            "Dragon Ball FighterZ",
            "Playerunknown's Battlegrounds",
            "Assassin's Creed Origins",
            "Call of Duty: WWII",
            "Forza Motorsport 7",
            "GTA V",
            "Gears of War 4",
            "Halo 5"
    };

    String[] companyia = new String[]{
            "EA Sports",
            "Microsoft Studios",
            "Ark System Works",
            "Brendan Greene",
            "Ubisoft",
            "Activision",
            "Turn 10 Studios",
            "Rockstar games",
            "The Coalition",
            "343 Industries"
    };

    int[] imatgeJoc = {
            R.mipmap.fifa,
            R.mipmap.forza,
            R.mipmap.dragonball,
            R.mipmap.battleground,
            R.mipmap.assassins,
            R.mipmap.cod,
            R.mipmap.motorsport,
            R.mipmap.gta,
            R.mipmap.gearsofwar,
            R.mipmap.halo
    };

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_xbox);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);


        final ListView lista = (ListView) findViewById(R.id.listView1);
        adapter = new ListViewAdapter(this, joc, companyia, imatgeJoc);

        lista.setAdapter(adapter);
    }

}
