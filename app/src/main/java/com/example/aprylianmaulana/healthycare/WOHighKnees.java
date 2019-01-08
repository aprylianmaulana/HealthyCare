package com.example.aprylianmaulana.healthycare;

import android.os.CountDownTimer;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class WOHighKnees extends AppCompatActivity {

    private TextView tv9;
    private Button startbtn9, ulangbtn9;

    private long Reminingtime = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_wohigh_knees);

        tv9         = (TextView) findViewById(R.id.tv9);
        startbtn9   = (Button) findViewById(R.id.startbtn9);
        ulangbtn9   = (Button) findViewById(R.id.ulangbtn9);


        startbtn9.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startbtn9.setEnabled(false);
                startbtn9.setVisibility(View.INVISIBLE);
                ulangbtn9.setVisibility(View.INVISIBLE);

                long millisInfuture = 31000; //30sec
                long countDownInterval = 1000; //1sec
                new CountDownTimer(millisInfuture, countDownInterval) {


                    @Override
                    public void onTick(long millisUntilFinished) {

                        tv9.setText("" + millisUntilFinished / 1000);
                        Reminingtime = millisUntilFinished;
                    }


                    @Override
                    public void onFinish() {

                        tv9.setText("Istirahat");
                        startbtn9.setEnabled(true);
                        ulangbtn9.setVisibility(View.VISIBLE);

                    }
                }.start();
            }
        });

        ulangbtn9.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                ulangbtn9.setEnabled(false);
                startbtn9.setVisibility(View.INVISIBLE);
                ulangbtn9.setVisibility(View.INVISIBLE);

                long millisInfuture = 31000; //30sec
                long countDownInterval = 1000; //1sec
                new CountDownTimer(millisInfuture, countDownInterval) {


                    @Override
                    public void onTick(long millisUntilFinished) {

                        tv9.setText("" + millisUntilFinished / 1000);
                        Reminingtime = millisUntilFinished;
                    }


                    @Override
                    public void onFinish() {

                        tv9.setText("Istirahat");
                        ulangbtn9.setEnabled(true);
                        ulangbtn9.setVisibility(View.VISIBLE);


                    }
                }.start();
            }
        });
    }
}
