package org.palmdigital.intents_putextra01;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

import org.w3c.dom.Text;

public class Main2Activity extends AppCompatActivity
{


    // fields
    String story;

    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);

        // references
       // TextView textViewStory = (TextView)findViewById(R.id.textViewStory);

        if (savedInstanceState == null)
        {
            Bundle extras = getIntent().getExtras();
            if(extras == null)
            {
                story = null;
            }
            else
            {
                story = extras.getString("FIRST_STORY_SO_FAR");
            }
        }
        else
        {
            story = (String) savedInstanceState.getSerializable("FIRST_STORY_SO_FAR");
        }


      //  textViewStory.setText(story);

    }

    public void next02(View view)
    {
        EditText editTextVerb01 = (EditText)findViewById(R.id.editTextVerb01);
        EditText editTextAdj01 = (EditText)findViewById(R.id.editTextAdj01);
        EditText editTextAdj02 = (EditText)findViewById(R.id.editTextAdj02);

        String strVerb01 = editTextVerb01.getText().toString();
        String strAdj01 = editTextAdj01.getText().toString();
        String strAdj02 = editTextAdj02.getText().toString();

        story += "When he scrunches his nose I want to " +strVerb01+ " him softly. " +
                "He is so " +strAdj01+ " and " +strAdj02+ ". ";

        Intent i = new Intent(this, Main3Activity.class);
        i.putExtra("SECOND_STORY_SO_FAR", story);

        startActivity(i);

    }

}
