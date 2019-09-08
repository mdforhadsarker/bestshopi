package com.example.ashad.bestshopi;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;

public class CategoryActivity extends AppCompatActivity {


    ImageView ShirtBtn;
    ImageView JeansBtn;
    ImageView SweaterBtn;
    ImageView ShoeBtn;
    ImageView PhoneBtn;
    ImageView PantsBtn;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_category);

        ShirtBtn = findViewById(R.id.shirt_btn);
        JeansBtn = findViewById(R.id.jeans_btn);
        SweaterBtn = findViewById(R.id.sweater_btn);
        ShoeBtn = findViewById(R.id.shoe_btn);
        PhoneBtn = findViewById(R.id.phone_btn);
        PantsBtn = findViewById(R.id.pants_btn);




        ShirtBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openShirtActivity();
            }
        });
        JeansBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openJeansActivity();
            }
        });

        SweaterBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openSweaterActivity();
            }
        });
        ShoeBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openShoeActivity();
            }
        });

        PhoneBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openPhoneActivity();
            }
        });
        PantsBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openPantsActivity();
            }
        });
    }

    public void openShirtActivity() {
        Intent intent = new Intent(this, ShirtActivity.class);
        startActivity(intent);
    }
    public void openJeansActivity() {
        Intent intent = new Intent(this, JeansActivity.class);
        startActivity(intent);
    }
    public void openSweaterActivity() {
        Intent intent = new Intent(this, SweaterActivity.class);
        startActivity(intent);
    }
    public void openShoeActivity() {
        Intent intent = new Intent(this, ShoeActivity.class);
        startActivity(intent);
    }
    public void openPhoneActivity() {
        Intent intent = new Intent(this, PhoneActivity.class);
        startActivity(intent);
    }
    public void openPantsActivity() {
        Intent intent = new Intent(this, PantsActivity.class);
        startActivity(intent);
    }
}
