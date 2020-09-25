package com.example.n01297262ceng319lab1;

import android.content.Intent;
import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.RelativeLayout;
import android.widget.TextView;
import android.widget.Toast;


public class lvfragment extends Fragment {


    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_lvfragment, container, false);
        // Inflate the layout for this fragment
        String[] menuItems = {"AIActivity", "VRAcivity"};
        ListView listView = (ListView) view.findViewById(R.id.listview);

        ArrayAdapter<String> listViewAdapter = new ArrayAdapter<String>(getActivity(), android.R.layout.simple_list_item_activated_1,menuItems);
        listView.setAdapter(listViewAdapter);
        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                if(position == 0){
                    Intent intent = new Intent(getActivity(),aiactivity.class);
                    startActivity(intent);

                }
                if(position == 1){
                    Intent intent = new Intent(getActivity(),vractivity.class);
                    startActivity(intent);
                }
            }
        });

        Toast.makeText(getActivity(), "onCreate is here", Toast.LENGTH_SHORT).show();
        return view;
    }
    public void onStart()
    {
        super.onStart();

        Toast.makeText(getActivity(), "onStart is here", Toast.LENGTH_SHORT).show();
    }
}