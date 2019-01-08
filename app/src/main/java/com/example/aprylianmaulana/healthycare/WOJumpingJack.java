package com.example.aprylianmaulana.healthycare;


import android.os.CountDownTimer;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class WOJumpingJack extends AppCompatActivity {

    private TextView tv1;
    private Button startbtn1,ulangbtn1;

    private long Reminingtime=0;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_wo_jumpingjack);


        tv1         =(TextView) findViewById(R.id.tv1);
        startbtn1   =(Button) findViewById(R.id.startbtn1);
        ulangbtn1    =(Button) findViewById(R.id.ulangbtn1);


        startbtn1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
             startbtn1.setEnabled(false);
             startbtn1.setVisibility(View.INVISIBLE);
             ulangbtn1.setVisibility(View.INVISIBLE);

                long millisInfuture=31000; //30sec
                long countDownInterval =1000; //1sec
                new CountDownTimer(millisInfuture, countDownInterval){


                    @Override
                    public void onTick(long millisUntilFinished) {

                            tv1.setText(""+millisUntilFinished/1000);
                            Reminingtime = millisUntilFinished;
                        }


                    @Override
                    public void onFinish() {

                        tv1.setText("Istirahat");
                        startbtn1.setEnabled(true);
                        ulangbtn1.setVisibility(View.VISIBLE);


                    }
                }.start();
            }
        });

        ulangbtn1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                ulangbtn1.setEnabled(false);
                startbtn1.setVisibility(View.INVISIBLE);
                ulangbtn1.setVisibility(View.INVISIBLE);

                long millisInfuture=31000; //30sec
                long countDownInterval =1000; //1sec
                new CountDownTimer(millisInfuture, countDownInterval){


                    @Override
                    public void onTick(long millisUntilFinished) {

                        tv1.setText(""+millisUntilFinished/1000);
                        Reminingtime = millisUntilFinished;
                    }


                    @Override
                    public void onFinish() {

                        tv1.setText("Istirahat");
                        ulangbtn1.setEnabled(true);
                        ulangbtn1.setVisibility(View.VISIBLE);


                    }
                }.start();
            }
        });
}
}
