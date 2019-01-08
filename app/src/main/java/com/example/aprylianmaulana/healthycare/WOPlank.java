package com.example.aprylianmaulana.healthycare;

import android.os.CountDownTimer;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class WOPlank extends AppCompatActivity {

    private TextView tv8;
    private Button startbtn8, ulangbtn8;

    private long Reminingtime = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_woplank);

        tv8         = (TextView) findViewById(R.id.tv8);
        startbtn8   = (Button) findViewById(R.id.startbtn8);
        ulangbtn8   = (Button) findViewById(R.id.ulangbtn8);


        startbtn8.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startbtn8.setEnabled(false);
                startbtn8.setVisibility(View.INVISIBLE);
                ulangbtn8.setVisibility(View.INVISIBLE);

                long millisInfuture = 31000; //30sec
                long countDownInterval = 1000; //1sec
                new CountDownTimer(millisInfuture, countDownInterval) {


                    @Override
                    public void onTick(long millisUntilFinished) {

                        tv8.setText("" + millisUntilFinished / 1000);
                        Reminingtime = millisUntilFinished;
                    }


                    @Override
                    public void onFinish() {

                        tv8.setText("Istirahat");
                        startbtn8.setEnabled(true);
                        ulangbtn8.setVisibility(View.VISIBLE);

                    }
                }.start();
            }
        });

        ulangbtn8.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                ulangbtn8.setEnabled(false);
                startbtn8.setVisibility(View.INVISIBLE);
                ulangbtn8.setVisibility(View.INVISIBLE);

                long millisInfuture = 31000; //30sec
                long countDownInterval = 1000; //1sec
                new CountDownTimer(millisInfuture, countDownInterval) {


                    @Override
                    public void onTick(long millisUntilFinished) {

                        tv8.setText("" + millisUntilFinished / 1000);
                        Reminingtime = millisUntilFinished;
                    }


                    @Override
                    public void onFinish() {

                        tv8.setText("Istirahat");
                        ulangbtn8.setEnabled(true);
                        ulangbtn8.setVisibility(View.VISIBLE);


                    }
                }.start();
            }
        });
    }
}
