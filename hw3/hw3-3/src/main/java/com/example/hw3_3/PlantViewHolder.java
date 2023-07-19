package com.example.hw3_3;

import android.view.View;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

public class PlantViewHolder extends RecyclerView.ViewHolder {
    private TextView tvPlant;

    public PlantViewHolder(@NonNull View itemView) {
        super(itemView);
        tvPlant = itemView.findViewById(R.id.tv_plant);
    }

    public void bind(String food) {
        tvPlant.setText(food);
    }
}
