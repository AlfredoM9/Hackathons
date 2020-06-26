package com.example.eventsapp;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import com.google.android.gms.tasks.OnCompleteListener;
import com.google.android.gms.tasks.Task;
import com.google.android.gms.tasks.Tasks;
import com.google.firebase.database.DataSnapshot;
import com.google.firebase.database.DatabaseError;
import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;
import com.google.firebase.database.ValueEventListener;
import com.google.firebase.firestore.DocumentReference;
import com.google.firebase.firestore.DocumentSnapshot;
import com.google.firebase.firestore.FirebaseFirestore;
import com.google.firebase.firestore.Query;

import java.util.ArrayList;

public class Login extends AppCompatActivity {

    private Button buttonLogIn;
    private EditText email, password;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);

        buttonLogIn = (Button) findViewById(R.id.buttonLogIn);

        buttonLogIn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                checkLogIn();
            }
        });

    }

    void checkLogIn ()
    {
        email = (EditText) findViewById(R.id.LogInEmail);
        password = (EditText) findViewById(R.id.LogInPassword);
        String tempEmail = email.getText().toString();
        String tempPassword = password.getText().toString();
        boolean exits = checkUserExists(tempEmail, tempPassword);
        if(exits)
        {
            Intent intent = new Intent(this, MainFeed.class);
            startActivity(intent);
        }

        else
        {

        }


    }

    boolean checkUserExists(String email, String password)
    {

        return true;
    }
}
