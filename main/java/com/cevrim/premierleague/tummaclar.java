package com.cevrim.premierleague;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.os.Bundle;

public class tummaclar extends AppCompatActivity {
    RecyclerView recyclerView;
    SQLiteDatabase db;
    String TABLO_ADI="matchups";
    Cursor cs1;

    String dizi1[]=new String[10];
    String dizi2[]=new String[10];
    String dizi3[]=new String[10];
    String dizi4[]=new String[10];
    String dizi5[]=new String[10];
    String dizi6[]=new String[10];
    String dizi7[]=new String[10];

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_tummaclar);
       recyclerView=findViewById(R.id.revivo2);
        db=this.openOrCreateDatabase("cevrim2.db",MODE_PRIVATE,null);

        cs1=db.rawQuery("SELECT * FROM "+TABLO_ADI,null);
        int i=0;
        while(cs1.moveToNext()){
            String htname =cs1.getString(cs1.getColumnIndexOrThrow("htname"));
            String atname =cs1.getString(cs1.getColumnIndexOrThrow("atname"));
            String date =cs1.getString(cs1.getColumnIndexOrThrow("date"));
            String time =cs1.getString(cs1.getColumnIndexOrThrow("time"));
            String stadium =cs1.getString(cs1.getColumnIndexOrThrow("stadium"));
            String atimg=cs1.getString(cs1.getColumnIndexOrThrow("atimg"));
            String htimg=cs1.getString(cs1.getColumnIndexOrThrow("htimg"));
            dizi1[i]=htname;
            dizi2[i]=atname;
            dizi3[i]=date;
            dizi4[i]=time;
            dizi5[i]=stadium;
            dizi6[i]=htimg;
            dizi7[i]=atimg;
            i++;
        }

        CevrimRecyclerAdapter2 adpter=new CevrimRecyclerAdapter2(this,dizi1,dizi2,dizi3,dizi4,dizi5,dizi6,dizi7);
        recyclerView.setAdapter(adpter);
        recyclerView.setLayoutManager(new LinearLayoutManager(this));

    }
}