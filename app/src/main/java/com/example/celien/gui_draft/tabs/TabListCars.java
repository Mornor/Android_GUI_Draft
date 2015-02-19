package com.example.celien.gui_draft.tabs;


import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ListAdapter;
import android.widget.ListView;

import com.example.celien.gui_draft.R;

public class TabListCars extends Fragment{

    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View rootView = inflater.inflate(R.layout.tab_list_cars, container, false);

        // Create the list
        String[] cars = {"Bmw", "Volvo", "Audi", "Tesla", "Porsche", "Mercedes"};
        ListAdapter adapter = new ArrayAdapter<String>(getActivity(), android.R.layout.simple_list_item_1, cars);
        ListView lvCars = (ListView)rootView.findViewById(R.id.lvCars);
        lvCars.setAdapter(adapter);

        return rootView;
    }
}
