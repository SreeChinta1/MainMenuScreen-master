package com.example.aravind25.myapp;

import android.content.Intent;
import android.media.MediaPlayer;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;

public class MainActivity extends AppCompatActivity {
MediaPlayer song, button;
    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        song = MediaPlayer.create(this, R.raw.song);
        button = MediaPlayer.create(this, R.raw.button);
        song.start();
        song.setLooping(true);
    }

    public void clickStart(View view)
    {
        startActivity(new Intent(MainActivity.this, SecondActivity.class));
        button.start();
        song.stop();
    }

    public void clickInstruct(View view)
    {
        startActivity(new Intent(MainActivity.this, ThirdActivity.class));
        button.start();
    }


}
