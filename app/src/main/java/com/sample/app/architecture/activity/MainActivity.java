package com.sample.app.architecture.activity;

import androidx.appcompat.app.AppCompatActivity;
import androidx.databinding.DataBindingUtil;

import android.os.Bundle;
import android.view.View;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;

import com.sample.app.architecture.R;
import com.sample.app.architecture.databinding.ActivityMainBinding;

public class MainActivity extends AppCompatActivity {


    ActivityMainBinding binding;
    Animation animation;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding = DataBindingUtil.setContentView(this, R.layout.activity_main);
        initViews();
    }

    private void initViews() {
        /**
         * */
        animation = AnimationUtils.loadAnimation(MainActivity.this,R.anim.sample);
        binding.samplebutton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                binding.sampletext.startAnimation(animation);
            }
        });
    }
}