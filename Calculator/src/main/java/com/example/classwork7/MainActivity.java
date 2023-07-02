package com.example.classwork7;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    enum opStat {
        None,
        Plus,
        Minus,
        Multiply,
        Divide
    }
    private TextView textView;
    private Integer first, second;
    private opStat currOp;
    private boolean isOnOperation;
    Button btn_menu;

    public static Activity activity;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        activity = this;

        textView = findViewById(R.id.textView);
        isOnOperation = false;
        currOp = opStat.None;

        btn_menu = findViewById(R.id.btn_menu);

        btn_menu.setOnClickListener(view -> {
            Intent intent = new Intent(MainActivity.this, SecondActivity.class);
            String text = textView.getText().toString();
            intent.putExtra("text", text);
            startActivity(intent);
        });
    }

    void setNum(String n) {
        textView.setText(n);
    }

    void appendNum(String n) {
        textView.append(n);
    }
    @SuppressLint("NonConstantResourceId")
    public void onNumberClick(View view) {
        if(view.getId() == R.id.clear_btn) {
            textView.setText("0");
            currOp = opStat.None;
        } else if (textView.getText().toString().equals("0") || isOnOperation) {
            if(view.getId() == R.id.zero_btn)
            {
                setNum("0");
            }
            else if(view.getId() == R.id.one_btn)
            {
                setNum("1");
            }
            else if(view.getId() == R.id.two_btn)
            {
                setNum("2");
            }
            else if(view.getId() == R.id.three_btn)
            {
                setNum("3");
            }
            else if(view.getId() == R.id.four_btn)
            {
                setNum("4");
            }
            else if(view.getId() == R.id.five_btn)
            {
                setNum("5");
            }
            else if(view.getId() == R.id.six_btn)
            {
                setNum("6");
            }
            else if(view.getId() == R.id.seven_btn)
            {
                setNum("7");
            }
            else if(view.getId() == R.id.eight_btn)
            {
                setNum("8");
            }
            else if(view.getId() == R.id.nine_btn)
            {
                setNum("9");
            }
        } else {
            if(view.getId() == R.id.zero_btn)
            {
                appendNum("0");
            }
            else if(view.getId() == R.id.one_btn)
            {
                appendNum("1");
            }
            else if(view.getId() == R.id.two_btn)
            {
                appendNum("2");
            }
            else if(view.getId() == R.id.three_btn)
            {
                appendNum("3");
            }
            else if(view.getId() == R.id.four_btn)
            {
                appendNum("4");
            }
            else if(view.getId() == R.id.five_btn)
            {
                appendNum("5");
            }
            else if(view.getId() == R.id.six_btn)
            {
                appendNum("6");
            }
            else if(view.getId() == R.id.seven_btn)
            {
                appendNum("7");
            }
            else if(view.getId() == R.id.eight_btn)
            {
                appendNum("8");
            }
            else if(view.getId() == R.id.nine_btn)
            {
                appendNum("9");
            }
        }
        isOnOperation = false;
        btn_menu.setVisibility(View.GONE);
    }

    public void onOperationClick(View view) {
        if(view.getId() == R.id.negative_btn)
        {
            //ToDo:negative action
        }
        else if(view.getId() == R.id.percent_btn)
        {
            //ToDo:percent action
        }
        else if(view.getId() == R.id.divide_btn)
        {
            first = Integer.valueOf(textView.getText().toString());
            currOp = opStat.Divide;
        }
        else if(view.getId() == R.id.multiply_btn)
        {
            first = Integer.valueOf(textView.getText().toString());
            currOp = opStat.Multiply;
        }
        else if(view.getId() == R.id.minus_btn)
        {
            first = Integer.valueOf(textView.getText().toString());
            currOp = opStat.Minus;
        }
        else if(view.getId() == R.id.plus_btn)
        {
            first = Integer.valueOf(textView.getText().toString());
            currOp = opStat.Plus;
        }
        else if(view.getId() == R.id.equals_btn && currOp != opStat.None)
        {
            second = Integer.valueOf(textView.getText().toString());
            textView.setText(Integer.toString(getResult()));
            currOp = opStat.None;
            btn_menu.setVisibility(View.VISIBLE);
        }
        isOnOperation = true;
    }
    
    Integer getResult () {
        switch (currOp)
        {
            case Plus:
                return first + second;
            case Minus:
                return first - second;
            case Multiply:
                return first * second;
            case Divide:
                return first / second;
            default:
                throw new IllegalStateException("Unexpected value: " + currOp);
        }
    }
}