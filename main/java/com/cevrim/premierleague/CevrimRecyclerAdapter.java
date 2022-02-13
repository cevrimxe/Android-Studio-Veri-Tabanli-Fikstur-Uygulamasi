package com.cevrim.premierleague;

import androidx.recyclerview.widget.RecyclerView;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;

public class CevrimRecyclerAdapter extends RecyclerView.Adapter<CevrimRecyclerAdapter.cevrimviewholder> {

    String data1[];
    int images[],pos;
    Context context;
    public CevrimRecyclerAdapter(Context ct,String s1[],int img[],int position){
        context=ct;
        data1=s1;
        images = img;
        pos=position;
    }


    @NonNull
    @Override
    public cevrimviewholder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        LayoutInflater inflater = LayoutInflater.from(context);
        View view =inflater.inflate(R.layout.matchuprow,parent,false);
        return new cevrimviewholder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull cevrimviewholder holder, int position) {
        switch (pos) {
            case 0:
                holder.tv_home.setText(data1[pos]);
                holder.iv_home.setImageResource(images[pos]);
                holder.tv_away.setText(data1[1]);
                holder.iv_away.setImageResource(images[1]);
                holder.iv_winratio.setImageResource(R.drawable.mancityvschelsea);
                holder.tv_stadium.setText("Etihad Stadium");
                holder.iv_history.setImageResource(R.drawable.mancityvschelseahis);
                holder.tv_date.setText("15/01/2022");
                holder.tv_time.setText("15:30");
                break;
            case 1:
                holder.tv_home.setText(data1[0]);
                holder.iv_home.setImageResource(images[0]);
                holder.tv_away.setText(data1[pos]);
                holder.iv_away.setImageResource(images[pos]);
                holder.iv_winratio.setImageResource(R.drawable.mancityvschelsea);
                holder.tv_stadium.setText("Etihad Stadium");
                holder.iv_history.setImageResource(R.drawable.mancityvschelseahis);
                holder.tv_date.setText("15/01/2022");
                holder.tv_time.setText("15:30");
                break;
            case 2:
                holder.tv_home.setText(data1[pos]);
                holder.iv_home.setImageResource(images[pos]);
                holder.tv_away.setText(data1[11]);
                holder.iv_away.setImageResource(images[11]);
                holder.iv_winratio.setImageResource(R.drawable.liverpoolvsbrentford);
                holder.tv_stadium.setText("Anfield Stadium");
                holder.iv_history.setImageResource(R.drawable.liverpoolvsbrentfordhis);
                holder.tv_date.setText("16/01/2022");
                holder.tv_time.setText("17:00");
                break;
            case 3:
                holder.tv_home.setText(data1[5]);
                holder.iv_home.setImageResource(images[5]);
                holder.tv_away.setText(data1[pos]);
                holder.iv_away.setImageResource(images[pos]);
                holder.iv_winratio.setImageResource(R.drawable.tottenhamvsarsenal);
                holder.tv_stadium.setText("Tottenham Hotspur Stadium");
                holder.iv_history.setImageResource(R.drawable.tottenhamvsarsenalhis);
                holder.tv_date.setText("16/01/2022");
                holder.tv_time.setText("19:30");
                break;
            case 4:
                holder.tv_home.setText(data1[pos]);
                holder.iv_home.setImageResource(images[pos]);
                holder.tv_away.setText(data1[15]);
                holder.iv_away.setImageResource(images[15]);
                holder.iv_winratio.setImageResource(R.drawable.westhamvsleeds);
                holder.tv_stadium.setText("London Stadium");
                holder.iv_history.setImageResource(R.drawable.westhamvsleedshis);
                holder.tv_date.setText("16/01/2022");
                holder.tv_time.setText("17:00");
                break;
            case 5:
                holder.tv_home.setText(data1[pos]);
                holder.iv_home.setImageResource(images[pos]);
                holder.tv_away.setText(data1[3]);
                holder.iv_away.setImageResource(images[3]);
                holder.iv_winratio.setImageResource(R.drawable.tottenhamvsarsenal);
                holder.tv_stadium.setText("Tottenham Hotspur Stadium");
                holder.iv_history.setImageResource(R.drawable.tottenhamvsarsenalhis);
                holder.tv_date.setText("16/01/2022");
                holder.tv_time.setText("19:30");
                break;
            case 6:
                holder.tv_home.setText(data1[12]);
                holder.iv_home.setImageResource(images[12]);
                holder.tv_away.setText(data1[pos]);
                holder.iv_away.setImageResource(images[pos]);
                holder.iv_winratio.setImageResource(R.drawable.astonvsmanu);
                holder.tv_stadium.setText("Villa Park");
                holder.iv_history.setImageResource(R.drawable.astonvsmanuhis);
                holder.tv_date.setText("15/01/2022");
                holder.tv_time.setText("20:30");
                break;
            case 7:
                holder.tv_home.setText(data1[pos]);
                holder.iv_home.setImageResource(images[pos]);
                holder.tv_away.setText(data1[13]);
                holder.iv_away.setImageResource(images[13]);
                holder.iv_winratio.setImageResource(R.drawable.wolwerhamptonvssouth);
                holder.tv_stadium.setText("Molineux Stadium");
                holder.iv_history.setImageResource(R.drawable.wolwerhamptonvssouthhis);
                holder.tv_date.setText("15/01/2022");
                holder.tv_time.setText("18:00");
                break;
            case 8:
                holder.tv_home.setText(data1[pos]);
                holder.iv_home.setImageResource(images[pos]);
                holder.tv_away.setText(data1[10]);
                holder.iv_away.setImageResource(images[10]);
                holder.iv_winratio.setImageResource(R.drawable.brightonvscrystalpalace2);
                holder.tv_stadium.setText("The A.E.C. Stadium");
                holder.iv_history.setImageResource(R.drawable.brightonvscrystalpalacehis);

                break;
            case 9:
                holder.tv_home.setText(data1[17]);
                holder.iv_home.setImageResource(images[17]);
                holder.tv_away.setText(data1[pos]);
                holder.iv_away.setImageResource(images[pos]);
                holder.iv_winratio.setImageResource(R.drawable.burnleyvsleicester);
                holder.tv_stadium.setText("Turf Moor");
                holder.iv_history.setImageResource(R.drawable.burnleyvsleicesterhis);
                holder.tv_date.setText("15/01/2022");
                holder.tv_time.setText("18:00");
                break;
            case 10:
                holder.tv_home.setText(data1[8]);
                holder.iv_home.setImageResource(images[8]);
                holder.tv_away.setText(data1[pos]);
                holder.iv_away.setImageResource(images[pos]);
                holder.iv_winratio.setImageResource(R.drawable.brightonvscrystalpalace2);
                holder.tv_stadium.setText("The A.E.C. Stadium");
                holder.iv_history.setImageResource(R.drawable.brightonvscrystalpalacehis);
                holder.tv_ref.setText("Referee: Ahmet Çevrim");
                break;
            case 11:
                holder.tv_home.setText(data1[2]);
                holder.iv_home.setImageResource(images[2]);
                holder.tv_away.setText(data1[pos]);
                holder.iv_away.setImageResource(images[pos]);
                holder.iv_winratio.setImageResource(R.drawable.liverpoolvsbrentford);
                holder.tv_stadium.setText("Anfield Stadium");
                holder.iv_history.setImageResource(R.drawable.liverpoolvsbrentfordhis);
                holder.tv_date.setText("16/01/2022");
                holder.tv_time.setText("17:00");
                break;
            case 12:
                holder.tv_home.setText(data1[pos]);
                holder.iv_home.setImageResource(images[pos]);
                holder.tv_away.setText(data1[6]);
                holder.iv_away.setImageResource(images[6]);
                holder.iv_winratio.setImageResource(R.drawable.astonvsmanu);
                holder.tv_stadium.setText("Villa Park");
                holder.iv_history.setImageResource(R.drawable.astonvsmanuhis);
                holder.tv_date.setText("15/01/2022");
                holder.tv_time.setText("20:30");
                break;
            case 13:
                holder.tv_home.setText(data1[7]);
                holder.iv_home.setImageResource(images[7]);
                holder.tv_away.setText(data1[pos]);
                holder.iv_away.setImageResource(images[pos]);
                holder.iv_winratio.setImageResource(R.drawable.wolwerhamptonvssouth);
                holder.tv_stadium.setText("Molineux Stadium");
                holder.iv_history.setImageResource(R.drawable.wolwerhamptonvssouthhis);
                holder.tv_date.setText("15/01/2022");
                holder.tv_time.setText("18:00");
                break;
            case 14:
                holder.tv_home.setText(data1[19]);
                holder.iv_home.setImageResource(images[19]);
                holder.tv_away.setText(data1[pos]);
                holder.iv_away.setImageResource(images[pos]);
                holder.iv_winratio.setImageResource(R.drawable.norwichvseverton);
                holder.tv_stadium.setText("Carrow Road");
                holder.iv_history.setImageResource(R.drawable.norwichvsevertonhis);
                holder.tv_date.setText("15/01/2022");
                holder.tv_time.setText("18:00");
                break;
            case 15:
                holder.tv_home.setText(data1[4]);
                holder.iv_home.setImageResource(images[4]);
                holder.tv_away.setText(data1[pos]);
                holder.iv_away.setImageResource(images[pos]);
                holder.iv_winratio.setImageResource(R.drawable.westhamvsleeds);
                holder.tv_stadium.setText("London Stadium");
                holder.iv_history.setImageResource(R.drawable.westhamvsleedshis);
                holder.tv_date.setText("16/01/2022");
                holder.tv_time.setText("17:00");
                break;
            case 16:
                holder.tv_home.setText(data1[18]);
                holder.iv_home.setImageResource(images[18]);
                holder.tv_away.setText(data1[pos]);
                holder.iv_away.setImageResource(images[pos]);
                holder.iv_winratio.setImageResource(R.drawable.newcastlevsozantufan);
                holder.tv_stadium.setText("St. James' Park");
                holder.iv_history.setImageResource(R.drawable.newcastlevsozantufanhis);
                holder.tv_date.setText("15/01/2022");
                holder.tv_time.setText("18:00");
                break;
            case 17:
                holder.tv_home.setText(data1[pos]);
                holder.iv_home.setImageResource(images[pos]);
                holder.tv_away.setText(data1[9]);
                holder.iv_away.setImageResource(images[9]);
                holder.iv_winratio.setImageResource(R.drawable.burnleyvsleicester);
                holder.tv_stadium.setText("Turf Moor");
                holder.iv_history.setImageResource(R.drawable.burnleyvsleicesterhis);
                holder.tv_date.setText("15/01/2022");
                holder.tv_time.setText("18:00");
                break;
            case 18:
                holder.tv_home.setText(data1[pos]);
                holder.iv_home.setImageResource(images[pos]);
                holder.tv_away.setText(data1[16]);
                holder.iv_away.setImageResource(images[16]);
                holder.iv_winratio.setImageResource(R.drawable.newcastlevsozantufan);
                holder.tv_stadium.setText("St. James' Park");
                holder.iv_history.setImageResource(R.drawable.newcastlevsozantufanhis);
                holder.tv_date.setText("15/01/2022");
                holder.tv_time.setText("18:00");
                break;
            case 19:
                holder.tv_home.setText(data1[pos]);
                holder.iv_home.setImageResource(images[pos]);
                holder.tv_away.setText(data1[14]);
                holder.iv_away.setImageResource(images[14]);
                holder.iv_winratio.setImageResource(R.drawable.norwichvseverton);
                holder.tv_stadium.setText("Carrow Road");
                holder.iv_history.setImageResource(R.drawable.norwichvsevertonhis);
                holder.tv_date.setText("15/01/2022");
                holder.tv_time.setText("18:00");

                break;



        }
    }


    @Override
    public int getItemCount() {
        return 1;
    }

    public class cevrimviewholder extends RecyclerView.ViewHolder{

        TextView tv_week,tv_date,tv_time,tv_home,tv_away,tv_ref,tv_stadium;
        ImageView iv_home,iv_away,iv_winratio,iv_history;



        public cevrimviewholder(@NonNull View itemView) {
            super(itemView);
            tv_date=itemView.findViewById(R.id.tv_date2);
            tv_week=itemView.findViewById(R.id.tv_week);
            tv_time=itemView.findViewById(R.id.tv_time2);
            tv_home=itemView.findViewById(R.id.tv_home2);
            tv_away=itemView.findViewById(R.id.tv_away2);
            iv_home=itemView.findViewById(R.id.iv_home2);
            iv_away=itemView.findViewById(R.id.iv_away2);
            tv_ref=itemView.findViewById(R.id.tv_ref);
            tv_stadium=itemView.findViewById(R.id.tv_stadium2);
            iv_winratio=itemView.findViewById(R.id.iv_winratio);
            iv_history=itemView.findViewById(R.id.iv_history);
        }
    }
}