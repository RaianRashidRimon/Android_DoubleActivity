package com.example.doubleactivity;
import android.content.Intent;
import android.os.Bundle;
import android.widget.TextView;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;

public class SecondActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_second);

        Intent intent = getIntent();
        String gameDetails = intent.getStringExtra("gameDetails");

        TextView GamesTextView = findViewById(R.id.GamesTextView);
        GamesTextView.setText(gameDetails);
    }
}