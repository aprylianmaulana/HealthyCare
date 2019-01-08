package com.example.aprylianmaulana.healthycare;

import android.os.CountDownTimer;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class WOLunge extends AppCompatActivity {

    private TextView tv10;
    private Button startbtn10, ulangbtn10;

    private long Reminingtime = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_wolunge);

        tv10         = (TextView) findViewById(R.id.tv10);
        startbtn10   = (Button) findViewById(R.id.startbtn10);
        ulangbtn10   = (Button) findViewById(R.id.ulangbtn10);


        startbtn10.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startbtn10.setEnabled(false);
                startbtn10.setVisibility(View.INVISIBLE);
                ulangbtn10.setVisibility(View.INVISIBLE);

                long millisInfuture = 31000; //30sec
                long countDownInterval = 1000; //1sec
                new CountDownTimer(millisInfuture, countDownInterval) {


                    @Override
                    public void onTick(long millisUntilFinished) {

                        tv10.setText("" + millisUntilFinished / 1000);
                        Reminingtime = millisUntilFinished;
                    }


                    @Override
                    public void onFinish() {

                        tv10.setText("Istirahat");
                        startbtn10.setEnabled(true);
                        ulangbtn10.setVisibility(View.VISIBLE);

                    }
                }.start();
            }
        });

        ulangbtn10.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                ulangbtn10.setEnabled(false);
                startbtn10.setVisibility(View.INVISIBLE);
                ulangbtn10.setVisibility(View.INVISIBLE);

                long millisInfuture = 31000; //30sec
                long countDownInterval = 1000; //1sec
                new CountDownTimer(millisInfuture, countDownInterval) {


                    @Override
                    public void onTick(long millisUntilFinished) {

                        tv10.setText("" + millisUntilFinished / 1000);
                        Reminingtime = millisUntilFinished;
                    }


                    @Override
                    public void onFinish() {

                        tv10.setText("Istirahat");
                        ulangbtn10.setEnabled(true);
                        ulangbtn10.setVisibility(View.VISIBLE);


                    }
                }.start();
            }
        });
    }
}
