package com.example.hw3_2;

import android.os.Bundle;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    private RecyclerView rv;
    private CatAdapter catAdapter;
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
        catAdapter = new CatAdapter(list);
        rv.setAdapter(catAdapter);
    }

    private void loadData() {
        list.add("Cat");
        list.add("Kitty");
        list.add("Kot");
        list.add("Gatto");
        list.add("Chat");
        list.add("I love kotov");

    }
}