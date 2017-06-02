package org.palmdigital.intents_putextra01;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

public class Main4Activity extends AppCompatActivity {


    String story;
    TextView textViewStory;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main4);

        textViewStory = (TextView)findViewById(R.id.textViewStory);

        if (savedInstanceState == null)
        {
            Bundle extras = getIntent().getExtras();
            if(extras == null)
            {
                story = null;
            }
            else
            {
                story = extras.getString("THIRD_STORY_SO_FAR");
            }
        }
        else
        {
            story = (String) savedInstanceState.getSerializable("THIRD_STORY_SO_FAR");
        }

        textViewStory.setText(story);
        story += "The End.";

    }

    //public void next04(View view)
//    {
//
//        EditText editTextEndCredits01 = (EditText)findViewById(R.id.editTextEndCredits);
//
//        String strEndCredits01 = editTextEndCredits01.getText().toString();
//
//
//
//
//    }

}
