package com.example.aprylianmaulana.healthycare;

import android.content.DialogInterface;
import android.content.Intent;
import android.support.v7.app.AlertDialog;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.Toolbar;
import android.util.Log;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.widget.AdapterView;
import android.widget.Button;
import android.widget.ImageButton;
import android.widget.Toast;
import android.os.Handler;

public class MainActivity extends AppCompatActivity
        implements View.OnClickListener {
    final String TAG = this.getClass().getName();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        setTitle("Home");
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        ImageButton food = (ImageButton) findViewById(R.id.food);
        ImageButton workout = (ImageButton) findViewById(R.id.workout);
        ImageButton lifestyle = (ImageButton) findViewById(R.id.lifestyle);

        food.setOnClickListener(this);
        workout.setOnClickListener(this);
        lifestyle.setOnClickListener(this);
    }

    @Override
    public void onClick(View view) {
        switch (view.getId()){
            case R.id.food:
                Intent foodActivity = new Intent(MainActivity.this, FoodActivity.class);
                startActivity(foodActivity);
                Toast.makeText(MainActivity.this, "Anda Memilih Pola Makan", Toast.LENGTH_SHORT).show();
                break;
        }
            switch (view.getId()) {
                case R.id.workout:
                    Intent woActivity = new Intent(MainActivity.this, WOActivity.class);
                    startActivity(woActivity);
                    Toast.makeText(MainActivity.this, "Anda Memilih Pola Olahraga", Toast.LENGTH_SHORT).show();
                    break;
            }
            switch (view.getId()) {
                case R.id.lifestyle:
                    Intent hlActivity = new Intent(MainActivity.this, HLActivity.class);
                    startActivity(hlActivity);
                    Toast.makeText(MainActivity.this, "Anda Memilih Pola Hidup Sehat", Toast.LENGTH_SHORT).show();
                    break;
            }
        }
    @Override
    public boolean onCreateOptionsMenu(Menu menu) {

        MenuInflater inflater=getMenuInflater();
        inflater.inflate(R.menu.about, menu);
        return true;
    }

    public boolean onOptionsItemSelected(MenuItem item) {
        if (item.getItemId()==R.id.about) {
            AlertDialog.Builder info = new AlertDialog.Builder(MainActivity.this);
            info.setMessage("Aplikasi ini merupakan aplikasi panduan pola hidup sehat yang akan memandu anda mulai dari pola makan, pola olahraga dan pola gaya hidup. \n\n\n Developed by: Aprylian Maulana");
            info.setNeutralButton("OK", new DialogInterface.OnClickListener() {
                @Override
                public void onClick(DialogInterface dialog, int which) {
                    dialog.dismiss();
                }
            });
            AlertDialog dialog = info.create();
            dialog.setTitle("Tentang Aplikasi");
            dialog.show();
        }
        return true;
    }

    boolean twice = false;
    @Override
    public void onBackPressed() {
        Log.d(TAG, "Click");
        if (twice == true) {
            Intent keluar = new Intent(Intent.ACTION_MAIN);
            keluar.addCategory(Intent.CATEGORY_HOME);
            keluar.setFlags(Intent.FLAG_ACTIVITY_CLEAR_TOP);
            startActivity(keluar);
            finish();
            System.exit(0);
        }
        twice = true;
        Log.d(TAG, "twice: " + twice);
        //super.onBackPressed();
        Toast.makeText(MainActivity.this, "Tekan sekali lagi untuk keluar", Toast.LENGTH_SHORT).show();
        new Handler().postDelayed(new Runnable() {
            @Override
            public void run() {
                twice = false;
                Log.d(TAG, "twice: " + twice);
            }
        }, 3000);
    }
}