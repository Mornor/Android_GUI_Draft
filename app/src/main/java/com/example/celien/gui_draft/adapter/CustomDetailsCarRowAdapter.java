package com.example.celien.gui_draft.adapter;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.TextView;

import com.example.celien.gui_draft.R;

public class CustomDetailsCarRowAdapter extends ArrayAdapter<String[]>{

    public CustomDetailsCarRowAdapter(Context context, String[][] list){
        super(context, R.layout.custom_details_cars_row, list);
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        LayoutInflater inflater = LayoutInflater.from(getContext());
        View customView = inflater.inflate(R.layout.custom_details_cars_row, parent, false);

        // Set the needed reference
        String[] item = getItem(position);
        TextView tvEditableOwner     = (TextView)customView.findViewById(R.id.tvEditableOwner);
        TextView tvEditableModel     = (TextView)customView.findViewById(R.id.tvEditableModel);
        TextView tvEditablePrice     = (TextView)customView.findViewById(R.id.tvEditablePrice);
        TextView tvEditableAvailable = (TextView)customView.findViewById(R.id.tvEditableAvailable);

        // Fill each row
        tvEditableOwner.setText(item[0]);
        tvEditableModel.setText(item[1]);
        tvEditablePrice.setText(item[2]);
        tvEditableAvailable.setText(item[3]);

        return customView;
    }
}
