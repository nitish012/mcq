package com.example.mcq;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

public class Result extends AppCompatActivity {
TextView txt1,txt2,txt3;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_result);
        txt1 = findViewById(R.id.tv1);
        txt2 = findViewById(R.id.tv2);
        txt3 = findViewById(R.id.tv3);
        Intent intent = getIntent();
        Bundle extras = intent.getExtras();
        txt1.setText(extras.getString("group1"));
        txt2.setText(extras.getString("group2"));
        txt3.setText(extras.getString("group3"));

    }
}
