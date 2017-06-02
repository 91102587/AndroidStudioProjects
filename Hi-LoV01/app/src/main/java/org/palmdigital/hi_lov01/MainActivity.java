package org.palmdigital.hi_lov01;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import java.util.Random;

public class MainActivity extends AppCompatActivity
{

//    int max = 10;
//    int min = 1;
    //Random rn = new Random();
//    int range = 1, 10;

    int answer = 7;
    int guess;

    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    } // end of onCreate

    public void onClick(View view)
    {

        EditText editText = (EditText) findViewById(R.id.editText);
        String poop = editText.getText().toString();

        if (guess == answer)
        {
            TextView textViewHiOrLo = (TextView) (findViewById(R.id.textViewHiOrLo));
            textViewHiOrLo.setText("You won the game!");
            System.exit(0);
        }
        if (guess > answer)
        {
            TextView textViewEM = (TextView) (findViewById(R.id.textViewHiOrLo));
            textViewEM.setText("Your guess is too high, try again.");
            onRestart();
        }
        if (guess < answer)
        {
            TextView textViewLo = (TextView) (findViewById(R.id.textViewHiOrLo));
            textViewLo.setText("Your guess was too low, try again.");
            onRestart();
        }

        Button buttonng = (Button) findViewById(R.id.buttonNG);
        buttonng.setOnClickListener(this);
    } // end of onClick

} // end of Main
