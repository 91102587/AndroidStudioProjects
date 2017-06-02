package org.palmdigital.buttonclicksv01;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity
{

    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //Button button = (Button)findViewById(R.id.button);


    }

    public void getName(View kevin)
    {
        Toast.makeText(this, "kevin!", Toast.LENGTH_SHORT).show();
    }
    public void testMethod(View skittleskevin)
    {
        Toast.makeText(this, "skittleskevin!", Toast.LENGTH_SHORT).show();
    }
    public void testMethodAgain(View skittleskevinpinkpantherfrom1989)
    {
        Toast.makeText(this, "skittleskevinpinkpantherfrom1989!", Toast.LENGTH_SHORT).show();
    }

}
