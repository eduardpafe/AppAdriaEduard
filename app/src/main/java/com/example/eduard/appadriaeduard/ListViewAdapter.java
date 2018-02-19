package com.example.eduard.appadriaeduard;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;

/**
 * Created by eduard on 12/02/18.
 */

public class ListViewAdapter extends BaseAdapter{
    // Declare Variables
    Context context;
    String[] titol;
    String[] companyia;
    int[] imagenes;
    LayoutInflater inflater;

    public ListViewAdapter(Context context, String[] titol, String[] companyia, int[] imagenes) {
        this.context = context;
        this.titol = titol;
        this.companyia = companyia;
        this.imagenes = imagenes;
    }

    @Override
    public int getCount() {
        return titol.length;
    }

    @Override
    public Object getItem(int position) {
        return null;
    }

    @Override
    public long getItemId(int position) {
        return 0;
    }

    public View getView(int position, View convertView, ViewGroup parent) {

        // Declare Variables
        TextView txtTitle;
        TextView txtComp;
        ImageView imgImg;

        //http://developer.android.com/intl/es/reference/android/view/LayoutInflater.html
        inflater = (LayoutInflater) context.getSystemService(Context.LAYOUT_INFLATER_SERVICE);

        View itemView = inflater.inflate(R.layout.list_row, parent, false);

        // Locate the TextViews in listview_item.xml
        imgImg = (ImageView) itemView.findViewById(R.id.list_row_image);
        txtTitle = (TextView) itemView.findViewById(R.id.list_row_company);

        txtComp = (TextView) itemView.findViewById(R.id.list_row_title);

        // Capture position and set to the TextViews
        imgImg.setImageResource(imagenes[position]);
        txtTitle.setText(titol[position]);
        txtComp.setText(companyia[position]);

        return itemView;
    }
}
