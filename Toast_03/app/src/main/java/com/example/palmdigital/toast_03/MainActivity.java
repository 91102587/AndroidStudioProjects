package com.example.palmdigital.toast_03;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Toast.makeText(MainActivity.this, "My name is Caylin.",
                Toast.LENGTH_SHORT).show();
        Toast.makeText(MainActivity.this, "Today is January 11, 2017",
                Toast.LENGTH_SHORT).show();
        Toast.makeText(MainActivity.this, "The time right now is 8:12 am",
                Toast.LENGTH_SHORT).show();


    }
}
