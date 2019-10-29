package com.example.elementarynoter;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ListView;
import android.widget.TextView;
import android.widget.Toast;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class MainActivity extends AppCompatActivity {

    TextView tvOutput;
    TextView tvOutput1;
    TextView tvOutput2;
    TextView tvOutput3;
    EditText etInput;
    Button btnNote;
    Button btnClear;

    public int numberNote = 1;


    @Override

    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        tvOutput1 = findViewById(R.id.noteView1);
        tvOutput2 = findViewById(R.id.noteView2);
        tvOutput3 = findViewById(R.id.noteView3);
        etInput = findViewById(R.id.noteInput);

        btnNote = findViewById(R.id.note);
        btnClear = findViewById(R.id.clear);
    }


    public void btnNote(View view) {
        String text = etInput.getText().toString();

        if (numberNote == 1) {
            tvOutput = tvOutput1;
        } else if (numberNote == 2) {
            tvOutput = tvOutput2;
        } else if (numberNote == 3) {
            tvOutput = tvOutput3;
        }

        tvOutput.setText(numberNote + " - " + text);
        if (numberNote != 3) {
            numberNote++;
        } else {
            numberNote = 1;
        }

        etInput.setText("");
    }

    public void btnClear(View view) {
        etInput.setText("");
        tvOutput1.setText(R.string.your_note1);
        tvOutput2.setText(R.string.your_note2);
        tvOutput3.setText(R.string.your_note3);

        numberNote = 1;

    }
}
