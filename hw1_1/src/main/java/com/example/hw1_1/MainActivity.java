package com.example.hw1_1;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        EditText mail = findViewById(R.id.mail_et);
        EditText theme = findViewById(R.id.theme_et);
        EditText message = findViewById(R.id.message_et);
        Button btn = findViewById(R.id.btn_send);
        btn.setOnClickListener(view -> {
            Intent intent = new Intent(Intent.ACTION_SEND);


            intent.putExtra(Intent.EXTRA_EMAIL, new String[] {mail.getText().toString()});
            intent.putExtra(Intent.EXTRA_SUBJECT, theme.getText().toString());
            intent.putExtra(Intent.EXTRA_TEXT, message.getText().toString());
            intent.setType("message/rfc822");
            startActivity(Intent.createChooser(intent, "Choose an email client"));
        });
    }
}