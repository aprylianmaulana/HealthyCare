package com.example.aprylianmaulana.healthycare;

import android.os.CountDownTimer;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class WOStepUpChair extends AppCompatActivity {

    private TextView tv5;
    private Button startbtn5, ulangbtn5;

    private long Reminingtime = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_wostep_up_chair);

        tv5         = (TextView) findViewById(R.id.tv5);
        startbtn5   = (Button) findViewById(R.id.startbtn5);
        ulangbtn5   = (Button) findViewById(R.id.ulangbtn5);


        startbtn5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startbtn5.setEnabled(false);
                startbtn5.setVisibility(View.INVISIBLE);
                ulangbtn5.setVisibility(View.INVISIBLE);

                long millisInfuture = 31000; //30sec
                long countDownInterval = 1000; //1sec
                new CountDownTimer(millisInfuture, countDownInterval) {


                    @Override
                    public void onTick(long millisUntilFinished) {

                        tv5.setText("" + millisUntilFinished / 1000);
                        Reminingtime = millisUntilFinished;
                    }


                    @Override
                    public void onFinish() {

                        tv5.setText("Istirahat");
                        startbtn5.setEnabled(true);
                        ulangbtn5.setVisibility(View.VISIBLE);

                    }
                }.start();
            }
        });

        ulangbtn5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                ulangbtn5.setEnabled(false);
                startbtn5.setVisibility(View.INVISIBLE);
                ulangbtn5.setVisibility(View.INVISIBLE);

                long millisInfuture = 31000; //30sec
                long countDownInterval = 1000; //1sec
                new CountDownTimer(millisInfuture, countDownInterval) {


                    @Override
                    public void onTick(long millisUntilFinished) {

                        tv5.setText("" + millisUntilFinished / 1000);
                        Reminingtime = millisUntilFinished;
                    }


                    @Override
                    public void onFinish() {

                        tv5.setText("Istirahat");
                        ulangbtn5.setEnabled(true);
                        ulangbtn5.setVisibility(View.VISIBLE);


                    }
                }.start();
            }
        });
    }
}
