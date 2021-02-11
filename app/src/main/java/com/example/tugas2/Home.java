package com.example.tugas2;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.TextView;

public class Home extends AppCompatActivity {
    private TextView textWelcom;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home);

        textWelcom =findViewById(R.id.welcome);

        Intent intent= getIntent();
        String username = intent.getStringExtra("username");
        textWelcom.setText("Welcome "+"\n"+username);
    }
}