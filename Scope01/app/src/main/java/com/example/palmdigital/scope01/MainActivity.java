package com.example.palmdigital.scope01;

import android.media.Image;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

import org.w3c.dom.Text;

// we are outside the MainActivity class
// we are outside any methods

// understanding how scope works is very important!!


public class MainActivity extends AppCompatActivity
{
 // in the MainActivity class, but I'm outside any methods

    // fields - these variables have classwide scope (any code in the class can see
    //      and use these variables)

    String myString;
    // declare a field that is a double named enemyHealth
    Double myDouble;
    int myInt3;
    TextView myTextView;
    ImageView myImageView;
    Button myButton;


    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        // here we are inside the onCreate method, which is inside the
        // MainActivity class

        // when we 'declare' or 'define' a variable, we use the following format
        // data Type variableName; <----- this is a variable declaration/definition
        // Some examples:
        int myInt; // <-- this is declaring a variable dataType 'int' and named 'myInt'
        double myDouble; // <---- this is declaring a variable of dataType 'double' named 'myDouble'
        TextView textView_story; // <-- this is declaring a varible of dataType 'TextView' named 'textView_story'
        ImageView imageView_ex; // <-- this is declaring a varible of dataType 'ImageView' named 'imageView_ex'


        // assigning a value to a declared variable
        // after declaring a variable we can assign a value to it
        // variableName = someValueOfTheSameDataTypeAsTheSameVariable;
        // Some examples:
        myInt = 10; // <--- setting the value of myInt to 10, myInt has dataType 'int' & 10 is an int
        myDouble = 20.12; // <-- myDouble gets 20.12 (myDouble gets the value of 20.12)
        textView_story = (TextView) findViewById(R.id.textView_st); // <--- set the value
                        //of textView_story to the UI element (R.id.textView_st)
        imageView_ex = (ImageView) findViewById(R.id.andriodGuy);

        // you know you can declare and assign in the same step
        // dataType variable name = someValueOfTheSameDataTypeAsTheSameVariable;
        // Some Examples:
        int myInt2 = 25; // <----- this is a declaration and an assignment
        myInt2 = 50; // <-- this is only an assignment
        // what is the difference??   the dataType!!!!!!!! 'int'
        myString = "this is a string"; // <-- this is a declaration and an assignment
        myString = "this is another string"; // <-- this is just an assignment
        // !!!!!!!!!!!!!!!!!!!! wherever you declare a variable determines that variable's scope!!
        // in other words, if I declare a variable here in the onCreate() method, only
        // nothing outside of onCreate can see it... let's prove this...

        myDouble = 100.10;

    } // end of onCreate method

    public void myAwesomeMethod01()
    {
        myString = "what's going on here...";
        myDouble = 80.08;
        myInt3 = 10;
        myButton = (Button) findViewById(R.id.myButton);
        myTextView = (TextView) findViewById(R.id.textView_st);
        myImageView = (ImageView) findViewById(R.id.andriodGuy);
    } // this is the end of myAwesomeMethod01

    public void myAwesomeMethod02()
    {
        myString = "what's going on here...";
        myDouble = 60.06;
        myInt3 = 8;
        myButton = (Button) findViewById(R.id.myButton);
        myTextView = (TextView) findViewById(R.id.textView_st);
        myImageView = (ImageView) findViewById(R.id.andriodGuy);
    } // this is the end of myAwesomeMethod02
    public void myAwesomeMethod03()
    {
        myString = "what's going on here...";
        myDouble = 40.04;
        myInt3 = 6;
        myButton = (Button) findViewById(R.id.myButton);
        myTextView = (TextView) findViewById(R.id.textView_st);
        myImageView = (ImageView) findViewById(R.id.andriodGuy);
    } // this is the end of myAwesomeMethod03

    public void myAwesomeMethod04()
    {
        myString = "what's going on here...";
        myDouble = 20.02;
        myInt3 = 4;
        myButton = (Button) findViewById(R.id.myButton);
        myTextView = (TextView) findViewById(R.id.textView_st);
        myImageView = (ImageView) findViewById(R.id.andriodGuy);
    } // this is the end of myAwesomeMethod04
    public void myAwesomeMethod05()
    {
        myString = "what's going on here...";
        myDouble = 10.01;
        myInt3 = 2;
        myButton = (Button) findViewById(R.id.myButton);
        myTextView = (TextView) findViewById(R.id.textView_st);
        myImageView = (ImageView) findViewById(R.id.andriodGuy);

    } // this is the end of myAwesomeMethod05



} // end of class

// do not do stuff out here!!!!
