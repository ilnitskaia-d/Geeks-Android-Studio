package com.example;

import android.view.View;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.example.hw3_1.R;

public class FoodViewHolder extends RecyclerView.ViewHolder {
    private TextView tvFood;

    public FoodViewHolder(@NonNull View itemView) {
        super(itemView);
        tvFood = itemView.findViewById(R.id.tv_food);
    }

    public void bind(String food) {
        tvFood.setText(food);
    }
}
