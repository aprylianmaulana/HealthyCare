package com.example.aprylianmaulana.healthycare;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.CardView;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class FoodActivity extends AppCompatActivity
        implements View.OnClickListener {
    private EditText weight, height;
    private TextView outputan;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_food);

        weight = (EditText) findViewById(R.id.editBB);
        height = (EditText) findViewById(R.id.editTB);
        outputan = (TextView) findViewById(R.id.Hasil);
        Button hitung = (Button) findViewById(R.id.hitungBMI);
        CardView kurus = (CardView) findViewById(R.id.p1);
        CardView normal = (CardView) findViewById(R.id.p2);
        CardView gemuk = (CardView) findViewById(R.id.p3);
        CardView obesitas = (CardView) findViewById(R.id.p4);

        hitung.setOnClickListener(this);
        kurus.setOnClickListener(this);
        normal.setOnClickListener(this);
        gemuk.setOnClickListener(this);
        obesitas.setOnClickListener(this);
    }

            @Override
            public void onClick(View v) {
                switch (v.getId()) {
                    case R.id.hitungBMI:
                        if (weight.getText().toString().length()==0){
                            weight.setError("Tidak Boleh Kosong!"); }

                        else if (height.getText().toString().length()==0){
                            height.setError("Tidak Boleh Kosong!"); }

                        String heightStr = height.getText().toString();
                        String weightStr = weight.getText().toString();

                        if (heightStr != null && !"".equals(heightStr)
                                && weightStr != null && !"".equals(weightStr)) {
                            float heightValue = Float.parseFloat(heightStr) / 100;
                            float weightValue = Float.parseFloat(weightStr);

                            float bmi = weightValue / (heightValue * heightValue);
                            displayBMI(bmi);
                        }
                }

                switch (v.getId()) {
                    case R.id.p1:
                        Intent polakurus = new Intent(FoodActivity.this, PolaMKurus.class);
                        startActivity(polakurus);
                        Toast.makeText(FoodActivity.this, "Anda Memilih Pola Makan Untuk Berat Badan Kurus", Toast.LENGTH_SHORT).show();
                        break;
                }

                switch (v.getId()) {
                    case R.id.p2:
                        Intent polanormal = new Intent(FoodActivity.this, PolaMNormal.class);
                        startActivity(polanormal);
                        Toast.makeText(FoodActivity.this, "Anda Memilih Pola Makan Untuk Berat Badan Normal", Toast.LENGTH_SHORT).show();
                        break;
                }

                switch (v.getId()) {
                    case R.id.p3:
                        Intent polagemuk = new Intent(FoodActivity.this, PolaMGemuk.class);
                        startActivity(polagemuk);
                        Toast.makeText(FoodActivity.this, "Anda Memilih Pola Makan Untuk Berat Badan Gemuk", Toast.LENGTH_SHORT).show();
                        break;
                }

                switch (v.getId()) {
                    case R.id.p4:
                        Intent polaobesitas = new Intent(FoodActivity.this, PolaMObesitas.class);
                        startActivity(polaobesitas);
                        Toast.makeText(FoodActivity.this, "Anda Memilih Pola Makan Untuk Berat Badan Obesitas", Toast.LENGTH_SHORT).show();
                        break;
                }
            }


            private void displayBMI(float bmi) {
                String bmiLabel = "";
                if (Float.compare(bmi, 17f) <= 0) {
                    bmiLabel = getString(R.string.underweight);
                } else if (Float.compare(bmi, 17f) > 0 && Float.compare(bmi, 23f) <= 0) {
                    bmiLabel = getString(R.string.normal);
                } else if (Float.compare(bmi, 23f) > 0 && Float.compare(bmi, 27f) <= 0) {
                    bmiLabel = getString(R.string.overweight);
                } else {
                    bmiLabel = getString(R.string.obesitas);
                }
                bmiLabel = bmi + "\n" + bmiLabel + "\n\n" + "Pilih pola makan Anda";
                outputan.setText(bmiLabel);
            }
}