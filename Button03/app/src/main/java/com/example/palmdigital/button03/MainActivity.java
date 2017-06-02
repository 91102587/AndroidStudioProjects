package com.example.palmdigital.button03;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

import static android.R.color.holo_purple;

public class MainActivity extends AppCompatActivity implements View.OnClickListener
{

    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button buttonObject1 = (Button) findViewById(R.id.buttonMyButton01);
        buttonObject1.setText("The Blue Pill");

        buttonObject1.setOnClickListener(this);
        buttonObject1.setBackgroundColor(0xff0000ff);

        Button buttonObject2 = (Button) findViewById(R.id.buttonMyButton02);
        buttonObject2.setText("The Red Pill");

        buttonObject2.setOnClickListener(this);
        buttonObject2.setBackgroundColor(0xffff0000);
    }

    public void onClick(View view)
    {
        Log.i("info", "DONUT TOUCH MY BUTTON SIR!!!!!");

        if (view.getId() == R.id.buttonMyButton01)
        {
            Toast.makeText(MainActivity.this, "You took the Blue Pill", Toast.LENGTH_SHORT).show();
        }

        else if (view.getId() == R.id.buttonMyButton02)
        {
            Toast.makeText(MainActivity.this, "You took the Red Pill", Toast.LENGTH_SHORT).show();
        }

    }
    public void onClick2(View view2)
    {
        Log.i("info", "DONUT TOUCH MY BUTTON SIR!!!!!");

    }
}
