package com.example.palmdigital.chooseadventurev01;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class ToiletActivity extends AppCompatActivity implements View.OnClickListener
{

    // fields
    Button leftButton;
    Button rightButton;

    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_toilet);

        //refrences

        //textviews
        TextView textViewStory    = (TextView) findViewById(R.id.textViewStory);
        TextView textViewQuestion = (TextView) findViewById(R.id.textViewQuestion);

        //Buttons
        leftButton  = (Button) findViewById(R.id.buttonLeft);
        rightButton = (Button) findViewById(R.id.buttonRight);

        //set text
        //TextViews
        textViewStory.setText("As you pour the ooze into the toilet it " +
                "backs up, gurgles, and explodes, covering you in radioactive waste.");
        textViewQuestion.setText("Do you want to train to be a NINJA?  'Yes' or 'HECK YES'?");

        leftButton.setText("Yes");
        rightButton.setText("HECK YES");

        leftButton.setOnClickListener(this);
        rightButton.setOnClickListener(this);

    } // end of onCreate()

    public void onClick (View view)
    {
        if(view.getId() == R.id.buttonLeft)
        {
            // send to Yes activity
            Intent i = new Intent(this, YesActivity.class);
            startActivity(i);
        }
        else if(view.getId() == R.id.buttonRight)
        {
            // send to HECK YES activity
            Intent i = new Intent(this, HeckYesActivity.class);
            startActivity(i);
        }

    } // end of onClick()

}
