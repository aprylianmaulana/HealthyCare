package com.example.aprylianmaulana.healthycare;

import android.os.CountDownTimer;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class WOPushupRotation extends AppCompatActivity {

    private TextView tv11;
    private Button startbtn11, ulangbtn11;

    private long Reminingtime = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_wopushup_rotation);

        tv11         = (TextView) findViewById(R.id.tv11);
        startbtn11   = (Button) findViewById(R.id.startbtn11);
        ulangbtn11   = (Button) findViewById(R.id.ulangbtn11);


        startbtn11.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startbtn11.setEnabled(false);
                startbtn11.setVisibility(View.INVISIBLE);
                ulangbtn11.setVisibility(View.INVISIBLE);

                long millisInfuture = 31000; //30sec
                long countDownInterval = 1000; //1sec
                new CountDownTimer(millisInfuture, countDownInterval) {


                    @Override
                    public void onTick(long millisUntilFinished) {

                        tv11.setText("" + millisUntilFinished / 1000);
                        Reminingtime = millisUntilFinished;
                    }


                    @Override
                    public void onFinish() {

                        tv11.setText("Istirahat");
                        startbtn11.setEnabled(true);
                        ulangbtn11.setVisibility(View.VISIBLE);

                    }
                }.start();
            }
        });

        ulangbtn11.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                ulangbtn11.setEnabled(false);
                startbtn11.setVisibility(View.INVISIBLE);
                ulangbtn11.setVisibility(View.INVISIBLE);

                long millisInfuture = 31000; //30sec
                long countDownInterval = 1000; //1sec
                new CountDownTimer(millisInfuture, countDownInterval) {


                    @Override
                    public void onTick(long millisUntilFinished) {

                        tv11.setText("" + millisUntilFinished / 1000);
                        Reminingtime = millisUntilFinished;
                    }


                    @Override
                    public void onFinish() {

                        tv11.setText("Istirahat");
                        ulangbtn11.setEnabled(true);
                        ulangbtn11.setVisibility(View.VISIBLE);


                    }
                }.start();
            }
        });
    }
}
