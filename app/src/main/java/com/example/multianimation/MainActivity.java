package com.example.multianimation;

import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.Fragment;

import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.view.View;
import android.widget.Button;

import io.supercharge.shimmerlayout.ShimmerLayout;

public class MainActivity extends AppCompatActivity {
    //loadinganimation
    //android:id="@+id/kyc"
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

                Fragment kyc_fragment = new KYC_Fragment();
                getSupportFragmentManager().beginTransaction().replace(R.id.mainlayout, kyc_fragment).commit();

    }
}