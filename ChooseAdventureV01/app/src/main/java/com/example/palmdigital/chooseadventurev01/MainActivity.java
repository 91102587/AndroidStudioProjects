package com.example.palmdigital.chooseadventurev01;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import org.w3c.dom.Text;

public class MainActivity extends AppCompatActivity implements View.OnClickListener
{

    // fields
    Button leftButton;
    Button rightButton;

    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //refrences

        //textviews
        TextView textViewStory    = (TextView) findViewById(R.id.textViewStory);
        TextView textViewQuestion = (TextView) findViewById(R.id.textViewQuestion);

        //Buttons
        leftButton  = (Button) findViewById(R.id.buttonLeft);
        rightButton = (Button) findViewById(R.id.buttonRight);

        //set text
        //TextViews
        textViewStory.setText("One morning the Tortoise woke up in a dream.");
        textViewQuestion.setText("Do you want to 'wake up' or 'explore' the dream?");

        leftButton.setText("Wake Up");
        rightButton.setText("Explore");

        leftButton.setOnClickListener(this);
        rightButton.setOnClickListener(this);

    } // end of onCreate()

    public void onClick (View view)
    {
        if(view.getId() == R.id.buttonLeft)
    {

        // send to wake up activity
        Intent i = new Intent(this,WakeUpActivity2.class);
        startActivity(i);

    }
       else if(view.getId() == R.id.buttonRight)
        {
            // send to explore activity
            Intent i = new Intent(this,ExploreActivity.class);
            startActivity(i);
        }

    } // end of onClick()

} // end of MainActivity
