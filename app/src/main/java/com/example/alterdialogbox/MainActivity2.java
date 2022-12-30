package com.example.alterdialogbox;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.renderscript.ScriptGroup;
import android.widget.TextView;

public class MainActivity2 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);
        TextView textView=findViewById(R.id.tv_1);
        TextView textView1=findViewById(R.id.tv_2);

        String value=getIntent().getStringExtra("name");
        String value2=getIntent().getStringExtra("Fname");
        textView.setText(value);
        textView1.setText(value2);

    }
}