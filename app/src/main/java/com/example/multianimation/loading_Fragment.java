package com.example.multianimation;

import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.os.Handler;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import io.supercharge.shimmerlayout.ShimmerLayout;

public class loading_Fragment extends Fragment {
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view = inflater.inflate(R.layout.fragment_loading_, container, false);

        ShimmerLayout shimmer_layout = view.findViewById(R.id.shimmer_layout);
        ShimmerLayout shimmer_text = view.findViewById(R.id.shimmer_text);
        new Handler().postDelayed(new Runnable() {
            @Override
            public void run() {
                shimmer_layout.startShimmerAnimation();
                shimmer_text.startShimmerAnimation();
            }
        }, 2000);
        return view;
    }
}