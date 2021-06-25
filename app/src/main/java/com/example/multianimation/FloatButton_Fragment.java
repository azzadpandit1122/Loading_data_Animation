package com.example.multianimation;

import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.OvershootInterpolator;

import com.google.android.material.floatingactionbutton.FloatingActionButton;


public class FloatButton_Fragment extends Fragment {

    FloatingActionButton main, one, two;
    Boolean isFABOpen = false;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view = inflater.inflate(R.layout.fragment_float_button_, container, false);
        main = view.findViewById(R.id.main);
        one = view.findViewById(R.id.one);
        two = view.findViewById(R.id.two);
        one.setVisibility(View.INVISIBLE);
        two.setVisibility(View.INVISIBLE);

        main.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                float rotation = 180f;
                main.animate()
                        .rotationBy(rotation)        // rest 180 covered by "shrink" animation
                        .setDuration(100)
                        .scaleX(1.1f)           //Scaling to 110%
                        .scaleY(1.1f)           //Scaling to 110%
                        .withEndAction(new Runnable() {
                            @Override
                            public void run() {
                                //Chaning the icon by the end of animation
                                main.setImageResource(R.drawable.ic_baseline_arrow_drop_down_24);

                            }
                        })
                        .start();

                if (!isFABOpen) {
                    showFABMenu();
                } else {
                    clseFABMenu();

                }
            }
        });

        return view;
    }

    private void clseFABMenu() {
        isFABOpen = false;
        one.animate().translationY(-getResources().getDimension(R.dimen.standard_55));
        two.animate().translationY(-getResources().getDimension(R.dimen.standard_105));
        one.setVisibility(View.INVISIBLE);
        two.setVisibility(View.INVISIBLE);

    }

    private void showFABMenu() {
        isFABOpen = true;
        one.animate().translationY(0);
        two.animate().translationY(0);
        one.setVisibility(View.VISIBLE);
        two.setVisibility(View.VISIBLE);

    }


//    private void closeMenu() {
//        menuOpen = ! menuOpen;
//        main.setImageResource(R.drawable.ic_launcher_background);
//        one.animate().translationY(0f).alpha(1f).setInterpolator(interpolator).setDuration(300).start();
//        two.animate().translationY(0f).alpha(1f).setInterpolator(interpolator).setDuration(300).start();
//    }
//
//    private void openMenu() {
//        menuOpen = ! menuOpen;
//        main.setImageResource(R.drawable.ic_launcher_background);
//        one.animate().translationY(translationYaxis).alpha(0f).setInterpolator(interpolator).setDuration(300).start();
//        two.animate().translationY(translationYaxis).alpha(0f).setInterpolator(interpolator).setDuration(300).start();
//
//
//    }
}