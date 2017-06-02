package org.palmdigital.intents_putextra01;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

public class Main3Activity extends AppCompatActivity {

    String story;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main3);

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
                story = extras.getString("SECOND_STORY_SO_FAR");
            }
        }
        else
        {
            story = (String) savedInstanceState.getSerializable("SECOND_STORY_SO_FAR");
        }


       // textViewStory.setText(story);

    }

    public void next03(View poop)
    {
        EditText editTextVerb02 = (EditText)findViewById(R.id.editTextVerb02);
        EditText editTextNoun02 = (EditText)findViewById(R.id.editTextNoun02);
        EditText editTextNoun03 = (EditText)findViewById(R.id.editTextNoun03);

        String strVerb02 = editTextVerb02.getText().toString();
        String strNoun02 = editTextNoun02.getText().toString();
        String strNoun03 = editTextNoun03.getText().toString();

        story += "Tomorrow he will be mine. For now he " +strVerb02+ " in " +
                "the store " +strNoun02+ " looking at me. " +strNoun03+ " love is hard to resist! ";

        Intent i = new Intent(this, Main4Activity.class);
        i.putExtra("THIRD_STORY_SO_FAR", story);
        startActivity(i);
    }

}
