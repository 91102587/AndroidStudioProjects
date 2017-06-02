package com.example.palmdigital.buttonchallenge01;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity implements View.OnClickListener
{

    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button buttonObject1 = (Button) findViewById(R.id.button1);
        Button buttonObject2 = (Button) findViewById(R.id.button2);
        Button buttonObject3 = (Button) findViewById(R.id.button3);

        buttonObject1.setText("Contacts");
        buttonObject2.setText("Email");
        buttonObject3.setText("Messages");

        buttonObject1.setBackgroundColor(0xffff0000);
        buttonObject2.setBackgroundColor(0xff444444);
        buttonObject3.setBackgroundColor(0xff00ff00);

        buttonObject1.setOnClickListener(this);
        buttonObject2.setOnClickListener(this);
        buttonObject3.setOnClickListener(this);
    }

    public void onClick(View view)
    {

        if (view.getId() == R.id.button1)
        {
            Toast.makeText(MainActivity.this, "You selected Contacts!", Toast.LENGTH_SHORT).show();
            Log.i("info", "You selected Contacts!");

        }

        else if (view.getId() == R.id.button2)
        {
            Toast.makeText(MainActivity.this, "You selected Email!", Toast.LENGTH_SHORT).show();
            Log.i("info", "You selected Email!");
        }

        else if (view.getId() == R.id.button3)
        {
            Toast.makeText(MainActivity.this, "You selected Messages!", Toast.LENGTH_SHORT).show();
            Log.i("info", "You selected Messages!");
        }

    }
}
