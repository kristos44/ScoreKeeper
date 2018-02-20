package com.example.android.footballscores;

import android.os.PersistableBundle;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    int scoreTeamA = 0;
    int scoreTeamB = 0;
    int foulTeamA = 0;
    int foulTeamB = 0;
    int cornerTeamA = 0;
    int cornerTeamB = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    @Override
    public void onSaveInstanceState(Bundle savedInstanceState) {
        savedInstanceState.putInt("scoreTeamA", scoreTeamA);
        savedInstanceState.putInt("scoreTeamB", scoreTeamB);
        savedInstanceState.putInt("foulTeamA", foulTeamA);
        savedInstanceState.putInt("foulTeamB", foulTeamB);
        savedInstanceState.putInt("cornerTeamA", cornerTeamA);
        savedInstanceState.putInt("cornerTeamB", cornerTeamB);

        super.onSaveInstanceState(savedInstanceState);
    }

    @Override
    public void onRestoreInstanceState(Bundle savedInstanceState) {
        super.onRestoreInstanceState(savedInstanceState);

        displayForTeamAGoal(savedInstanceState.getInt("scoreTeamA"));
        displayForTeamBGoal(savedInstanceState.getInt("scoreTeamB"));
        displayForTeamAFoul(savedInstanceState.getInt("foulTeamA"));
        displayForTeamBFoul(savedInstanceState.getInt("foulTeamB"));
        displayForTeamACorner(savedInstanceState.getInt("cornerTeamA"));
        displayForTeamBCorner(savedInstanceState.getInt("cornerTeamB"));
    }

    /**
     * Updates and displays score for Team A.
     */
    public void displayForTeamAGoal(int value) {
        TextView scoreView = (TextView) findViewById(R.id.team_a_score);
        scoreView.setText(String.valueOf(value));
    }

    /**
     * Updates and displays score for Team B.
     */
    public void displayForTeamBGoal(int value) {
        TextView scoreView = (TextView) findViewById(R.id.team_b_score);
        scoreView.setText(String.valueOf(value));
    }

    /**
     * Updates and displays fouls for Team A.
     */
    public void displayForTeamAFoul(int value) {
        TextView scoreView = (TextView) findViewById(R.id.team_a_foul);
        scoreView.setText(String.valueOf(value));
    }

    /**
     * Updates and displays fouls for Team B.
     */
    public void displayForTeamBFoul(int value) {
        TextView scoreView = (TextView) findViewById(R.id.team_b_foul);
        scoreView.setText(String.valueOf(value));
    }

    /**
     * Updates and displays corners for Team A.
     */
    public void displayForTeamACorner(int value) {
        TextView scoreView = (TextView) findViewById(R.id.team_a_corner);
        scoreView.setText(String.valueOf(value));
    }

    /**
     * Updates and displays corners for Team B.
     */
    public void displayForTeamBCorner(int value) {
        TextView scoreView = (TextView) findViewById(R.id.team_b_corner);
        scoreView.setText(String.valueOf(value));
    }

    public void addForTeamAGoal (View view) {
        scoreTeamA++;
        displayForTeamAGoal(scoreTeamA);
    }

    public void addForTeamBGoal (View view) {
        scoreTeamB++;
        displayForTeamBGoal(scoreTeamB);
    }

    public void addForTeamAFoul (View view) {
        foulTeamA++;
        displayForTeamAFoul(foulTeamA);
    }

    public void addForTeamBFoul (View view) {
        foulTeamB++;
        displayForTeamBFoul(foulTeamB);
    }

    public void addForTeamACorner (View view) {
        cornerTeamA++;
        displayForTeamACorner(cornerTeamA);
    }

    public void addForTeamBCorner (View view) {
        cornerTeamB++;
        displayForTeamBCorner(cornerTeamB);
    }

    /**
     *  Resets all statitics.
     */
    public void resetStats(View view) {
        scoreTeamA = scoreTeamB = foulTeamA = foulTeamB = cornerTeamA = cornerTeamB = 0;

        displayForTeamAGoal(scoreTeamA);
        displayForTeamBGoal(scoreTeamB);
        displayForTeamAFoul(foulTeamA);
        displayForTeamBFoul(foulTeamB);
        displayForTeamACorner(cornerTeamA);
        displayForTeamBCorner(cornerTeamB);
    }
}
