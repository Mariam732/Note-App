package com.example.noteapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import android.widget.ImageView;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    TextView  text;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        //Inflate views
        text = findViewById(R.id.text_tv);
   new Handler().postDelayed(new Runnable() {
       @Override
       public void run() {
           Intent i = new Intent(MainActivity.this, Home.class);

           startActivity(i);
           // close this activity
           finish();
   }
    },7*1000);  // wait for 7 seconds
}}