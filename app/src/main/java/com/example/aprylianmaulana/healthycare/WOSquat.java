package com.example.aprylianmaulana.healthycare;

import android.os.CountDownTimer;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class WOSquat extends AppCompatActivity {

    private TextView tv6;
    private Button startbtn6, ulangbtn6;

    private long Reminingtime = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_wosquat);

        tv6         = (TextView) findViewById(R.id.tv6);
        startbtn6   = (Button) findViewById(R.id.startbtn6);
        ulangbtn6   = (Button) findViewById(R.id.ulangbtn6);


        startbtn6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startbtn6.setEnabled(false);
                startbtn6.setVisibility(View.INVISIBLE);
                ulangbtn6.setVisibility(View.INVISIBLE);

                long millisInfuture = 31000; //30sec
                long countDownInterval = 1000; //1sec
                new CountDownTimer(millisInfuture, countDownInterval) {


                    @Override
                    public void onTick(long millisUntilFinished) {

                        tv6.setText("" + millisUntilFinished / 1000);
                        Reminingtime = millisUntilFinished;
                    }


                    @Override
                    public void onFinish() {

                        tv6.setText("Istirahat");
                        startbtn6.setEnabled(true);
                        ulangbtn6.setVisibility(View.VISIBLE);

                    }
                }.start();
            }
        });

        ulangbtn6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                ulangbtn6.setEnabled(false);
                startbtn6.setVisibility(View.INVISIBLE);
                ulangbtn6.setVisibility(View.INVISIBLE);

                long millisInfuture = 31000; //30sec
                long countDownInterval = 1000; //1sec
                new CountDownTimer(millisInfuture, countDownInterval) {


                    @Override
                    public void onTick(long millisUntilFinished) {

                        tv6.setText("" + millisUntilFinished / 1000);
                        Reminingtime = millisUntilFinished;
                    }


                    @Override
                    public void onFinish() {

                        tv6.setText("Istirahat");
                        ulangbtn6.setEnabled(true);
                        ulangbtn6.setVisibility(View.VISIBLE);


                    }
                }.start();
            }
        });
    }
}
