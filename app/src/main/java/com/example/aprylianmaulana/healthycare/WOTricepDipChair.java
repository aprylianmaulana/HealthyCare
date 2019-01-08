package com.example.aprylianmaulana.healthycare;

import android.os.CountDownTimer;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class WOTricepDipChair extends AppCompatActivity {

    private TextView tv7;
    private Button startbtn7, ulangbtn7;

    private long Reminingtime = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_wotricep_dip_chair);

        tv7         = (TextView) findViewById(R.id.tv7);
        startbtn7   = (Button) findViewById(R.id.startbtn7);
        ulangbtn7   = (Button) findViewById(R.id.ulangbtn7);


        startbtn7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startbtn7.setEnabled(false);
                startbtn7.setVisibility(View.INVISIBLE);
                ulangbtn7.setVisibility(View.INVISIBLE);

                long millisInfuture = 31000; //30sec
                long countDownInterval = 1000; //1sec
                new CountDownTimer(millisInfuture, countDownInterval) {


                    @Override
                    public void onTick(long millisUntilFinished) {

                        tv7.setText("" + millisUntilFinished / 1000);
                        Reminingtime = millisUntilFinished;
                    }


                    @Override
                    public void onFinish() {

                        tv7.setText("Istirahat");
                        startbtn7.setEnabled(true);
                        ulangbtn7.setVisibility(View.VISIBLE);

                    }
                }.start();
            }
        });

        ulangbtn7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                ulangbtn7.setEnabled(false);
                startbtn7.setVisibility(View.INVISIBLE);
                ulangbtn7.setVisibility(View.INVISIBLE);

                long millisInfuture = 31000; //30sec
                long countDownInterval = 1000; //1sec
                new CountDownTimer(millisInfuture, countDownInterval) {


                    @Override
                    public void onTick(long millisUntilFinished) {

                        tv7.setText("" + millisUntilFinished / 1000);
                        Reminingtime = millisUntilFinished;
                    }


                    @Override
                    public void onFinish() {

                        tv7.setText("Istirahat");
                        ulangbtn7.setEnabled(true);
                        ulangbtn7.setVisibility(View.VISIBLE);


                    }
                }.start();
            }
        });
    }
}
