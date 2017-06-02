package org.palmdigital.intents_putextra01;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity
{

    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void next01(View view)
    {
        // references
        EditText editTextColor01 = (EditText)findViewById(R.id.editTextColor01);
        EditText editTextBodyPart01 = (EditText)findViewById(R.id.editTextBodyPart01);
        EditText editTextNouns01 = (EditText)findViewById(R.id.editTextNouns01);

        String strColor01 = editTextColor01.getText().toString();
        String strBodyPart01 = editTextBodyPart01.getText().toString();
        String strNouns01 = editTextNouns01.getText().toString();

        String story = "Today I saw him again. When he looks at me with those " +strColor01+ " eyes, it makes my " +strBodyPart01+ " go " +
                "pitterpat, and I feel as if I have " +strNouns01+ " in my stomach. ";

        Intent i = new Intent(this, Main2Activity.class);
        i.putExtra("FIRST_STORY_SO_FAR", story);

        startActivity(i);
    }

}
