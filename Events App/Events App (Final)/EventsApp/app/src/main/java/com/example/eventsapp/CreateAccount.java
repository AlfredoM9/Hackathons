package com.example.eventsapp;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import com.google.android.gms.tasks.OnFailureListener;
import com.google.android.gms.tasks.OnSuccessListener;
import com.google.firebase.auth.FirebaseAuth;
import com.google.firebase.database.FirebaseDatabase;
import com.google.firebase.firestore.DocumentReference;
import com.google.firebase.firestore.FirebaseFirestore;

import java.util.HashMap;
import java.util.Map;
import com.google.firebase.firestore.FirebaseFirestore;

public class CreateAccount extends AppCompatActivity {

    int Count = 0;
    private Button buttonSubmit, buttonReset;
    private EditText editName, editPassword, editEmail, editUniversity;
    private TextView result;
    FirebaseFirestore db = FirebaseFirestore.getInstance();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_create_account);

        buttonSubmit = (Button) findViewById(R.id.buttonSubmit);

        buttonSubmit.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                saveProfile();
                openActivity();
            }
        });

        buttonReset = (Button) findViewById(R.id.buttonReset);

        buttonReset.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                reset();
            }
        });
    }

    void saveProfile()
    {
        editName  = (EditText) findViewById(R.id.editName);
        editPassword = (EditText) findViewById(R.id.editPassword);
        result = (TextView) findViewById(R.id.tvResult);
        editEmail = (EditText) findViewById(R.id.editEmail);
        editUniversity = (EditText) findViewById(R.id.editUniversity);

        Users currentUser = new Users();
        String name = editName.getText().toString();
        String password = editPassword.getText().toString();
        String email = editEmail.getText().toString();
        String university = editUniversity.getText().toString();
        result.setText("Name:\t" + name + "\nPassword:\t" + password );
        currentUser.setFirstName(name);
        currentUser.setEmail(email);
        currentUser.setPassword(password);
        currentUser.setUniversity(university);

        // Create a new user with a first and last name
        Map<String, Object> user = new HashMap<>();
        Map<String, Object> counter = new HashMap<>();
        user.put("first", name);
        user.put("email", email);
        user.put("password", password);
        user.put("university", university);
        Count++;
        counter.put("counter", Count);

        db.collection("users").add(user);
        db.collection("users").document("Counter").update(counter);

    }

    void openActivity()
    {
        Intent intent = new Intent(this, MainFeed.class);
        startActivity(intent);
    }

    void reset()
    {
        editName.setText("");
        editPassword.setText("");
        editUniversity.setText("");
        editEmail.setText("");
        result.setText("");
        editName.requestFocus();
    }
}
