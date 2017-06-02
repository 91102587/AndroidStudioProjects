package com.example.palmdigital.addandswitchactivity01;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity implements View.OnClickListener
{

    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button buttonSwitch = (Button) findViewById(R.id.buttonSwitch);
        buttonSwitch.setOnClickListener(this);

    } // end of onCreate method

    public void onClick (View view)
    {
        // here's the screen-switching code
        Intent i = new Intent(this, WakeUp.class);
        startActivity(i);

    } // end of onClick method

} // end of class
