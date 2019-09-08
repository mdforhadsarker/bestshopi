package com.example.ashad.bestshopi;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

public class AdminCategoryActivity extends AppCompatActivity {

    private ImageView tShirts, sports, femaleDresses,sweathers;
    private ImageView glasses, pursesBags, hats, shoes;
    private ImageView mobilePhones, watches, laptopsPc, headphonesHandFree;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_admin_category);

        tShirts = (ImageView) findViewById(R.id.t_shirts);
        sports = (ImageView) findViewById(R.id.sports);
        femaleDresses = (ImageView) findViewById(R.id.female_dresses);
        sweathers = (ImageView) findViewById(R.id.sweathers);

        glasses = (ImageView) findViewById(R.id.glasses);
        pursesBags = (ImageView) findViewById(R.id.purses_bags);
        hats = (ImageView) findViewById(R.id.hats);
        shoes = (ImageView) findViewById(R.id.shoes);

        mobilePhones = (ImageView) findViewById(R.id.mobilephones);
        watches = (ImageView) findViewById(R.id.watches);
        laptopsPc = (ImageView) findViewById(R.id.laptops_pc);
        headphonesHandFree = (ImageView) findViewById(R.id.headphoness_handfree);

        tShirts.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(AdminCategoryActivity.this, ProductDetailsActivity.class);
                intent.putExtra("category", "tShirts");
                startActivity(intent);

            }
        });
        sports.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(AdminCategoryActivity.this, ProductDetailsActivity.class);
                intent.putExtra("category", "Sports");
                startActivity(intent);
            }
        });
        femaleDresses.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(AdminCategoryActivity.this, ProductDetailsActivity.class);
                intent.putExtra("category", "Female Dresses");
                startActivity(intent);
            }
        });
        sweathers.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(AdminCategoryActivity.this, ProductDetailsActivity.class);
                intent.putExtra("category", "Sweathers");
                startActivity(intent);
            }
        });
        glasses.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(AdminCategoryActivity.this, ProductDetailsActivity.class);
                intent.putExtra("category", "Glasses");
                startActivity(intent);
            }
        });
        pursesBags.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(AdminCategoryActivity.this, ProductDetailsActivity.class);
                intent.putExtra("category", "Purses Bags");
                startActivity(intent);
            }
        });
        hats.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(AdminCategoryActivity.this, ProductDetailsActivity.class);
                intent.putExtra("category", "Hats");
                startActivity(intent);
            }
        });
        shoes.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(AdminCategoryActivity.this, ProductDetailsActivity.class);
                intent.putExtra("category", "Shoes");
                startActivity(intent);
            }
        });
        mobilePhones.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(AdminCategoryActivity.this, ProductDetailsActivity.class);
                intent.putExtra("category", "Mobile Phones");
                startActivity(intent);
            }
        });
        watches.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(AdminCategoryActivity.this, ProductDetailsActivity.class);
                intent.putExtra("category", "Watches");
                startActivity(intent);
            }
        });
        laptopsPc.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(AdminCategoryActivity.this, ProductDetailsActivity.class);
                intent.putExtra("category", "Laptops Pc");
                startActivity(intent);
            }
        });
        headphonesHandFree.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(AdminCategoryActivity.this, ProductDetailsActivity.class);
                intent.putExtra("category", "Head Phones Hand Free");
                startActivity(intent);
            }
        });

    }
}
