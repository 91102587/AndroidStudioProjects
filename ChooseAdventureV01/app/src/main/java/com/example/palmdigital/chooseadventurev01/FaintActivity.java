package com.example.palmdigital.chooseadventurev01;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class FaintActivity extends AppCompatActivity implements View.OnClickListener
{

    // fields
    Button leftButton;

    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_faint);

        //refrences

        //textviews
        TextView textViewStory    = (TextView) findViewById(R.id.textViewStory);
        TextView textViewQuestion = (TextView) findViewById(R.id.textViewQuestion);

        //Buttons
        leftButton  = (Button) findViewById(R.id.buttonLeft);

        //set text
        //TextViews
        textViewStory.setText("You made a delicious soup! Yum! The end.");
        textViewQuestion.setText("Do you want to start over?");

        leftButton.setText("Start Over.");

        leftButton.setOnClickListener(this);

    } // end of onCreate()

    public void onClick (View view)
    {
        if(view.getId() == R.id.buttonLeft)
        {
            // send to Main activity
            Intent i = new Intent(this, MainActivity.class);
            startActivity(i);
        }

    } // end of onClick()

}
