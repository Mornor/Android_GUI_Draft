package com.example.celien.gui_draft.adapter;


import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import com.example.celien.gui_draft.R;

public class CustomCarRowAdapter extends ArrayAdapter<String>{

    /**
     * @param context
     * @param list : List of the differents presnts cars.
     */
    public CustomCarRowAdapter(Context context, String[] list) {
        super(context, R.layout.custom_cars_row, list); // For each individual item on the list, use custom_cars_row
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        LayoutInflater inflater = LayoutInflater.from(getContext());
        View customView = inflater.inflate(R.layout.custom_cars_row, parent, false);

        // Set the needed reference
        String singleCarItem = getItem(position);
        TextView text = (TextView)customView.findViewById(R.id.tvRowText);
        ImageView image = (ImageView)customView.findViewById(R.id.ivGreenCar);

        text.setText(singleCarItem);

        // Here, we can dynamically change the image.
        if(singleCarItem.equals("Porsche") || singleCarItem.equals("Lada") || singleCarItem.equals("Audi"))
            image.setImageResource(R.drawable.red_car);
        else if(singleCarItem.equals("Renault") || singleCarItem.equals("Volvo") || singleCarItem.equals("Bmw"))
            image.setImageResource(R.drawable.orange_car);
        else
            image.setImageResource(R.drawable.green_car);

        return customView;

    }
}

