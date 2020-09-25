package com.example.n01297262ceng319lab1;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.os.Bundle;
import android.widget.RelativeLayout;
import android.widget.TextView;
import android.widget.Toast;

import org.w3c.dom.Text;

public class aiactivity extends AppCompatActivity {
    String message;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_aiactivity);
        RelativeLayout relativeLayout = (RelativeLayout)findViewById(R.id.idai);
        TextView textView = new TextView(this);
        textView.setText("\n\nonCreate executed\n");
        relativeLayout.addView(textView);
        Toast.makeText(this, "OnCreate triggered",  Toast.LENGTH_SHORT).show();

    }
    protected void onStart()
    {
        super.onStart();
        RelativeLayout relativeLayout = (RelativeLayout)findViewById(R.id.idai);
        TextView textView = new TextView(this);
        textView.setText("AIActivity:\nonStart executed\n");

        relativeLayout.addView(textView);
        Toast.makeText(this, "OnStart triggered",  Toast.LENGTH_SHORT).show();
    }

    @Override
    protected void onStop() {
        super.onStop();
        RelativeLayout relativeLayout = (RelativeLayout)findViewById(R.id.idai);
        TextView textView = new TextView(this);
        textView.setText("onStop executed\n");
        Toast.makeText(this, "OnStop triggered",  Toast.LENGTH_SHORT).show();
        relativeLayout.addView(textView);
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();

        RelativeLayout relativeLayout = (RelativeLayout)findViewById(R.id.idai);
        TextView textView = new TextView(this);
        textView.setText("onDestroy executed\n");
        Toast.makeText(this, "OnDestroy triggered",  Toast.LENGTH_SHORT).show();
        relativeLayout.addView(textView);
    }
}