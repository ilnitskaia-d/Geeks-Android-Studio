package com.example.hw3_3;

import android.view.LayoutInflater;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;

public class PlantAdapter extends RecyclerView.Adapter<PlantViewHolder> {
    private ArrayList<String> plantList;

    public PlantAdapter(ArrayList<String> foodList) {
        this.plantList = foodList;
    }

    @NonNull
    @Override
    public PlantViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        return new PlantViewHolder(LayoutInflater.from(parent.getContext()).inflate(R.layout.item_plant, parent, false));
    }

    @Override
    public void onBindViewHolder(@NonNull PlantViewHolder holder, int position) {
        holder.bind((plantList.get(position)));
    }

    @Override
    public int getItemCount() {
        return plantList.size();
    }
}
