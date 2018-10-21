package xyz.nomik.soundboard;

import android.content.Context;
import android.content.Intent;
import android.media.MediaPlayer;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;
public class MainActivity extends AppCompatActivity {
    MediaPlayer mp, mp2, mp3, mp4, mp5, mp6, mp7, mp8;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

            setContentView(R.layout.activity_main);
            Context context = getApplicationContext();
            String testURL = "https://duckduckgo.com"; //if you want a kill switch in your app then you can insert one in here
            killSwitch switchTest = new killSwitch(this);
            switchTest.execute(testURL);



        mp = MediaPlayer.create(this, R.raw.no1);
        mp2 = MediaPlayer.create(this, R.raw.no2);
        mp3 = MediaPlayer.create(this, R.raw.no3);
        mp4 = MediaPlayer.create(this, R.raw.no4);
        mp5 = MediaPlayer.create(this, R.raw.no5);
        mp6 = MediaPlayer.create(this, R.raw.no6);
        mp7 = MediaPlayer.create(this, R.raw.no7);
        mp8 = MediaPlayer.create(this, R.raw.no8);
        Button button1 = this.findViewById(R.id.button);
        Button button2 = this.findViewById(R.id.button2);
        ImageButton ib3 = this.findViewById(R.id.imageButton3);
        ImageButton ib13 = this.findViewById(R.id.imageButton13);
        ImageButton ib4 = this.findViewById(R.id.imageButton4);
        ImageButton ib14 = this.findViewById(R.id.imageButton14);
        ImageButton ib15 = this.findViewById(R.id.imageButton15);
        ImageButton ib16 = this.findViewById(R.id.imageButton16);
        ImageButton ib17 = this.findViewById(R.id.imageButton17);
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
        ib15.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {

                mp6.start();
            }
        });
        ib16.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {

                mp7.start();
            }
        });
        ib17.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {

                mp8.start();
            }
        });
        ib15.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {

                mp6.start();
            }
        });
        ib16.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {

                mp7.start();
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

                Intent goToCredits = new Intent(getApplicationContext(), Main2Activity.class);
                startActivity(goToCredits);
                finish();
            }
        });

    }

}