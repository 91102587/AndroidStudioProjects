package com.example.palmdigital.chooseadventurev01;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class ExploreActivity extends AppCompatActivity implements View.OnClickListener
{

    // fields
    Button leftButton;
    Button rightButton;

    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_explore);

        //refrences

        //textviews
        TextView textViewStory    = (TextView) findViewById(R.id.textViewStory);
        TextView textViewQuestion = (TextView) findViewById(R.id.textViewQuestion);

        //Buttons
        leftButton  = (Button) findViewById(R.id.buttonLeft);
        rightButton = (Button) findViewById(R.id.buttonRight);

        //set text
        //TextViews
        textViewStory.setText("You approach a glowing, " +
                "green bucket of ooze. Worried that you will get in trouble, " +
                "you pick up the bucket.");
        textViewQuestion.setText("Do you want to pour the ooze into the 'backyard' or 'toilet'?");

        leftButton.setText("Backyard");
        rightButton.setText("Toilet");

        leftButton.setOnClickListener(this);
        rightButton.setOnClickListener(this);

    } // end of onCreate()

    public void onClick (View view)
    {
        if(view.getId() == R.id.buttonLeft)
        {
            // send to backyard activity
            Intent i = new Intent(this, BackyardActivity.class);
            startActivity(i);
        }
        else if(view.getId() == R.id.buttonRight)
        {
            // send to toilet activity
            Intent i = new Intent(this, ToiletActivity.class);
            startActivity(i);
        }

    } // end of onClick()

}
