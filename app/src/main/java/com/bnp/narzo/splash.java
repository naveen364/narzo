package com.bnp.narzo;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.graphics.drawable.Animatable;
import android.os.Bundle;
import android.os.Handler;
import android.view.View;
import android.widget.ImageView;

public class splash extends AppCompatActivity {

    ImageView imageView;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_splash);

        imageView=(ImageView)findViewById(R.id.imageView);
        imageView.setImageResource(R.drawable.avd_anim);
        imageView.setVisibility(View.VISIBLE);
        ((Animatable)imageView.getDrawable()).start();

        Intent intent = new Intent();

        Runnable r = new Runnable() {
            @Override
            public void run() {
                startActivity(new Intent(splash.this,MainActivity.class));
                finish();
            }
        };

        Handler h=new Handler();
        h.postDelayed(r,1550);
    }
}