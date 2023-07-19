package com.example.classwork2;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    private RecyclerView rv;
    private FoodAdapter fa;
    private ArrayList<String> list = new ArrayList<>();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        initView();
    }

    private void initView() {
        rv = findViewById(R.id.rv);
        loadData();
        fa = new FoodAdapter(list);
        rv.setAdapter(fa);
    }

    private void loadData() {
        int n = 0;
        while(n < 10){
            list.add("food" + n++);
        }
    }
}