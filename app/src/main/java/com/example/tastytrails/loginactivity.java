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

public class loginactivity extends AppCompatActivity {
    EditText edemail1,edpass2;
    Button butnlogin;
    TextView txtsignup;

    FirebaseAuth mAuth;

    @SuppressLint("MissingInflatedId")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_loginactivity);
        edemail1=findViewById(R.id.emailid);
        edpass2=findViewById(R.id.passid);
        butnlogin=findViewById(R.id.appCompatButton);
        txtsignup=findViewById(R.id.txtsignup);

        txtsignup.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intnt=new Intent(loginactivity.this,MainActivity.class);
                startActivity(intnt);
            }
        });

        butnlogin.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String email=edemail1.getText().toString().trim();
                String pass=edpass2.getText().toString().trim();
                Login(email,pass);
            }
        });
    }

    private void Login(String useremail, String userpass) {

        mAuth=FirebaseAuth.getInstance();
        mAuth.signInWithEmailAndPassword(useremail,userpass).addOnCompleteListener(new OnCompleteListener<AuthResult>() {
            @Override
            public void onComplete(@NonNull Task<AuthResult> task) {
                if(task.isSuccessful()){
                    Intent intent=new Intent(loginactivity.this,bottomnavigation.class);
                    startActivity(intent);
                    Toast.makeText(loginactivity.this, "Welcome", Toast.LENGTH_SHORT).show();
                }
            }
        }).addOnFailureListener(new OnFailureListener() {
            @Override
            public void onFailure(@NonNull Exception e) {
                Toast.makeText(loginactivity.this, "Please enter correct details", Toast.LENGTH_SHORT).show();
            }
        });
    }
}