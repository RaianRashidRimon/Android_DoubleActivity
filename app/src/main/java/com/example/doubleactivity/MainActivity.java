package com.example.doubleactivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Spinner;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

import java.util.List;

public class MainActivity extends AppCompatActivity {

    private GameExpert expert = new GameExpert();
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void onClickSeekMenu(View view) {
        Spinner GameSpinner = (Spinner) findViewById(R.id.GameSpinner);
        String SelectedMeal = String.valueOf(GameSpinner.getSelectedItem());

        List<String> gameList = expert.getGames(SelectedMeal);
        StringBuilder gameFormatted = new StringBuilder();
        for (String Game : gameList) {
            gameFormatted.append(Game).append('\n');
        }
        Intent intent = new Intent(this, SecondActivity.class);
        intent.putExtra("gameDetails", gameFormatted.toString());
        startActivity(intent);

    }
}