package com.example.hw3_2;

import android.view.View;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

public class CatViewHolder extends RecyclerView.ViewHolder {
    private TextView tvCat;

    public CatViewHolder(@NonNull View itemView) {
        super(itemView);
        tvCat = itemView.findViewById(R.id.tv_cat);
    }

    public void bind(String food) {
        tvCat.setText(food);
    }
}
