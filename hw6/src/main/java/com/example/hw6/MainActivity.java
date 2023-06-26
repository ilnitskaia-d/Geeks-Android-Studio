package com.example.hw6;

import androidx.appcompat.app.AppCompatActivity;
import androidx.constraintlayout.widget.ConstraintLayout;

import android.annotation.SuppressLint;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @SuppressLint("ResourceAsColor")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        EditText mail = findViewById(R.id.enter_mail);

        EditText password = findViewById(R.id.enter_password);

        ConstraintLayout info = findViewById(R.id.enter_info);

        Button enter_button = findViewById(R.id.enter_button);
        if(mail.getText().toString().equals("admin") && password.getText().toString().equals("admin"))
        {
            enter_button.setBackgroundResource(R.drawable.button_active);
        }
        else {
            enter_button.setBackgroundResource(R.drawable.button_inactive);
        }

        Toast logged_in = new Toast(getApplicationContext());
        logged_in.setText("Вы успешно вошли");
        logged_in.setDuration(Toast.LENGTH_LONG);

        Toast not_logged_in = new Toast(getApplicationContext());
        not_logged_in.setText("Неправильный логин или пароль");
        not_logged_in.setDuration(Toast.LENGTH_LONG);

        TextView text = findViewById(R.id.text2);

        ConstraintLayout welcome = findViewById(R.id.welcome_text);

        mail.getFreezesText();
        enter_button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(mail.getText().toString().equals("admin") && password.getText().toString().equals("admin"))
                {
                    info.setVisibility(View.GONE);
                    logged_in.show();
                    text.setVisibility(View.GONE);
                }
                else {
                    not_logged_in.show();
                }
            }
        });
    }
}