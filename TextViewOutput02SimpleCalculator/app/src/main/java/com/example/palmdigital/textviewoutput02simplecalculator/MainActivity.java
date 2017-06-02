package com.example.palmdigital.textviewoutput02simplecalculator;

import android.content.DialogInterface;
import android.graphics.Color;
import android.media.Image;
import android.net.Uri;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
// HI PEOPLE OF AFRICA AKA CAYLINNNNNNNNNNNNNNNNNNNNN AKA AFRICAN CHILD AKA AJANKRFNAGTEBJK D
import android.widget.TextView;

import com.google.android.gms.appindexing.Action;
import com.google.android.gms.appindexing.AppIndex;
import com.google.android.gms.appindexing.Thing;
import com.google.android.gms.common.api.GoogleApiClient;

import static com.example.palmdigital.textviewoutput02simplecalculator.R.drawable.equal_sign;
import static com.example.palmdigital.textviewoutput02simplecalculator.R.id.minus_sign;
import static com.example.palmdigital.textviewoutput02simplecalculator.R.id.plus_sign;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    TextView textViewDisplayTop;
    TextView textViewDisplayMiddle;
    TextView textViewDisplayBottom;
    int num1, num2;
    /**
     * ATTENTION: This was auto-generated to implement the App Indexing API.
     * See https://g.co/AppIndexing/AndroidStudio for more information.
     */
    private GoogleApiClient client;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        ImageView num1 = (ImageView) findViewById(R.id.num1);
        ImageView num2 = (ImageView) findViewById(R.id.num2);
        ImageView num3 = (ImageView) findViewById(R.id.num3);
        ImageView num4 = (ImageView) findViewById(R.id.num4);
        ImageView num5 = (ImageView) findViewById(R.id.num5);
        ImageView num6 = (ImageView) findViewById(R.id.num6);
        ImageView num7 = (ImageView) findViewById(R.id.num7);
        ImageView num8 = (ImageView) findViewById(R.id.num8);
        ImageView num9 = (ImageView) findViewById(R.id.num9);
        ImageView num0 = (ImageView) findViewById(R.id.num0);
        ImageView num01 = (ImageView) findViewById(R.id.num01);
        ImageView num02 = (ImageView) findViewById(R.id.num02);
        ImageView num03 = (ImageView) findViewById(R.id.num03);
        ImageView num04 = (ImageView) findViewById(R.id.num04);
        ImageView num05 = (ImageView) findViewById(R.id.num05);
        ImageView num06 = (ImageView) findViewById(R.id.num06);
        ImageView num07 = (ImageView) findViewById(R.id.num07);
        ImageView num08 = (ImageView) findViewById(R.id.num08);
        ImageView num09 = (ImageView) findViewById(R.id.num09);
        ImageView num00 = (ImageView) findViewById(R.id.num00);
        ImageView plus_sign = (ImageView) findViewById(R.id.plus_sign);
        ImageView minus_sign = (ImageView) findViewById(R.id.minus_sign);
        ImageView equal_sign = (ImageView) findViewById(R.id.equal_sign);

        textViewDisplayTop = (TextView) findViewById(R.id.textViewTop);
        textViewDisplayMiddle = (TextView) findViewById(R.id.textViewMiddle);
        textViewDisplayBottom = (TextView) findViewById(R.id.textViewBottom);

        num1.setOnClickListener(this);
        num2.setOnClickListener(this);
        num3.setOnClickListener(this);
        num4.setOnClickListener(this);
        num5.setOnClickListener(this);
        num6.setOnClickListener(this);
        num7.setOnClickListener(this);
        num8.setOnClickListener(this);
        num9.setOnClickListener(this);
        num0.setOnClickListener(this);
        num01.setOnClickListener(this);
        num02.setOnClickListener(this);
        num03.setOnClickListener(this);
        num04.setOnClickListener(this);
        num05.setOnClickListener(this);
        num06.setOnClickListener(this);
        num07.setOnClickListener(this);
        num08.setOnClickListener(this);
        num09.setOnClickListener(this);
        num00.setOnClickListener(this);
        plus_sign.setOnClickListener(this);
        minus_sign.setOnClickListener(this);
        equal_sign.setOnClickListener(this);


        // ATTENTION: This was auto-generated to implement the App Indexing API.
        // See https://g.co/AppIndexing/AndroidStudio for more information.
        client = new GoogleApiClient.Builder(this).addApi(AppIndex.API).build();
    }

    public void onClick(View view)

    {
        ImageView plus_sign = (ImageView) findViewById(R.id.plus_sign);
        ImageView minus_sign = (ImageView) findViewById(R.id.minus_sign);

        if (view.getId() == R.id.num1)
        {
            textViewDisplayTop.setText("1");
            num1 = 1;
        } else if (view.getId() == R.id.num2)
        {
            textViewDisplayTop.setText("2");
            num1 = 2;
        } else if (view.getId() == R.id.num3)
        {
            textViewDisplayTop.setText("3");
            num1 = 3;
        } else if (view.getId() == R.id.num4)
        {
            textViewDisplayTop.setText("4");
            num1 = 4;
        } else if (view.getId() == R.id.num5)
        {
            textViewDisplayTop.setText("5");
            num1 = 5;
        } else if (view.getId() == R.id.num6)
        {
            textViewDisplayTop.setText("6");
            num1 = 6;
        } else if (view.getId() == R.id.num7)
        {
            textViewDisplayTop.setText("7");
            num1 = 7;
        } else if (view.getId() == R.id.num8)
        {
            textViewDisplayTop.setText("8");
            num1 = 8;
        } else if (view.getId() == R.id.num9)
        {
            textViewDisplayTop.setText("9");
            num1 = 9;
        } else if (view.getId() == R.id.num0)
        {
            textViewDisplayTop.setText("0");
            num1 = 0;
        } else if (view.getId() == R.id.plus_sign)
        {
            int sum = num1 + num2;
            textViewDisplayBottom.setText("" + sum);
            plus_sign.setBackgroundColor(Color.rgb(69, 255, 0));
            minus_sign.setBackgroundColor(Color.rgb(255, 255, 255));

        } else if (view.getId() == R.id.minus_sign)
        {
            int difference = num1 - num2;
            textViewDisplayBottom.setText("" + difference);
            minus_sign.setBackgroundColor(Color.rgb(69, 255, 0));
            plus_sign.setBackgroundColor(Color.rgb(255, 255, 255));

        } else if (view.getId() == R.id.num01)
        {
            textViewDisplayMiddle.setText("1");
            num2 = 1;
        } else if (view.getId() == R.id.num02)
        {
            textViewDisplayMiddle.setText("2");
            num2 = 2;
        } else if (view.getId() == R.id.num03)
        {
            textViewDisplayMiddle.setText("3");
            num2 = 3;
        } else if (view.getId() == R.id.num04)
        {
            textViewDisplayMiddle.setText("4");
            num2 = 4;
        } else if (view.getId() == R.id.num05)
        {
            textViewDisplayMiddle.setText("5");
            num2 = 5;
        } else if (view.getId() == R.id.num06)
        {
            textViewDisplayMiddle.setText("6");
            num2 = 6;
        } else if (view.getId() == R.id.num07)
        {
            textViewDisplayMiddle.setText("7");
            num2 = 7;
        } else if (view.getId() == R.id.num08)
        {
            textViewDisplayMiddle.setText("8");
            num2 = 8;
        } else if (view.getId() == R.id.num09)
        {
            textViewDisplayMiddle.setText("9");
            num2 = 9;
        } else if (view.getId() == R.id.num00)
        {
            textViewDisplayMiddle.setText("0");
            num2 = 0;
        }


    }

    /**
     * ATTENTION: This was auto-generated to implement the App Indexing API.
     * See https://g.co/AppIndexing/AndroidStudio for more information.
     */




}
