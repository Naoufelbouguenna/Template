package com.example.template.a01layout.a03_animation;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ImageView;

import com.example.template.R;

public class a01_SimpsonActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_a01_simpson);
        ImageView ivLoading= findViewById(R.id.imageView);
        ivLoading.animate().alpha(1).rotation(3600).setDuration(2000);

    }
}