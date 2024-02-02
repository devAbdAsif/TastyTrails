package com.example.tastytrails;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;

public class MainActivity2 extends AppCompatActivity {
ImageView imageView;
TextView textView,textView1;

    @SuppressLint("MissingInflatedId")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);
        imageView=findViewById(R.id.dishimg);
        textView=findViewById(R.id.dishhead);
        textView1=findViewById(R.id.descdish);
        imageView.setImageResource(getIntent().getIntExtra("image name",0));
        textView.setText(getIntent().getStringExtra("Text"));
        textView1.setText(getIntent().getStringExtra("desc"));
    }
}