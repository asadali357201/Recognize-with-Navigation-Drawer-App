package com.example.recognizetest;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;

public class CustomAdapter extends BaseAdapter {
    Context manualcontext;
    int[] manualcountryimage;
    String[] manualcountrynames;
    LayoutInflater xmlninflater=null;

    public CustomAdapter(Context applicationContext, int[] catimage, String[] catNmaes) {
        this.manualcontext=applicationContext;
        this.manualcountryimage=catimage;
        this.manualcountrynames=catNmaes;
        xmlninflater=(LayoutInflater) manualcontext.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
    }

    @Override
    public int getCount() {
         return manualcountrynames.length;
    }

    @Override
    public Object getItem(int position) {
        return null;
    }

    @Override
    public long getItemId(int position) {
        return position;
    }

    @Override
    public View getView(int position, View view, ViewGroup viewGroup) {
        View countryrow= xmlninflater.inflate(R.layout.itemlayout,null);
        ImageView customimageview=countryrow.findViewById(R.id.layoutImg);
        TextView customtextview=countryrow.findViewById(R.id.layouttv);
        customtextview.setText(manualcountrynames[position]);
        customimageview.setImageResource(manualcountryimage[position]);
        return countryrow;
    }
}
