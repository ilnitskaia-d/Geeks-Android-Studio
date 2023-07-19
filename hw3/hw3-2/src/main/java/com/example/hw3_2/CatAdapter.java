package com.example.hw3_2;

import android.view.LayoutInflater;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;

public class CatAdapter extends RecyclerView.Adapter<CatViewHolder> {
    private ArrayList<String> catList;

    public CatAdapter(ArrayList<String> catList) {
        this.catList = catList;
    }

    @NonNull
    @Override
    public CatViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        return new CatViewHolder(LayoutInflater.from(parent.getContext()).inflate(R.layout.item_cat, parent, false));
    }

    @Override
    public void onBindViewHolder(@NonNull CatViewHolder holder, int position) {
        holder.bind((catList.get(position)));
    }

    @Override
    public int getItemCount() {
        return catList.size();
    }
}
