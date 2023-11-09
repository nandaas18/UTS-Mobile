package com.afonetech.mybottomnavigation;


import android.content.Intent;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;

import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentTransaction;

public class FirstFragment extends Fragment {

    public FirstFragment() {

    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        View rootView = inflater.inflate(R.layout.fragment_first, container, false);

        Button btnpp = (Button) rootView.findViewById(R.id.ppanjang);
        btnpp.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(getActivity(), Ppanjang.class);
                startActivity(intent);
            }
        });

        Button btnper = (Button) rootView.findViewById(R.id.persegi);
        btnper.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(getActivity(), Persegi.class);
                startActivity(intent);
            }
        });


        return rootView;
    }
}

