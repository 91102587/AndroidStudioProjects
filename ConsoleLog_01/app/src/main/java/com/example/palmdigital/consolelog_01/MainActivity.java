package com.example.palmdigital.consolelog_01;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;

public class MainActivity extends AppCompatActivity
{
    // fields - class level variables
    private int myInt;
    private double myDouble;
    private String myString;


    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        myInt = setIntValue();
        Log.i("info", "my int = " + myInt);

        double myDouble = setDoubleValue(); // myDouble should be set to 10.987
        Log.i("info", "myDouble " + myDouble);

        // declare a float variable called myFloat()
        // set it's value with a function you write setFloatValue()
        // have your function return the sum of two floats (4.5 + 2.3)
        // log myFloat out to Android Monitor logcat

        Boolean myBoolean = setBooleanValue();
        Log.i("info", "myBoolean " + myBoolean);

        Float myFloat = setFloatValue();
        Log.i("info", "myFloat " + myFloat);

    }

    public float setFloatValue()
    {
        return (4.5f + 2.3f);
    }

    public boolean setBooleanValue()
    {
        return true;
    }

    public double setDoubleValue()
    {
        return 10.987;
    }

    public int setIntValue()
    {
        return 10;
    }
}
