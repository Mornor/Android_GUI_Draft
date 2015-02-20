package com.example.celien.gui_draft.tabs;


import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import android.widget.Toast;

import com.example.celien.gui_draft.R;

public class TabPersonnalSpace extends Fragment {

    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View rootView = inflater.inflate(R.layout.tab_personnal_space, container, false);

        TextView tvSettings = (TextView)rootView.findViewById(R.id.tvSettings);
        TextView tvLogout = (TextView)rootView.findViewById(R.id.tvLogout);


        tvSettings.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v) {
                Toast.makeText(getActivity(), "Settings", Toast.LENGTH_SHORT).show();
            }
        });

        tvLogout.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v) {
                Toast.makeText(getActivity(), "Logout", Toast.LENGTH_SHORT).show();
            }
        });

        return rootView;
    }
}
