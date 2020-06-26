package com.example.eventsapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

import com.google.firebase.firestore.FirebaseFirestore;

import java.util.HashMap;

public class CreateEvent extends AppCompatActivity {

    private Button createEventButton;
    private EditText eventName, location, time, details, tags;
    String eName, loc, t, det, tag;
    FirebaseFirestore db = FirebaseFirestore.getInstance();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_create_event);

        createEventButton = (Button) findViewById(R.id.event_creation_button);


        createEventButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                saveEvent();
                openActivity();
            }
        });



    }

    void saveEvent(){

        eventName = (EditText) findViewById(R.id.EventName_text);
        location = (EditText) findViewById(R.id.location_text);
        time = (EditText) findViewById(R.id.time_text);
        details = (EditText) findViewById(R.id.details_text);
        tags = (EditText) findViewById(R.id.Tags_text);

        eName = eventName.getText().toString();
        loc = location.getText().toString();
        t = time.getText().toString();
        det = details.getText().toString();
        tag = tags.getText().toString();

        HashMap<String, Object> events = new HashMap<>();
        events.put("Event name", eName);
        events.put("Location", loc);
        events.put("Time", t);
        events.put("Details", det);
        events.put("Tags", tag);

        db.collection("events").add(events);
    }

    void openActivity(){

        Intent intent = new Intent(this, MainFeed.class);
        startActivity(intent);
    }
}
