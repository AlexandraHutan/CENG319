package com.example.n01297262ceng319lab1;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.RelativeLayout;
import android.widget.TextView;
import android.widget.Toast;

public class vractivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_vractivity);
        RelativeLayout relativeLayout = (RelativeLayout)findViewById(R.id.idvr);
        TextView textView = new TextView(this);
        textView.setText(getString(R.string.onCreate_executed)+ "\n");
        relativeLayout.addView(textView);
        Toast.makeText(this, "OnStop triggered",  Toast.LENGTH_SHORT).show();
    }

    protected void onStart()
    {
        super.onStart();
        RelativeLayout relativeLayout = (RelativeLayout)findViewById(R.id.idvr);
        TextView textView = new TextView(this);
        textView.setText(getString(R.string.VRActivity) + "\n" + getString(R.string.onStart_executed)+ "\n");

        relativeLayout.addView(textView);
        Toast.makeText(this, "OnStart triggered",  Toast.LENGTH_SHORT).show();
    }
  @Override
    protected void onStop() {
        super.onStop();
        RelativeLayout relativeLayout = (RelativeLayout)findViewById(R.id.idvr);
        TextView textView = new TextView(this);
        textView.setText(getString(R.string.onStop_executed)+ "\n");
        Toast.makeText(this, "OnStop triggered",  Toast.LENGTH_SHORT).show();
        relativeLayout.addView(textView);
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();

        RelativeLayout relativeLayout = (RelativeLayout)findViewById(R.id.idvr);
        TextView textView = new TextView(this);
        textView.setText(getString(R.string.onDestroy_executed));
        Toast.makeText(this, "OnDestroy triggered",  Toast.LENGTH_SHORT).show();
        relativeLayout.addView(textView);
    }
}