package com.example.animationinandroid;

import androidx.appcompat.app.AppCompatActivity;

import android.nfc.Tag;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.view.animation.AccelerateDecelerateInterpolator;
import android.view.animation.AlphaAnimation;
import android.view.animation.Animation;
import android.view.animation.BounceInterpolator;
import android.view.animation.DecelerateInterpolator;
import android.view.animation.ScaleAnimation;
import android.view.animation.TranslateAnimation;
import android.widget.ImageView;
import android.widget.Toast;

import com.google.android.material.floatingactionbutton.ExtendedFloatingActionButton;

public class MainActivity extends AppCompatActivity {

    private static final String TAG = "MainActivity";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        TranslateAnimation translateAnimation = new TranslateAnimation(Animation.RELATIVE_TO_PARENT, 0 ,Animation.RELATIVE_TO_PARENT, 0, Animation.RELATIVE_TO_SELF, 0, Animation.RELATIVE_TO_PARENT, 0.6f);

        translateAnimation.setFillAfter(true);
        translateAnimation.setRepeatCount(Animation.INFINITE);
        translateAnimation.setDuration(1000);
        translateAnimation.setInterpolator(new AccelerateDecelerateInterpolator());

        ImageView imageView = findViewById(R.id.iv_main);

        imageView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(MainActivity.this, "ImageView Clicked !", Toast.LENGTH_SHORT).show();
            }
        });


        ExtendedFloatingActionButton extendedFloatingActionButton = findViewById(R.id.fab_main);
        extendedFloatingActionButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                imageView.startAnimation(translateAnimation);
            }
        });
    }
}