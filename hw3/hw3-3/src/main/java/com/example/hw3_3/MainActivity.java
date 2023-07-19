package com.example.hw3_3;

import android.os.Bundle;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    private RecyclerView rv;
    private PlantAdapter plantAdapter;
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
        plantAdapter = new PlantAdapter(list);
        rv.setAdapter(plantAdapter);
    }

    private void loadData() {
        list.add("Cactus");
        list.add("Rose");
        list.add("Tree");
        list.add("Catnip");
        list.add("Lavender");
        list.add("Smt that green");

    }
}