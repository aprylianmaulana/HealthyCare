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

public class WOAbdoCrunch extends AppCompatActivity {

    private TextView tv4;
    private Button startbtn4, ulangbtn4;

    private long Reminingtime = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_woabdo_crunch);

        tv4 = (TextView) findViewById(R.id.tv4);
        startbtn4 = (Button) findViewById(R.id.startbtn4);
        ulangbtn4 = (Button) findViewById(R.id.ulangbtn4);


        startbtn4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startbtn4.setEnabled(false);
                startbtn4.setVisibility(View.INVISIBLE);
                ulangbtn4.setVisibility(View.INVISIBLE);

                long millisInfuture = 31000; //30sec
                long countDownInterval = 1000; //1sec
                new CountDownTimer(millisInfuture, countDownInterval) {


                    @Override
                    public void onTick(long millisUntilFinished) {

                        tv4.setText("" + millisUntilFinished / 1000);
                        Reminingtime = millisUntilFinished;
                    }


                    @Override
                    public void onFinish() {

                        tv4.setText("Istirahat");
                        startbtn4.setEnabled(true);
                        ulangbtn4.setVisibility(View.VISIBLE);

                    }
                }.start();
            }
        });

        ulangbtn4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                ulangbtn4.setEnabled(false);
                startbtn4.setVisibility(View.INVISIBLE);
                ulangbtn4.setVisibility(View.INVISIBLE);

                long millisInfuture = 31000; //30sec
                long countDownInterval = 1000; //1sec
                new CountDownTimer(millisInfuture, countDownInterval) {


                    @Override
                    public void onTick(long millisUntilFinished) {

                        tv4.setText("" + millisUntilFinished / 1000);
                        Reminingtime = millisUntilFinished;
                    }


                    @Override
                    public void onFinish() {

                        tv4.setText("Istirahat");
                        ulangbtn4.setEnabled(true);
                        ulangbtn4.setVisibility(View.VISIBLE);


                    }
                }.start();
            }
        });

    }
}
