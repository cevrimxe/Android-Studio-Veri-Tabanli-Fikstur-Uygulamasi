package com.cevrim.premierleague;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.content.Context;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.os.Bundle;

public class maclaractivity extends AppCompatActivity {
    RecyclerView denemerecycler;
    SQLiteDatabase db;
    Cursor cs;
    String TABLO_ADI="teams";
    String dizi1[]=new String[20];
    int dizi3[]=new int[20];

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_maclaractivity);
        denemerecycler=findViewById(R.id.denemerecycler);
        int val=getIntent().getIntExtra("pozisyon",0);
        db=this.openOrCreateDatabase("cevrim2.db",MODE_PRIVATE,null);

        cs=db.rawQuery("SELECT * FROM "+TABLO_ADI,null);
        int i=0;
        while(cs.moveToNext()){
            String teamnames =cs.getString(cs.getColumnIndexOrThrow("teamnames"));
            String teamlogos =cs.getString(cs.getColumnIndexOrThrow("teamlogos"));
            dizi1[i]=teamnames;
            dizi3[i]=getImageId(this,teamlogos);
            i++;
        }
        CevrimRecyclerAdapter adptr=new CevrimRecyclerAdapter(this,dizi1,dizi3,val);
        denemerecycler.setAdapter(adptr);
        denemerecycler.setLayoutManager(new LinearLayoutManager(this));
    }
    public static int getImageId(Context context, String imageName) {
        return context.getResources().getIdentifier("drawable/" + imageName, null, context.getPackageName());
    }
}