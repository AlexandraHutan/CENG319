package com.example.n01297262ceng319lab1;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

public class MainActivity extends AppCompatActivity {
    private disfragment fragment;
    String message;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        fragment = (disfragment)getSupportFragmentManager().findFragmentById(R.id.displayfragment);
        this.message ="Main Activity:\nonCreate executed\n";

        fragment.display(message);
    }

//    @Override
    protected void onStart() {
         super.onStart();
        this.message += "onStart executed";
        fragment.display(this.message);
    }
}