package com.example.aprylianmaulana.healthycare;

import android.media.MediaPlayer;
import android.os.CountDownTimer;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class WOSidePlank extends AppCompatActivity {

    private TextView tv12;
    private Button startbtn12, ulangbtn12;

    private long Reminingtime = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_woside_plank);

        tv12         = (TextView) findViewById(R.id.tv12);
        startbtn12   = (Button) findViewById(R.id.startbtn12);
        ulangbtn12   = (Button) findViewById(R.id.ulangbtn12);


        startbtn12.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startbtn12.setEnabled(false);
                startbtn12.setVisibility(View.INVISIBLE);
                ulangbtn12.setVisibility(View.INVISIBLE);

                long millisInfuture = 31000; //30sec
                long countDownInterval = 1000; //1sec
                new CountDownTimer(millisInfuture, countDownInterval) {


                    @Override
                    public void onTick(long millisUntilFinished) {

                        tv12.setText("" + millisUntilFinished / 1000);
                        Reminingtime = millisUntilFinished;
                    }


                    @Override
                    public void onFinish() {

                        tv12.setText("Istirahat");
                        startbtn12.setEnabled(true);
                        ulangbtn12.setVisibility(View.VISIBLE);

                    }
                }.start();
            }
        });

        ulangbtn12.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                ulangbtn12.setEnabled(false);
                startbtn12.setVisibility(View.INVISIBLE);
                ulangbtn12.setVisibility(View.INVISIBLE);

                long millisInfuture = 31000; //30sec
                long countDownInterval = 1000; //1sec
                new CountDownTimer(millisInfuture, countDownInterval) {


                    @Override
                    public void onTick(long millisUntilFinished) {

                        tv12.setText("" + millisUntilFinished / 1000);
                        Reminingtime = millisUntilFinished;
                    }


                    @Override
                    public void onFinish() {

                        tv12.setText("Istirahat");
                        ulangbtn12.setEnabled(true);
                        ulangbtn12.setVisibility(View.VISIBLE);


                    }
                }.start();
            }
        });
    }
}
