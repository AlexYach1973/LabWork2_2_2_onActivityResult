package com.example.android.labwork2_2_2;

import android.content.Intent;
import android.os.Bundle;
import android.widget.Button;
import android.widget.EditText;

import androidx.appcompat.app.AppCompatActivity;

public class Activity2 extends AppCompatActivity {
    EditText editText;
    Button buttonBack;
    private static final String KEY_TEXT = "key";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_2);
        editText = findViewById(R.id.editText);
        buttonBack = findViewById(R.id.buttonBack);


        buttonBack.setOnClickListener(v -> {
            Intent intent = new Intent();
            intent.putExtra(KEY_TEXT,editText.getText().toString());
            setResult(RESULT_OK, intent);
            finish();
        });

    }
}