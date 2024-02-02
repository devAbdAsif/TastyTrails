package com.example.tastytrails;

import android.annotation.SuppressLint;
import android.os.Bundle;

import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.GridLayout;

import java.util.ArrayList;


public class categoriesFragment extends Fragment {
RecyclerView recyclerview;

AdapterClass adapterClass;
ArrayList<ModelClass> list;


    public categoriesFragment() {
        // Required empty public constructor
    }



    @SuppressLint("MissingInflatedId")
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view = inflater.inflate(R.layout.fragment_categories, container, false);

        recyclerview=view.findViewById(R.id.recView);
        list=new ArrayList<>();
        list.add(new ModelClass("Pakistani Foods",R.drawable.pakistanifood,0));
        list.add(new ModelClass("Italian Foods",R.drawable.italianfood,1));
        list.add(new ModelClass("Chinese Foods",R.drawable.chinesefoodlogo,2));
        list.add(new ModelClass("Russian Foods",R.drawable.russianfood,3));
        list.add(new ModelClass("Fast Foods",R.drawable.fastfoodlogo,4));
        list.add(new ModelClass("Afghani Foods",R.drawable.afghani,5));
        adapterClass=new AdapterClass(getContext(),list);
        recyclerview.setAdapter(adapterClass);
        GridLayoutManager gridLayout= new GridLayoutManager(getContext(),2);
        recyclerview.setLayoutManager(gridLayout);
        return view;
    }
}