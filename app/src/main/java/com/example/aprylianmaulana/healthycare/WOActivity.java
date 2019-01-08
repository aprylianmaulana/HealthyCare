package com.example.aprylianmaulana.healthycare;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.CardView;
import android.view.View;
import android.widget.Toast;

public class WOActivity extends AppCompatActivity implements View.OnClickListener {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_wo);

        CardView jumpingjack = (CardView) findViewById(R.id.wo1);
        CardView wallsit = (CardView) findViewById(R.id.wo2);
        CardView pushup = (CardView) findViewById(R.id.wo3);
        CardView abdominal = (CardView) findViewById(R.id.wo4);
        CardView stepupchair = (CardView) findViewById(R.id.wo5);
        CardView squat = (CardView) findViewById(R.id.wo6);
        CardView tricepsdip = (CardView) findViewById(R.id.wo7);
        CardView plank = (CardView) findViewById(R.id.wo8);
        CardView highknees = (CardView) findViewById(R.id.wo9);
        CardView lunge = (CardView) findViewById(R.id.wo10);
        CardView pushuprotation = (CardView) findViewById(R.id.wo11);
        CardView sideplank = (CardView) findViewById(R.id.wo12);

        jumpingjack.setOnClickListener(this);
        wallsit.setOnClickListener(this);
        pushup.setOnClickListener(this);
        abdominal.setOnClickListener(this);
        stepupchair.setOnClickListener(this);
        squat.setOnClickListener(this);
        tricepsdip.setOnClickListener(this);
        plank.setOnClickListener(this);
        highknees.setOnClickListener(this);
        lunge.setOnClickListener(this);
        pushuprotation.setOnClickListener(this);
        sideplank.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {

        switch (v.getId()) {
            case R.id.wo1:
                Intent jj = new Intent(WOActivity.this, WOJumpingJack.class);
                startActivity(jj);
                Toast.makeText(WOActivity.this, "Anda Memilih Jumping Jack", Toast.LENGTH_SHORT).show();
                break;
        }
        switch (v.getId()) {
            case R.id.wo2:
                Intent ws = new Intent(WOActivity.this, WOwallsit.class);
                startActivity(ws);
                Toast.makeText(WOActivity.this, "Anda Memilih Wall Sit", Toast.LENGTH_SHORT).show();
        }
        switch (v.getId()) {
            case R.id.wo3:
                Intent pu = new Intent(WOActivity.this, WOPushUp.class);
                startActivity(pu);
                Toast.makeText(WOActivity.this, "Anda Memilih Push Up", Toast.LENGTH_SHORT).show();
        }
        switch (v.getId()) {
            case R.id.wo4:
                Intent ac = new Intent(WOActivity.this, WOAbdoCrunch.class);
                startActivity(ac);
                Toast.makeText(WOActivity.this, "Anda Memilih Abdominal Crunch", Toast.LENGTH_SHORT).show();
        }
        switch (v.getId()) {
            case R.id.wo5:
                Intent sc = new Intent(WOActivity.this, WOStepUpChair.class);
                startActivity(sc);
                Toast.makeText(WOActivity.this, "Anda Memilih Step Up onto Chair", Toast.LENGTH_SHORT).show();
        }
        switch (v.getId()) {
            case R.id.wo6:
                Intent squat = new Intent(WOActivity.this, WOSquat.class);
                startActivity(squat);
                Toast.makeText(WOActivity.this, "Anda Memilih Squat", Toast.LENGTH_SHORT).show();
        }
        switch (v.getId()) {
            case R.id.wo7:
                Intent tc = new Intent(WOActivity.this, WOTricepDipChair.class);
                startActivity(tc);
                Toast.makeText(WOActivity.this, "Anda Memilih Triceps Dip on Chair", Toast.LENGTH_SHORT).show();
        }
        switch (v.getId()) {
            case R.id.wo8:
                Intent plank = new Intent(WOActivity.this, WOPlank.class);
                startActivity(plank);
                Toast.makeText(WOActivity.this, "Anda Memilih Plank", Toast.LENGTH_SHORT).show();
        }
        switch (v.getId()) {
            case R.id.wo9:
                Intent hk = new Intent(WOActivity.this, WOHighKnees.class);
                startActivity(hk);
                Toast.makeText(WOActivity.this, "Anda Memilih High Knees Running Place", Toast.LENGTH_SHORT).show();
        }
        switch (v.getId()) {
            case R.id.wo10:
                Intent lunge = new Intent(WOActivity.this, WOLunge.class);
                startActivity(lunge);
                Toast.makeText(WOActivity.this, "Anda Memilih Lunge", Toast.LENGTH_SHORT).show();
        }
        switch (v.getId()) {
            case R.id.wo11:
                Intent pur = new Intent(WOActivity.this, WOPushupRotation.class);
                startActivity(pur);
                Toast.makeText(WOActivity.this, "Anda Memilih Push Up and Rotation", Toast.LENGTH_SHORT).show();
        }
        switch (v.getId()) {
            case R.id.wo12:
                Intent sp = new Intent(WOActivity.this, WOSidePlank.class);
                startActivity(sp);
                Toast.makeText(WOActivity.this, "Anda Memilih Side Plank", Toast.LENGTH_SHORT).show();
        }


    }

}
