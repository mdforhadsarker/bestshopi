package com.example.ashad.bestshopi;

import android.content.Intent;
import android.os.Handler;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.concurrent.atomic.AtomicReference;

public class MainActivity extends AppCompatActivity {
    private static int timeout=2000;
//    TextView txt;
    ImageView app_logo;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
//        txt=findViewById(R.id.txt);
        app_logo=findViewById(R.id.app_logo);

        Animation animation=AnimationUtils.loadAnimation(MainActivity.this,R.anim.myanim);
        app_logo.startAnimation(animation);
//        txt.startAnimation(animation);
        Handler handler=new Handler();
        handler.postDelayed(new Runnable() {
            @Override
            public void run() {
                Intent intent=new Intent(MainActivity.this,HomeActivity.class);
                startActivity(intent);

            }
        },timeout);


    }
}
