package com.cevrim.premierleague;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Context;
import android.content.Intent;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;

import java.util.ArrayList;

public class takimlaractivity extends AppCompatActivity {
    ListView listView;
    ArrayList<teams> teamsArrayList=new ArrayList<>();
    SQLiteDatabase db;
    Cursor cs;
    String TABLO_ADI="teams";
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_takimlaractivity);
        listView=findViewById(R.id.listView);

        db=this.openOrCreateDatabase("cevrim2.db",MODE_PRIVATE,null);

        cs=db.rawQuery("SELECT * FROM "+TABLO_ADI,null);
        while(cs.moveToNext()){
            String teamname=cs.getString(cs.getColumnIndexOrThrow("teamnames"));
            String teamlogo=cs.getString(cs.getColumnIndexOrThrow("teamlogos"));
            teamsArrayList.add(new teams(teamname,getImageId(this,teamlogo)));
        }
        CevrimAdapter adptr=new CevrimAdapter(teamsArrayList,this);
        listView.setAdapter(adptr);
        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                Intent kafayiyemeceler= new Intent(getApplicationContext(),maclaractivity.class);
                kafayiyemeceler.putExtra("pozisyon",position);
                startActivity(kafayiyemeceler);
            }
        });
    }
    public void btnall(View view) {
        Intent i=new Intent(getApplicationContext(),tummaclar.class);
        startActivity(i);
    }
    public static int getImageId(Context context, String imageName) {
        return context.getResources().getIdentifier("drawable/" + imageName, null, context.getPackageName());
    }

    public void btnbonus(View view) {
        Intent j=new Intent(getApplicationContext(),BonusActivity.class);
        startActivity(j);
    }
}