package com.example.eventsapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class CreateAccount extends AppCompatActivity {

    private Button buttonSubmit, buttonReset;
    private EditText editName, editPassword, editEmail, editUniversity;
    private TextView result;

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
        result.setText("");
        editName.requestFocus();
    }
}
