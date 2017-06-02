package com.example.palmdigital.textviewoutputredo;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity implements View.OnClickListener
{

    TextView textViewDisplayTop;
    TextView textViewDisplayMiddle;
    TextView textViewDisplayBottom;

    int num1, num2;
    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        ImageView imageView1 = (ImageView) findViewById(R.id.imageView1);
        ImageView imageView2 = (ImageView) findViewById(R.id.imageView2);
        ImageView imageView3 = (ImageView) findViewById(R.id.imageView3);
        ImageView imageView4 = (ImageView) findViewById(R.id.imageView4);
        ImageView imageView5 = (ImageView) findViewById(R.id.imageView5);
        ImageView imageView6 = (ImageView) findViewById(R.id.imageView6);
        ImageView equal_sign = (ImageView) findViewById(R.id.equal_sign);


        textViewDisplayTop = (TextView) findViewById(R.id.textViewTop);
        textViewDisplayMiddle = (TextView) findViewById(R.id.textViewMiddle);
        textViewDisplayBottom = (TextView) findViewById(R.id.textViewBottom);


        imageView1.setOnClickListener(this);
        imageView2.setOnClickListener(this);
        imageView3.setOnClickListener(this);
        imageView4.setOnClickListener(this);
        imageView5.setOnClickListener(this);
        imageView6.setOnClickListener(this);
        equal_sign.setOnClickListener(this);



    }

    public void onClick(View view)
    {
        if (view.getId() == R.id.imageView1)
        {
            //Toast.makeText(MainActivity.this, "You clicked button 01", Toast.LENGTH_SHORT).show();
            textViewDisplayTop.setText("1");
            num1 = 1;
        }
        else if (view.getId() == R.id.imageView2)
        {
            textViewDisplayTop.setText("2");
            num1 = 2;
        }
        else if (view.getId() == R.id.imageView3)
        {
            textViewDisplayTop.setText("3");
            num1 = 3;
        }
        else if (view.getId() == R.id.imageView4)
        {
            textViewDisplayMiddle.setText("4");
            num2 = 4;
        }
        else if (view.getId() == R.id.imageView5)
        {
            textViewDisplayMiddle.setText("5");
            num2 = 5;
        }
        else if (view.getId() == R.id.imageView6)
        {
            textViewDisplayMiddle.setText("6");
            num2 = 6;
        }
        else if (view.getId() == R.id.equal_sign)
        {
            int sum = num1 + num2;
            textViewDisplayBottom.setText("" + sum);
        }

    }
}
