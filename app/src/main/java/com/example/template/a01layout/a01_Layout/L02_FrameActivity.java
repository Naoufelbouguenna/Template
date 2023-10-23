package com.example.template.a01layout.a01_Layout;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import com.example.template.R;

public class L02_FrameActivity extends AppCompatActivity {

    public void initUI(){ btn_Frame_layout=findViewById(R.id.btn_Frame_layout);}

        Button btn_Frame_layout;
    private void setBtn_Frame_layout(){
        btn_Frame_layout.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(L02_FrameActivity.this, L01_LinearActivity.class));
            }
        });
    }


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_l02_frame);


    }
}