package com.example.palmdigital.button02;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity implements View.OnClickListener
{

    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button buttonObject1 = (Button)findViewById(R.id.buttonMyButton1);
        buttonObject1.setOnClickListener(this);
    } // end of onCreate class

    public void onClick(View view)
    {
        Log.i("info", "DONUT TOUCH MY BUTTON SIR!!!!!");
        Toast.makeText(MainActivity.this, "DON'T TOUCH!!! PROPERTY OF SKITTLE SQUAD!!!!!", Toast.LENGTH_SHORT).show();
    }
} // end of MainActivity class
