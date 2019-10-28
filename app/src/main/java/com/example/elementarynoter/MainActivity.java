package com.example.elementarynoter;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import java.util.Scanner;

public class MainActivity extends AppCompatActivity {

    TextView tvOutput;
    EditText etInput;
    Button btnNote;
    Button btnClear;


    @Override

    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        tvOutput = findViewById(R.id.noteView);
        etInput = findViewById(R.id.noteInput);

        btnNote = findViewById(R.id.note);
        btnClear = findViewById(R.id.clear);
    }


    public void btnNote(View view) {
        String text = etInput.getText().toString();

        tvOutput.setText(text);

    }

    public void btnClear(View view) {
        etInput.setText("");
        tvOutput.setText("");

    }
}
