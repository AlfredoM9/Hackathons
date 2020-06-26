package com.example.eventsapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;
import android.widget.TextView;

public class MainFeed extends AppCompatActivity {
    private Button eventNameButton, createEventButton;
    private ImageButton ImageButton;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main_feed);

        ImageButton = (ImageButton) findViewById(R.id.imageButton2);

        ImageButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                openActivity("Profile");
            }
        });

        eventNameButton = (Button) findViewById(R.id.event_info);
        createEventButton = (Button) findViewById(R.id.create_event);

        eventNameButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openActivity("Event name");
            }
        });

        createEventButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openActivity("Create event");
            }

        });

    }

    void openActivity(String s){

        if(s.equals("Event name")){

            Intent intent = new Intent(this, EventName.class);
            startActivity(intent);
        }

        else if(s.equals("Create event")){

            Intent intent = new Intent(this, CreateEvent.class);
            startActivity(intent);
        }
        else if (s.equals("Profile")){
            Intent intent = new Intent(this,Profile.class);
            startActivity(intent);
        }
    }
}
