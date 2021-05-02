package com.example.animationinandroid;

import androidx.appcompat.app.AppCompatActivity;

import android.nfc.Tag;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.view.animation.AlphaAnimation;
import android.view.animation.Animation;
import android.view.animation.ScaleAnimation;
import android.widget.ImageView;

import com.google.android.material.floatingactionbutton.ExtendedFloatingActionButton;

public class MainActivity extends AppCompatActivity {

    private static final String TAG = "MainActivity";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        ScaleAnimation scaleAnimation = new ScaleAnimation(1, 2, 1, 2);
        scaleAnimation.setDuration(1000);


        ImageView imageView = findViewById(R.id.iv_main);
        ExtendedFloatingActionButton extendedFloatingActionButton = findViewById(R.id.fab_main);
        extendedFloatingActionButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                imageView.startAnimation(scaleAnimation);
            }
        });
    }
}