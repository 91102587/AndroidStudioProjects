package com.example.palmdigital.textviewoutput01;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import org.w3c.dom.Text;

public class MainActivity extends AppCompatActivity implements View.OnClickListener
{

    //fields
    TextView textViewDisplayTop;


    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        // create references for our UI imageView's
        ImageView imageView1 = (ImageView) findViewById(R.id.imageView1);
        ImageView imageView2 = (ImageView) findViewById(R.id.imageView2);
        ImageView imageView3 = (ImageView) findViewById(R.id.imageView3);
        ImageView imageView4 = (ImageView) findViewById(R.id.imageView4);
        ImageView imageView5 = (ImageView) findViewById(R.id.imageView5);
        ImageView imageView6 = (ImageView) findViewById(R.id.imageView6);

        textViewDisplayTop = (TextView) findViewById(R.id.textView);

        //setting the references to be click listeners
        imageView1.setOnClickListener(this);
        imageView2.setOnClickListener(this);
        imageView3.setOnClickListener(this);
        imageView4.setOnClickListener(this);
        imageView5.setOnClickListener(this);
        imageView6.setOnClickListener(this);

    }

    public void onClick(View view)
    {
        if (view.getId() == R.id.imageView1)
    {
        //Toast.makeText(MainActivity.this, "You clicked button 01", Toast.LENGTH_SHORT).show();
        textViewDisplayTop.setText("1");
    }
        else if (view.getId() == R.id.imageView2)
        {
            //Toast.makeText(MainActivity.this, "You clicked button 02", Toast.LENGTH_SHORT).show();
            textViewDisplayTop.setText("2");
        }
        else if (view.getId() == R.id.imageView3)
        {
            //Toast.makeText(MainActivity.this, "You clicked button 03", Toast.LENGTH_SHORT).show();
            textViewDisplayTop.setText("3");
        }
        else if (view.getId() == R.id.imageView4)
        {
            //Toast.makeText(MainActivity.this, "You clicked button 04", Toast.LENGTH_SHORT).show();
            textViewDisplayTop.setText("4");
        }
        else if (view.getId() == R.id.imageView5)
        {
            //Toast.makeText(MainActivity.this, "You clicked button 05", Toast.LENGTH_SHORT).show();
            textViewDisplayTop.setText("5");
        }
        else if (view.getId() == R.id.imageView6)
        {
            //Toast.makeText(MainActivity.this, "You clicked button 06", Toast.LENGTH_SHORT).show();
            textViewDisplayTop.setText("6");
        }

    }
}
