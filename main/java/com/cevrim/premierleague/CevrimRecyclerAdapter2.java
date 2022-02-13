package com.cevrim.premierleague;

import androidx.recyclerview.widget.RecyclerView;

import android.content.Context;
import android.net.Uri;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;

public class CevrimRecyclerAdapter2 extends RecyclerView.Adapter<CevrimRecyclerAdapter2.cevrimviewholder2> {

    String hometeams[],awayteams[],date[],time[],stadium[],imght[],imgat[];
    Context context;
    public CevrimRecyclerAdapter2(Context ct,String s1[],String s2[],String s3[],String s4[],String s5[],String img1[],String img2[]){
        context=ct;
        hometeams=s1;
        awayteams=s2;
        date=s3;
        time=s4;
        stadium=s5;
        imght=img1;
        imgat=img2;
    }


    @NonNull
    @Override
    public cevrimviewholder2 onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        LayoutInflater inflater2 = LayoutInflater.from(context);
        View view =inflater2.inflate(R.layout.allmatchups,parent,false);
        return new cevrimviewholder2(view);
    }

    @Override
    public void onBindViewHolder(@NonNull cevrimviewholder2 holder, int position) {
        holder.tv_home.setText(hometeams[position]);
        holder.tv_away.setText(awayteams[position]);
        holder.tv_date.setText(date[position]);
        holder.tv_time.setText(time[position]);
        holder.tv_stadium.setText(stadium[position]);
        holder.iv_home.setImageResource(getImageId(context,imght[position]));
        holder.iv_away.setImageResource(getImageId(context,imgat[position]));
    }


    @Override
    public int getItemCount() {
        return 10;
    }

    public class cevrimviewholder2 extends RecyclerView.ViewHolder{

        TextView tv_date,tv_time,tv_home,tv_away,tv_stadium;
        ImageView iv_home,iv_away;


        public cevrimviewholder2(@NonNull View itemView) {
            super(itemView);
            tv_date=itemView.findViewById(R.id.tv_date2);
            tv_time=itemView.findViewById(R.id.tv_time2);
            tv_home=itemView.findViewById(R.id.tv_home2);
            tv_away=itemView.findViewById(R.id.tv_away2);
            iv_home=itemView.findViewById(R.id.iv_home2);
            iv_away=itemView.findViewById(R.id.iv_away2);
            tv_stadium=itemView.findViewById(R.id.tv_stadium2);
        }
    }

    public static int getImageId(Context context, String imageName) {
        return context.getResources().getIdentifier("drawable/" + imageName, null, context.getPackageName());
    }
}