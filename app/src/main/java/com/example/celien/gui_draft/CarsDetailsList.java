package com.example.celien.gui_draft;

import android.app.Activity;
import android.os.Bundle;
import android.widget.ListAdapter;
import android.widget.ListView;
import android.widget.TextView;

import com.example.celien.gui_draft.adapter.CustomDetailsCarRowAdapter;


public class CarsDetailsList extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_cars_details_list);

        // Get the extrasData from intent
        Bundle dataFromTabLisCart = getIntent().getExtras();
        if(dataFromTabLisCart != null){
            TextView tvTitleBrand = (TextView)findViewById(R.id.tvTitleCarList);
            tvTitleBrand.setText("Available " +dataFromTabLisCart.getString("brand"));
        }

        // Create the detail List and set it to the ListView.
        String[][] detailsList = {{"S. Henrotin", "V.50", "0.30 cents/kms", "Yes"}, {"C. Nanson", "C.70", "0.56 cents/km", "No"}};
        ListAdapter adapter = new CustomDetailsCarRowAdapter(this, detailsList);
        ListView lvDetailsCars = (ListView)findViewById(R.id.lvDetailsCars);
        lvDetailsCars.setAdapter(adapter);
    }


}
