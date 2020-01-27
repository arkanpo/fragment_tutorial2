package com.example.fragment_tutorial2;


import android.content.Intent;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;

public class PageOne extends Fragment {

    Button golist;

    public PageOne() {
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View v = inflater.inflate(R.layout.fragment_page_one, container,false);

        golist = v.findViewById(R.id.golist);

        golist.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent abc = new Intent(getActivity(),coba.class);
                startActivity(abc);

            }
        });


        return v;
    }



}
