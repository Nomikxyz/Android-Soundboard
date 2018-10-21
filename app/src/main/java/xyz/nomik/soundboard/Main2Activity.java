package xyz.nomik.soundboard;

import android.content.Intent;
import android.media.MediaPlayer;
import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;

public class Main2Activity extends AppCompatActivity {
    MediaPlayer mp, mp2, mp3, mp4, mp5;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);
        mp = MediaPlayer.create(this, R.raw.no9);
        mp2 = MediaPlayer.create(this, R.raw.no10);
        mp3 = MediaPlayer.create(this, R.raw.no11);
        mp4 = MediaPlayer.create(this, R.raw.no12);
        mp5 = MediaPlayer.create(this, R.raw.no13);
        Button button1 = this.findViewById(R.id.button);
        Button button2 = this.findViewById(R.id.button2);
        ImageButton ib3 = this.findViewById(R.id.imageButton3);
        ImageButton ib13 = this.findViewById(R.id.imageButton13);
        ImageButton ib4 = this.findViewById(R.id.imageButton4);
        ImageButton ib14 = this.findViewById(R.id.imageButton14);
        ImageButton ib5 = this.findViewById(R.id.imageButton5);

        ib3.setOnClickListener(new View.OnClickListener() { //this is objectively awful code. DO NOT COPY

            @Override
            public void onClick(View v) {

                mp.start();
            }
        });
        ib4.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {

                mp2.start();
            }
        });
        ib5.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {

                mp3.start();
            }
        });
        ib13.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {

                mp4.start();
            }
        });
        ib14.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {

                mp5.start();
            }
        });

        button1.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {

                Intent goToCredits = new Intent(getApplicationContext(), Credits.class);
                startActivity(goToCredits);
                finish();
            }
        });
        button2.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {

                Intent goToCredits = new Intent(getApplicationContext(), MainActivity.class);
                startActivity(goToCredits);
                finish();
            }
        });

    }

    }


