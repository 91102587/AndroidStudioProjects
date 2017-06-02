package com.example.palmdigital.chooseadventurev01;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class BackyardActivity extends AppCompatActivity implements View.OnClickListener
{

    // fields
    Button leftButton;
    Button rightButton;

    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_backyard);

        //refrences

        //textviews
        TextView textViewStory    = (TextView) findViewById(R.id.textViewStory);
        TextView textViewQuestion = (TextView) findViewById(R.id.textViewQuestion);

        //Buttons
        leftButton  = (Button) findViewById(R.id.buttonLeft);
        rightButton = (Button) findViewById(R.id.buttonRight);

        //set text
        //TextViews
        textViewStory.setText("As you walk into the backyard a net scoops " +
                "you up and a giant takes you to a boiling pot of water.");
        textViewQuestion.setText("As the man starts to prepare you as soup, do you..." +
                "'Scream' or 'Faint'?");

        leftButton.setText("Scream");
        rightButton.setText("Faint");

        leftButton.setOnClickListener(this);
        rightButton.setOnClickListener(this);

    } // end of onCreate()

    public void onClick (View view)
    {
        if(view.getId() == R.id.buttonLeft)
        {
            // send to scream activity
            Intent i = new Intent(this, ScreamActivity.class);
            startActivity(i);
        }
        else if(view.getId() == R.id.buttonRight)
        {
            // send to faint activity
            Intent i = new Intent(this, FaintActivity.class);
            startActivity(i);
        }

    } // end of onClick()

}
