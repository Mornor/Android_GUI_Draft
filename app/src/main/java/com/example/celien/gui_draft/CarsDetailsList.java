package com.example.celien.gui_draft;

import android.os.Bundle;
import android.support.v7.app.ActionBarActivity;
import android.support.v7.widget.Toolbar;
import android.widget.ListAdapter;
import android.widget.ListView;
import com.example.celien.gui_draft.adapter.CustomDetailsCarRowAdapter;


public class CarsDetailsList extends ActionBarActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_cars_details_list);

        // Get the extrasData from intent
        Bundle dataFromTabLisCart = getIntent().getExtras();

        // Set the Toolbar attributes
        Toolbar toolbar = (Toolbar)findViewById(R.id.tool_bar);
        setSupportActionBar(toolbar);
        if(dataFromTabLisCart != null)
            getSupportActionBar().setTitle("Available " +dataFromTabLisCart.getString("brand"));

        // Create the detail List and set it to the ListView.
        String[][] detailsList = {{"S. Henrotin", "V.50", "30 cents/Km", "Yes"}, {"C. Nanson", "C.70", "56 cents/Km", "No"}, {"D. Prieels", "C.30", "43 cents/Km", "Yes"}};
        ListAdapter adapter = new CustomDetailsCarRowAdapter(this, detailsList);
        ListView lvDetailsCars = (ListView)findViewById(R.id.lvDetailsCars);
        lvDetailsCars.setAdapter(adapter);
    }


}
