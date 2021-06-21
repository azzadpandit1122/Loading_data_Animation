package com.example.multianimation;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;

import io.supercharge.shimmerlayout.ShimmerLayout;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        ShimmerLayout shimmer_layout = findViewById(R.id.shimmer_layout);
        ShimmerLayout shimmer_text = findViewById(R.id.shimmer_text);

//        new Handler(Looper.getMainLooper()).postDelayed(new Runnable() {
//            @Override
//            public void run() {
//                shimmer_layout.startShimmerAnimation();
//                shimmer_text.startShimmerAnimation();
//            }
//        }, 5000);}

        new Handler().postDelayed(new Runnable() {
            @Override
            public void run() {
                shimmer_layout.startShimmerAnimation();
                shimmer_text.startShimmerAnimation();
            }
        }, 2000);


    }
}