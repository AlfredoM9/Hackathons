package com.example.eventsapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

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
        int exits = checkUserExists(tempEmail, tempPassword);
        if(exits == 1)
        {
            Intent intent = new Intent(this, MainFeed.class);
            startActivity(intent);
        }

        else
        {

        }


    }

    int checkUserExists(String email, String password)
    {
        if(true)
        {
            return 1;
        }

        else
        {
            return 0;
        }
    }
}
