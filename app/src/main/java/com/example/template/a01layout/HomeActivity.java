package com.example.template.a01layout;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import com.example.template.R;
import com.example.template.a01layout.a01_Layout.L01_LinearActivity;
import com.example.template.a01layout.a01_Layout.L02_FrameActivity;
import com.example.template.a01layout.a01_Layout.L03_RelativeActivity;

public class HomeActivity extends AppCompatActivity {

    Button btnLinearLayout ;
    Button btnFramelayout ;
    Button btnRelativelayout ;

    // 2 méthode init pour l'initialisation des widgets

    public void initUI(){
        btnLinearLayout= findViewById(R.id.btn_Linea_layout);
        btnFramelayout= findViewById(R.id.btn_Frame_layout);
        btnRelativelayout= findViewById(R.id.btn_Relative_layout);
    }

    // 3méthode de la gestion de la bouton LinearLayout
    private void setBtnLinearLayout(){
       btnLinearLayout.setOnClickListener(new View.OnClickListener() {
           @Override
           public void onClick(View v) {
               startActivity(new Intent(HomeActivity.this, L01_LinearActivity.class));
           }
       });
    }private void setBtnFramelayout(){
        btnFramelayout.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(HomeActivity.this, L02_FrameActivity.class));
            }
        });
    }private void setBtnRelativelayout(){
        btnRelativelayout.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(HomeActivity.this, L03_RelativeActivity.class));
            }
        });
    }
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home);

        initUI(); // 3 appel de la méthode
        setBtnLinearLayout();// appel de la méthode
        setBtnFramelayout();
        setBtnRelativelayout();
    }
}