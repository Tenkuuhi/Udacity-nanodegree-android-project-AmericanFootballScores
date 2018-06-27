package com.example.android.americanfootballscores;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.TextView;
import android.view.View;
import java.text.NumberFormat;

public class MainActivity extends AppCompatActivity {
    int scoreTeamA=0;
    int scoreTeamB=0;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    /**
     * Displays the given score for Team A.
     */
    public void displayForTeamA(int score) {
        TextView scoreView = (TextView) findViewById(R.id.team_a_score);
        scoreView.setText(String.valueOf(score));
    }

    /**
     * Displays the given score for Team B.
     */
    public void displayForTeamB(int score) {
        TextView scoreView = (TextView) findViewById(R.id.team_b_score);
        scoreView.setText(String.valueOf(score));
    }

    public void addThreeForTeamA(View v) {
        scoreTeamA = scoreTeamA+3;
        displayForTeamA(scoreTeamA);
    }
    public void addSixForTeamA(View v) {
        scoreTeamA = scoreTeamA+6;
        displayForTeamA(scoreTeamA);
    }
    public void addSevenForTeamA(View v) {
        scoreTeamA = scoreTeamA+7;
        displayForTeamA(scoreTeamA);
    }
    public void addEightForTeamA(View v) {
        scoreTeamA = scoreTeamA+8;
        displayForTeamA(scoreTeamA);
    }

    public void addThreeForTeamB(View v) {
        scoreTeamB = scoreTeamB+3;
        displayForTeamB(scoreTeamB);
    }
    public void addSixForTeamB(View v) {
        scoreTeamB = scoreTeamB+6;
        displayForTeamB(scoreTeamB);
    }
    public void addSevenForTeamB(View v) {
        scoreTeamB = scoreTeamB+7;
        displayForTeamB(scoreTeamB);
    }
    public void addEightForTeamB(View v) {
        scoreTeamB = scoreTeamB+8;
        displayForTeamB(scoreTeamB);
    }
    public void resetScore(View v){
        scoreTeamA=0;
        scoreTeamB=0;
        displayForTeamA(scoreTeamA);
        displayForTeamB(scoreTeamB);
    }
}
