package com.example.palmdigital.chooseadventurev01;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class YesActivity extends AppCompatActivity implements View.OnClickListener
{

    // fields
    Button leftButton;

    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_yes);

        //refrences

        //textviews
        TextView textViewStory    = (TextView) findViewById(R.id.textViewStory);
        TextView textViewQuestion = (TextView) findViewById(R.id.textViewQuestion);

        //Buttons
        leftButton  = (Button) findViewById(R.id.buttonLeft);

        //set text
        //TextViews
        textViewStory.setText("Awesome dude!  You live out the rest of your" +
                " life fighting crimes and eating pizza!");
        textViewQuestion.setText("Do you want to Start Over?");

        leftButton.setText("Yes");

        leftButton.setOnClickListener(this);

    } // end of onCreate()

    public void onClick (View view)
    {
        if(view.getId() == R.id.buttonLeft)
        {
            // send to Yes activity
            Intent i = new Intent(this, MainActivity.class);
            startActivity(i);
        }


    } // end of onClick()

}
