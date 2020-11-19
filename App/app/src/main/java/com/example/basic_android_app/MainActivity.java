package com.example.basic_android_app;

import androidx.appcompat.app.AppCompatActivity;

import android.media.MediaPlayer;
import android.os.Bundle;
import android.view.View;


public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void make_red(View view){
        setContentView(R.layout.activity_red);
        final MediaPlayer mp = MediaPlayer.create(this, R.raw.sound_booing_001);
        mp.start();
    }

    public void make_blue(View view){
        setContentView(R.layout.activity_blue);
        final MediaPlayer mp = MediaPlayer.create(this, R.raw.sound_booing_002);
        mp.start();
    }

    public void make_yellow(View view){
        setContentView(R.layout.activity_yellow);
        final MediaPlayer mp = MediaPlayer.create(this, R.raw.sound_booing_003);
        mp.start();
    }

    public void make_purple(View view){
        setContentView(R.layout.activity_purple);
        final MediaPlayer mp = MediaPlayer.create(this, R.raw.sound_booing_004);
        mp.start();
    }

    public void make_orange(View view){
        setContentView(R.layout.activity_orange);
        final MediaPlayer mp = MediaPlayer.create(this, R.raw.sound_booing_005);
        mp.start();
    }

    public void make_green(View view){
        setContentView(R.layout.activity_green);
        final MediaPlayer mp = MediaPlayer.create(this, R.raw.sound_booing_006);
        mp.start();
    }
}
