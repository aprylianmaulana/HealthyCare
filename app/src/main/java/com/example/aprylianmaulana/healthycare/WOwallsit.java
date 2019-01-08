package com.example.aprylianmaulana.healthycare;

import android.content.DialogInterface;
import android.content.Intent;
import android.os.CountDownTimer;
import android.support.v7.app.AlertDialog;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class WOwallsit extends AppCompatActivity {

    private TextView tv2;
    private Button startbtn2, ulangbtn2;

    private long Reminingtime = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_wowallsit);
        tv2 = (TextView) findViewById(R.id.tv2);
        startbtn2 = (Button) findViewById(R.id.startbtn2);
        ulangbtn2 = (Button) findViewById(R.id.ulangbtn2);


        startbtn2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startbtn2.setEnabled(false);
                startbtn2.setVisibility(View.INVISIBLE);
                ulangbtn2.setVisibility(View.INVISIBLE);

                long millisInfuture = 31000; //30sec
                long countDownInterval = 1000; //1sec
                new CountDownTimer(millisInfuture, countDownInterval) {


                    @Override
                    public void onTick(long millisUntilFinished) {

                        tv2.setText("" + millisUntilFinished / 1000);
                        Reminingtime = millisUntilFinished;
                    }


                    @Override
                    public void onFinish() {

                        tv2.setText("Istirahat");
                        startbtn2.setEnabled(true);
                        ulangbtn2.setVisibility(View.VISIBLE);


                    }
                }.start();
            }
        });

        ulangbtn2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                ulangbtn2.setEnabled(false);
                startbtn2.setVisibility(View.INVISIBLE);
                ulangbtn2.setVisibility(View.INVISIBLE);

                long millisInfuture = 31000; //30sec
                long countDownInterval = 1000; //1sec
                new CountDownTimer(millisInfuture, countDownInterval) {


                    @Override
                    public void onTick(long millisUntilFinished) {

                        tv2.setText("" + millisUntilFinished / 1000);
                        Reminingtime = millisUntilFinished;
                    }


                    @Override
                    public void onFinish() {

                        tv2.setText("Istirahat");
                        ulangbtn2.setEnabled(true);
                        ulangbtn2.setVisibility(View.VISIBLE);


                    }
                }.start();
            }
        });
    }
}