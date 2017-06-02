package org.palmdigital.madlibpuppyluv;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);



    }

    public void makeStory(View kevin)
    {
        //get all the references
        TextView result= (TextView)findViewById(R.id.textViewStoryLine);
        EditText first = (EditText)findViewById(R.id.editTextColor01);
        String eColor = first.getText().toString(); // error!!!!
        EditText second = (EditText)findViewById(R.id.editTextBodyParts01);
        String eBodyPart = second.getText().toString(); // error!!!!
        EditText third = (EditText)findViewById(R.id.editTextNouns01);
        String eNouns = third.getText().toString(); // error!!!!
        EditText fourth = (EditText)findViewById(R.id.editTextVerb01);
        String eVerb = fourth.getText().toString(); // error!!!!
        EditText fifth = (EditText)findViewById(R.id.editTextAdjective01);
        String eAdjective = fifth.getText().toString(); // error!!!!
        EditText sixth = (EditText)findViewById(R.id.editTextAdjective02);
        String eAdjective2 = sixth.getText().toString(); // error!!!!
        EditText seventh = (EditText)findViewById(R.id.editTextVerb02);
        String eVerb2 = seventh.getText().toString(); // error!!!!
        EditText eigth = (EditText)findViewById(R.id.editTextNoun02);
        String eNouns2 = eigth.getText().toString(); // error!!!!
        EditText ninth = (EditText)findViewById(R.id.editTextNoun03);
        String eNouns3 = ninth.getText().toString(); // error!!!!

        result.setText("Today I saw him again. When he looks at me with those " +eColor+ " eyes, "
                + "it makes my " +eBodyPart+ " go pitterpat, and I feel as if I have "
                +eNouns+ " in my stomach. When he scrunches his nose, " +
                "I want to " +eVerb+ " him softly. He is so " +eAdjective+ " and " +eAdjective2+ " . Tomorrow" +
                " he will be mine. For now he " +eVerb2+ " in the store " +eNouns2+ " looking" +
                " at me. " +eNouns3+ " love is hard to resist!!");

    }

}
