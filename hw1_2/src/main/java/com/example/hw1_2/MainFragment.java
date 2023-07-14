package com.example.hw1_2;

import android.os.Bundle;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.TextView;

public class MainFragment extends Fragment {
    Button btn_p, btn_m;
    TextView tv;
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {

        return inflater.inflate(R.layout.fragment_main, container, false);
    }

    @Override
    public void onViewCreated(@NonNull View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);
        Init();
        InitClick();
    }

    void Init() {
        btn_p = requireActivity().findViewById(R.id.btn_p);
        btn_m = requireActivity().findViewById(R.id.btn_m);
        tv = requireActivity().findViewById(R.id.tv);
    }

    void InitClick() {
        btn_p.setOnClickListener(view-> {
            int n = Integer.parseInt(tv.getText().toString());
            tv.setText(String.valueOf(++n));
        });

        btn_m.setOnClickListener(view-> {
            int n = Integer.parseInt(tv.getText().toString());
            tv.setText(String.valueOf(--n));
        });
    }
}