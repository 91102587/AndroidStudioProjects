package com.example.palmdigital.chooseadventurev01;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import static android.R.attr.button;

public class WakeUpActivity extends AppCompatActivity implements View.OnClickListener
{

    Button buttonStartOver;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_wake_up);

        TextView textViewStory    = (TextView) findViewById(R.id.textViewStory);
        textViewStory.setText("You wake up and have a boring day. The end.");

        buttonStartOver.setText("Star Over");

        buttonStartOver.setOnClickListener(this);
    }

    public void onClick(View view)
    {
        if (view.getId() == R.id.buttonStartOver)
        {
            Intent i = new Intent(this, MainActivity.class);
            startActivity(i);
        }
    }
}
