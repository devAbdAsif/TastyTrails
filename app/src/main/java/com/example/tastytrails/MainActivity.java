package com.example.tastytrails;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import com.google.android.gms.tasks.OnCompleteListener;
import com.google.android.gms.tasks.OnFailureListener;
import com.google.android.gms.tasks.Task;
import com.google.firebase.auth.AuthResult;
import com.google.firebase.auth.FirebaseAuth;
import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;

public class MainActivity extends AppCompatActivity {
    EditText edemail,edpassed;

    Button btnsignup;
    TextView txtlogin;

    String email,pass;

    FirebaseAuth mAuth;

    @SuppressLint("MissingInflatedId")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        edemail=findViewById(R.id.idemail);
        edpassed=findViewById(R.id.idpass);
        btnsignup=findViewById(R.id.appCompatButton);
        txtlogin=findViewById(R.id.idlogin);

        txtlogin.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent=new Intent(MainActivity.this,loginactivity.class);
                startActivity(intent);
            }
        });


        btnsignup.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                email=edemail.getText().toString().trim();
                pass=edpassed.getText().toString().trim();
                if(email.isEmpty() ||pass.isEmpty() ||pass.length()< 6 ){
                    Toast.makeText(MainActivity.this, "Please enter email and password", Toast.LENGTH_LONG).show();
                }
                else {
                    Login(email,pass);
                }
            }
        });

    }


    public void Login(String useremail,String pass){
        mAuth= FirebaseAuth.getInstance();
        mAuth.createUserWithEmailAndPassword(useremail, pass).addOnCompleteListener(new OnCompleteListener<AuthResult>() {
            @Override
            public void onComplete(@NonNull Task<AuthResult> task) {
                if(task.isSuccessful()){
                    Adddatatorealtime();
                    Toast.makeText(MainActivity.this, "Welcome", Toast.LENGTH_LONG).show();
                }
            }
        }).addOnFailureListener(new OnFailureListener() {
            @Override
            public void onFailure(@NonNull Exception e) {
                Toast.makeText(MainActivity.this, "Something went wrong", Toast.LENGTH_LONG).show();
            }
        });
    }
    private void Adddatatorealtime() {
        AddData obj = new AddData(email,pass);
        FirebaseDatabase firebaseDatabase;
        DatabaseReference databaseReference;
        firebaseDatabase = FirebaseDatabase.getInstance();
        databaseReference = firebaseDatabase.getReference("Edify").child("Stds");
        databaseReference.setValue(obj).addOnCompleteListener(new OnCompleteListener<Void>() {
            @Override
            public void onComplete(@NonNull Task<Void> task) {
                if (task.isSuccessful()) {
                    Toast.makeText(MainActivity.this, "AddDataToRealtime", Toast.LENGTH_SHORT).show();
                Intent intent=new Intent(MainActivity.this,bottomnavigation.class);
                startActivity(intent);
                }
            }
        }).addOnFailureListener(new OnFailureListener() {
            @Override
            public void onFailure(@NonNull Exception e) {
                Toast.makeText(MainActivity.this, "something went wrong", Toast.LENGTH_SHORT).show();
            }
        });

    }

}
