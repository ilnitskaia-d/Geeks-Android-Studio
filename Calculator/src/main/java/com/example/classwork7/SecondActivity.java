package com.example.classwork7;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.TextView;

public class SecondActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second);

        String text = getIntent().getStringExtra("text");
        TextView textView = findViewById(R.id.txt_result);
        textView.setText(text);

        findViewById(R.id.btn_exit).setOnClickListener(view -> {
            MainActivity.activity.finish();
            finish();
        });
    }
}