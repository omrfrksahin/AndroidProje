package com.sahin.filmler_listview_araproje;


import android.content.Context;
import android.icu.text.Transliterator;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.ArrayList;

public class CustomAdapter extends BaseAdapter {

    private Context activity;
    private ArrayList<TBLFilmler> Filmler;
    public CustomAdapter(Context activity,ArrayList<TBLFilmler> Filmler){
        this.Filmler = Filmler;
        this.activity = activity;

    }

    @Override
    public int getCount() {
        return Filmler.size();
    }

    @Override
    public Object getItem(int position) {
        return Filmler.get(position).adi;
    }

    @Override
    public long getItemId(int position) {
        return Filmler.get(position).ResimId;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
       convertView = LayoutInflater.from(activity).inflate(R.layout.gridviewsatir,parent,false);
        ImageView resim = convertView.findViewById(R.id.Images);
        TextView adi = convertView.findViewById(R.id.ResimId);

        resim.setImageResource(Filmler.get(position).ResimId);
        adi.setText(Filmler.get(position).adi);

        return convertView;
    }
}
