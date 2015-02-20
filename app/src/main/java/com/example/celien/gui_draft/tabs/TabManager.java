package com.example.celien.gui_draft.tabs;


import android.content.Intent;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.Toast;

import com.example.celien.gui_draft.R;
import com.example.celien.gui_draft.SearchCar;

public class TabManager extends Fragment{


    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {

        View rootView = inflater.inflate(R.layout.tab_manage, container, false);

        // Retrieve items and Set listeners
        ImageView ivFindACar = (ImageView)rootView.findViewById(R.id.ivFindACar);
        ImageView ivManageMyRent = (ImageView)rootView.findViewById(R.id.ivManageMyRent);
        ivFindACar.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v) {
                Intent i = new Intent(getActivity(), SearchCar.class);
                startActivity(i);
            }
        });
        ivManageMyRent.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v) {
                Toast.makeText(getActivity(), "Manage rent", Toast.LENGTH_SHORT).show();
            }
        });



        return rootView;
    }
}
