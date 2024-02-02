package com.example.tastytrails;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentTransaction;

import android.os.Bundle;
import android.view.MenuItem;

import com.google.android.material.bottomnavigation.BottomNavigationView;
import com.google.android.material.navigation.NavigationBarView;

public class bottomnavigation extends AppCompatActivity {
BottomNavigationView bnv;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_bottomnavigation);
        replaceFragment(new HomeFragment());
        bnv=findViewById(R.id.bottomNavigationView);

        bnv.setOnItemSelectedListener(item ->  {

            switch (item.getItemId()){

                case R.id.home:
                    replaceFragment(new HomeFragment());
                    break;

                case R.id.categories:
                    replaceFragment(new categoriesFragment());
                    break;


            }
            return true;
        });
    }

    private void replaceFragment(Fragment fragment){
        FragmentManager fragmentManager=getSupportFragmentManager();
        FragmentTransaction fragmentTransaction=fragmentManager.beginTransaction();
        fragmentTransaction.replace(R.id.framelayoutid,fragment);
        fragmentTransaction.commit();
    }
}