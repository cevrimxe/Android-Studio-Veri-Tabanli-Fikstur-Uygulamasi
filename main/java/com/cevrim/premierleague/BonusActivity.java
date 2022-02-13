package com.cevrim.premierleague;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.os.Bundle;
import android.widget.Toast;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class BonusActivity extends AppCompatActivity {
    RecyclerView recyclerView;
    SQLiteDatabase db;
    Cursor cs1;
    String TABLO_ADI="matchups";

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
        setContentView(R.layout.activity_bonus);
        recyclerView=findViewById(R.id.revivo2);
        db=this.openOrCreateDatabase("cevrim2.db",MODE_PRIVATE,null);

        cs1=db.rawQuery("SELECT * FROM "+TABLO_ADI,null);

        List<Integer> numbers = new ArrayList<Integer>(10);
        for (int i = 0; i < 10; i++)
            numbers.add(i);
        Collections.shuffle(numbers);

        List<Integer> numbers2 = new ArrayList<Integer>(10);
        for (int i = 0; i < 10; i++)
            numbers2.add(i);
        Collections.shuffle(numbers2);

        int i=0;
        while(cs1.moveToNext()){
            String htname =cs1.getString(cs1.getColumnIndexOrThrow("htname"));
            String atname =cs1.getString(cs1.getColumnIndexOrThrow("atname"));
            String date =cs1.getString(cs1.getColumnIndexOrThrow("date"));
            String time =cs1.getString(cs1.getColumnIndexOrThrow("time"));
            String stadium =cs1.getString(cs1.getColumnIndexOrThrow("stadium"));
            String atimg=cs1.getString(cs1.getColumnIndexOrThrow("atimg"));
            String htimg=cs1.getString(cs1.getColumnIndexOrThrow("htimg"));
            dizi1[numbers.get(i)]=htname;
            dizi2[numbers2.get(i)]=atname;
            dizi3[numbers.get(i)]=date;
            dizi4[numbers2.get(i)]=time;
            dizi5[numbers.get(i)]=stadium;
            dizi6[numbers.get(i)]=htimg;
            dizi7[numbers2.get(i)]=atimg;
            i++;
        }

        CevrimRecyclerAdapter2 adpter=new CevrimRecyclerAdapter2(this,dizi1,dizi2,dizi3,dizi4,dizi5,dizi6,dizi7);
        recyclerView.setAdapter(adpter);
        recyclerView.setLayoutManager(new LinearLayoutManager(this));
    }
}