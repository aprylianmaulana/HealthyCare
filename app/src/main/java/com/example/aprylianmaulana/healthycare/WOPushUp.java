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

public class WOPushUp extends AppCompatActivity {

    private TextView tv3;
    private Button startbtn3, ulangbtn3;

    private long Reminingtime = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_wopush_up);

        tv3 = (TextView) findViewById(R.id.tv3);
        startbtn3 = (Button) findViewById(R.id.startbtn3);
        ulangbtn3 = (Button) findViewById(R.id.ulangbtn3);


        startbtn3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startbtn3.setEnabled(false);

                startbtn3.setVisibility(View.INVISIBLE);
                ulangbtn3.setVisibility(View.INVISIBLE);

                long millisInfuture = 31000; //30sec
                long countDownInterval = 1000; //1sec
                new CountDownTimer(millisInfuture, countDownInterval) {


                    @Override
                    public void onTick(long millisUntilFinished) {

                        tv3.setText("" + millisUntilFinished / 1000);
                        Reminingtime = millisUntilFinished;
                    }


                    @Override
                    public void onFinish() {

                        tv3.setText("Istirahat");
                        startbtn3.setEnabled(true);
                        ulangbtn3.setVisibility(View.VISIBLE);


                    }
                }.start();
            }
        });

        ulangbtn3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                ulangbtn3.setEnabled(false);
                startbtn3.setVisibility(View.INVISIBLE);
                ulangbtn3.setVisibility(View.INVISIBLE);

                long millisInfuture = 31000; //30sec
                long countDownInterval = 1000; //1sec
                new CountDownTimer(millisInfuture, countDownInterval) {


                    @Override
                    public void onTick(long millisUntilFinished) {

                        tv3.setText("" + millisUntilFinished / 1000);
                        Reminingtime = millisUntilFinished;
                    }


                    @Override
                    public void onFinish() {

                        tv3.setText("Istirahat");
                        ulangbtn3.setEnabled(true);
                        ulangbtn3.setVisibility(View.VISIBLE);

                    }
                }.start();
            }
        });

    }
}
