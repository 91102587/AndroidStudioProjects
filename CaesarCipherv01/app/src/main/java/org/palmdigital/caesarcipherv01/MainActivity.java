package org.palmdigital.caesarcipherv01;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity
{

    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);




    } // end of main

    public String encrypt(View view)
    {
        int shift;
        // get the input from user
        EditText editTextMessage = (EditText) (findViewById(R.id.editTextMessage));
        String stringMessage = editTextMessage.getText().toString();

        // get the shift from user
        EditText editTextShift = (EditText) (findViewById(R.id.editTextShift));
        String stringShift = editTextShift.getText().toString();
        if (stringShift.isEmpty())
        {
            shift = 0;
        }
        else
        {
            shift = Integer.parseInt(stringShift);
        }


        int size = 26;
        char[] alphabet = new char[size];
        alphabet[0] = 'A';
        alphabet[1] = 'B';
        alphabet[2] = 'C';
        alphabet[3] = 'D';
        alphabet[4] = 'E';
        alphabet[5] = 'F';
        alphabet[6] = 'G';
        alphabet[7] = 'H';
        alphabet[8] = 'I';
        alphabet[9] = 'J';
        alphabet[10] = 'K';
        alphabet[11] = 'L';
        alphabet[12] = 'M';
        alphabet[13] = 'N';
        alphabet[14] = 'O';
        alphabet[15] = 'P';
        alphabet[16] = 'Q';
        alphabet[17] = 'R';
        alphabet[18] = 'S';
        alphabet[19] = 'T';
        alphabet[20] = 'U';
        alphabet[21] = 'V';
        alphabet[22] = 'W';
        alphabet[23] = 'X';
        alphabet[24] = 'Y';
        alphabet[25] = 'Z';
        // int shift = 1;
        int shiftCharIndex;
        int fixedCharIndex;
        String output = "";
        String toUpperCase = stringMessage.toUpperCase();
        String toUpperCase1 = stringShift.toUpperCase();
        stringMessage = stringMessage.toUpperCase();
        for (int i = 0; i < stringMessage.length(); i++)
        {
            for (int j = 0; j < alphabet.length; j++)
            {
                if (toUpperCase.charAt(i) == alphabet[j])
                {
                    shiftCharIndex = j + shift;
                    fixedCharIndex = shiftCharIndex % 26; // now this can only be  0 through 25
                    output = output + alphabet[fixedCharIndex];
                } // end of if statement
            } // end of inner loop
            if (stringMessage.charAt(i) == ' ')
            {
                output += " ";
            }
        } // end of outer for loop
        TextView textViewEM = (TextView) (findViewById(R.id.textViewEM));
        textViewEM.setText("Encrypted Message:  " + output);

        TextView textViewDM = (TextView) (findViewById(R.id.textViewDM));
        textViewDM.setText("Decrypted Message:  " + stringMessage);

        return stringMessage;

    } // end of Encrypt onClick



}

