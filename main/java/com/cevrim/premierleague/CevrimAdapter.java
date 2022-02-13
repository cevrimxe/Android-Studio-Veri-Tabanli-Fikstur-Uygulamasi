package com.cevrim.premierleague;

import android.app.Activity;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.ArrayList;

public class CevrimAdapter extends BaseAdapter {

    ArrayList<teams> teamsArrayList=new ArrayList<>();
    Activity activity=new Activity();

    public CevrimAdapter(ArrayList<teams> teamsArrayList, Activity activity) {
        this.teamsArrayList = teamsArrayList;
        this.activity = activity;
    }

    @Override
    public int getCount() {
        return teamsArrayList.size();
    }

    @Override
    public Object getItem(int position) {
        return teamsArrayList.get(position);
    }

    @Override
    public long getItemId(int position) {
        return position;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        convertView= LayoutInflater.from(activity).inflate(R.layout.teams_layout,parent,false);
        ImageView img;
        TextView tv;

        img=convertView.findViewById(R.id.iv_TeamLogo);
        tv=convertView.findViewById(R.id.tv_TeamName);

        teams t1=teamsArrayList.get(position);

        img.setImageResource(t1.getM_TeamLogo());
        tv.setText(t1.getM_TeamName());

        return convertView;
    }
}
