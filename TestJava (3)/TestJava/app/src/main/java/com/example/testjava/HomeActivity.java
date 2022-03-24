package com.example.testjava;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;

public class HomeActivity extends AppCompatActivity {
    ImageButton btnsearch, btnhistory;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home);
        //btnsearch = (Button) findViewById(R.id.btnsearch);
        //btnhistory = (Button) findViewById(R.id.btnhistory);

        btnsearch = (ImageButton) findViewById(R.id.imageButton2);
        btnhistory = (ImageButton) findViewById(R.id.imageButton4);
        btnsearch.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent  = new Intent(getApplicationContext(), SearchFlight.class);
                startActivity(intent);
            }
        });
        btnhistory.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent  = new Intent(getApplicationContext(), ViewFlights.class);
                startActivity(intent);
            }
        });
    }
}
