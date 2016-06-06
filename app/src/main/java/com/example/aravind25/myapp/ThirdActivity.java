package com.example.aravind25.myapp;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.TextView;

public class ThirdActivity extends AppCompatActivity {
    TextView text;//TextView is basically a label
    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_third);
        text = (TextView) findViewById(R.id.textView2);//asigns the text variable to the TextView on the screen
        text.setText("The objective of the game is to survive the longest without crashing 3 times.\n\n" +
                     "Crashing into another car causes the you to lose 1" +
                     "life and once you reach 0 lives, the game is over.\n\n" +
                     "Throughout the game, a timer will be displayed in the top middle of the screen " +
                     "indicating how long you have survived without losing 3 lives\n\n" +
                     "You can change lanes by swiping the screen in " +
                     "the desired direction.");
        // \n\n is used to create a space between each rule
    }



}
