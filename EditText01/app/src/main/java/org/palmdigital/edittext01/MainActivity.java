package org.palmdigital.edittext01;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity implements View.OnClickListener
{

    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button button = (Button) findViewById(R.id.firstNameButton);
        button.setOnClickListener(this);

        Button button1 = (Button)findViewById(R.id.lastNameButton);
        button.setOnClickListener(this);

        Button button2 = (Button)findViewById(R.id.fullNameButton);
    }

    public void onClick(View view)
    {
        TextView result= (TextView)findViewById(R.id.textViewResult);
        EditText first = (EditText)findViewById(R.id.editText);
        String fName = first.getText().toString(); // error!!!!

        result.setText("Your first name is: " + fName);

        TextView result2= (TextView)findViewById(R.id.textViewResult2);
        EditText last = (EditText)findViewById(R.id.editTextv02);
        String lName = last.getText().toString(); // error!!!!

        result.setText("Your last name is: " + lName);



    }

}
