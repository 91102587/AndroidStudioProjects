package com.example.palmdigital.simplecalcv03;

import android.graphics.Color;
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
    int sum;
    int operator;

    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        ImageView topNum1 = (ImageView) findViewById(R.id.topNum1);
        ImageView topNum2 = (ImageView) findViewById(R.id.topNum2);
        ImageView topNum3 = (ImageView) findViewById(R.id.topNum3);
        ImageView topNum4 = (ImageView) findViewById(R.id.topNum4);
        ImageView topNum5 = (ImageView) findViewById(R.id.topNum5);
        ImageView topNum6 = (ImageView) findViewById(R.id.topNum6);
        ImageView topNum7 = (ImageView) findViewById(R.id.topNum7);
        ImageView topNum8 = (ImageView) findViewById(R.id.topNum8);
        ImageView topNum9 = (ImageView) findViewById(R.id.topNum9);
        ImageView topNum0 = (ImageView) findViewById(R.id.topNum0);

        ImageView bottomNum1 = (ImageView) findViewById(R.id.bottomNum1);
        ImageView bottomNum2 = (ImageView) findViewById(R.id.bottomNum2);
        ImageView bottomNum3 = (ImageView) findViewById(R.id.bottomNum3);
        ImageView bottomNum4 = (ImageView) findViewById(R.id.bottomNum4);
        ImageView bottomNum5 = (ImageView) findViewById(R.id.bottomNum5);
        ImageView bottomNum6 = (ImageView) findViewById(R.id.bottomNum6);
        ImageView bottomNum7 = (ImageView) findViewById(R.id.bottomNum7);
        ImageView bottomNum8 = (ImageView) findViewById(R.id.bottomNum8);
        ImageView bottomNum9 = (ImageView) findViewById(R.id.bottomNum9);
        ImageView bottomNum0 = (ImageView) findViewById(R.id.bottomNum0);


        textViewDisplayTop = (TextView) findViewById(R.id.textViewTop);
        textViewDisplayMiddle = (TextView) findViewById(R.id.textViewMiddle);
        textViewDisplayBottom = (TextView) findViewById(R.id.textViewBottom);

        topNum1.setOnClickListener(this);
        topNum2.setOnClickListener(this);
        topNum3.setOnClickListener(this);
        topNum4.setOnClickListener(this);
        topNum5.setOnClickListener(this);
        topNum6.setOnClickListener(this);
        topNum7.setOnClickListener(this);
        topNum8.setOnClickListener(this);
        topNum9.setOnClickListener(this);
        topNum0.setOnClickListener(this);

        bottomNum1.setOnClickListener(this);
        bottomNum2.setOnClickListener(this);
        bottomNum3.setOnClickListener(this);
        bottomNum4.setOnClickListener(this);
        bottomNum5.setOnClickListener(this);
        bottomNum6.setOnClickListener(this);
        bottomNum7.setOnClickListener(this);
        bottomNum8.setOnClickListener(this);
        bottomNum9.setOnClickListener(this);
        bottomNum0.setOnClickListener(this);


    }

    public void onClick (View view)
    {


        ImageView plus_sign = (ImageView) findViewById(R.id.plus_sign);
        ImageView minus_sign = (ImageView) findViewById(R.id.minus_sign);


        if (view.getId() == R.id.equal_sign)
    {
        if (operator == 1)
        {
            sum = num1 + num2;
        }
        if (operator == 2)
        {
            sum = num1 - num2;
        }
textViewDisplayBottom.setText(sum);
        }
        else if (view.getId() == R.id.topNum2)
        {
            textViewDisplayTop.setText("2");
            num1 = 1;
        }
        else if (view.getId() == R.id.topNum3)
        {
            textViewDisplayTop.setText("3");
            num1 = 1;
        }
        else if (view.getId() == R.id.topNum4)
        {
            textViewDisplayTop.setText("4");
            num1 = 1;
        }
        else if (view.getId() == R.id.topNum5)
        {
            textViewDisplayTop.setText("5");
            num1 = 1;
        }
        else if (view.getId() == R.id.topNum6)
        {
            textViewDisplayTop.setText("6");
            num1 = 1;
        }
        else if (view.getId() == R.id.topNum7)
        {
            textViewDisplayTop.setText("7");
            num1 = 1;
        }
        else if (view.getId() == R.id.topNum8)
        {
            textViewDisplayTop.setText("8");
            num1 = 1;
        }
        else if (view.getId() == R.id.topNum9)
        {
            textViewDisplayTop.setText("9");
            num1 = 1;
        }
        else if (view.getId() == R.id.topNum0)
        {
            textViewDisplayTop.setText("0");
            num1 = 1;
        }


        else if (view.getId() == R.id.bottomNum1)
        {
            textViewDisplayMiddle.setText("1");
            num2 = 2;
        }
        else if (view.getId() == R.id.bottomNum2)
        {
            textViewDisplayMiddle.setText("2");
            num2 = 2;
        }
        else if (view.getId() == R.id.bottomNum3)
        {
            textViewDisplayMiddle.setText("3");
            num2 = 2;
        }
        else if (view.getId() == R.id.bottomNum4)
        {
            textViewDisplayMiddle.setText("4");
            num2 = 2;
        }
        else if (view.getId() == R.id.bottomNum5)
        {
            textViewDisplayMiddle.setText("5");
            num2 = 2;
        }
        else if (view.getId() == R.id.bottomNum6)
        {
            textViewDisplayMiddle.setText("6");
            num2 = 2;
        }
        else if (view.getId() == R.id.bottomNum7)
        {
            textViewDisplayMiddle.setText("7");
            num2 = 2;
        }
        else if (view.getId() == R.id.bottomNum8)
        {
            textViewDisplayMiddle.setText("8");
            num2 = 2;
        }
        else if (view.getId() == R.id.bottomNum9)
        {
            textViewDisplayMiddle.setText("9");
            num2 = 2;
        }
        else if (view.getId() == R.id.bottomNum0)
        {
            textViewDisplayMiddle.setText("0");
            num2 = 2;
        }


        else if (view.getId() == R.id.plus_sign)
        {
            plus_sign.setBackgroundColor(Color.rgb(69, 255, 0));
            minus_sign.setBackgroundColor(Color.rgb(255, 255, 255));
            operator = 1;
        }
        else if (view.getId() == R.id.minus_sign)
        {
            minus_sign.setBackgroundColor(Color.rgb(69, 255, 0));
            plus_sign.setBackgroundColor(Color.rgb(255, 255, 255));
            operator = 2;
        }

    }

}
