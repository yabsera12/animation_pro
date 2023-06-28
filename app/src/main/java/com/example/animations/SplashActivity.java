package com.example.animations;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.ImageView;
import android.widget.TextView;

public class SplashActivity extends AppCompatActivity {

    TextView iv_logo,iv_subtitle, iv_button;
    ImageView iv_splash;
    Animation small_to_big;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_splash);

        small_to_big = AnimationUtils.loadAnimation(this,R.anim.smalltobig);

        iv_logo = findViewById(R.id.iv_logo);
        iv_subtitle = findViewById(R.id.iv_subtitle);
        iv_button = findViewById(R.id.iv_btn);



    }
}