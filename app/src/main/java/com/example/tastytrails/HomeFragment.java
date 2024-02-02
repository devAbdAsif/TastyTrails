package com.example.tastytrails;

import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.transition.Slide;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;

import com.denzcoskun.imageslider.ImageSlider;
import com.denzcoskun.imageslider.constants.ScaleTypes;
import com.denzcoskun.imageslider.models.SlideModel;

import java.lang.reflect.Array;
import java.util.ArrayList;


public class HomeFragment extends Fragment {
ImageSlider imageslider;

    public HomeFragment() {
        // Required empty public constructor
    }





    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view =inflater.inflate(R.layout.fragment_home, container, false);
        imageslider=view.findViewById(R.id.imgslider);
        ArrayList<SlideModel> slideModels=new ArrayList<>();
        slideModels.add(new SlideModel(R.drawable.biryani, ScaleTypes.FIT));
        slideModels.add(new SlideModel(R.drawable.chickenkarahi, ScaleTypes.FIT));
        slideModels.add(new SlideModel(R.drawable.margheritapizza, ScaleTypes.FIT));
        slideModels.add(new SlideModel(R.drawable.zucchinifritters, ScaleTypes.FIT));
        slideModels.add(new SlideModel(R.drawable.chickenquesadillas, ScaleTypes.FIT));
        slideModels.add(new SlideModel(R.drawable.aloogghosht, ScaleTypes.FIT));
        slideModels.add(new SlideModel(R.drawable.oliviersalad, ScaleTypes.FIT));

        imageslider.setImageList(slideModels,ScaleTypes.FIT);
        return view;
    }
}