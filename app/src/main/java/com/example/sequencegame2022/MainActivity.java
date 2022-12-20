package com.example.sequencegame2022;

import androidx.appcompat.app.AppCompatActivity;

import android.media.Image;
import android.os.Bundle;
import android.view.animation.AlphaAnimation;
import android.widget.Button;
import android.hardware.Sensor;
import android.hardware.SensorEvent;
import android.hardware.SensorEventListener;
import android.hardware.SensorManager;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

ImageButton bRed,bBlue,bYellow,bGreen;


TextView tvx, tvy, tvz;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        bRed = findViewById(R.id.BTNred);
        bBlue = findViewById(R.id.BTNblue);
        bGreen = findViewById(R.id.BTNgreen);
        bYellow = findViewById(R.id.BTNyellow);

    }

    private void flashingButtons(ImageButton button)
    {
        anim = new AlphaAnimation(1, 0);
        anim.setDuration(flashDelay);

        anim.setRepeatCount(0);
        button.startAnimation(anim);
    }


}