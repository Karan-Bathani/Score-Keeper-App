package com.example.scorekeeperapp;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    private EditText etTeamA, etTeamB;
    private TextView tvTeamA, tvTeamB;
    private int pointsA = 0, pointsB = 0;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        etTeamA = (EditText) findViewById(R.id.et_TeamNameA);
        etTeamB = (EditText) findViewById(R.id.et_TeamNameB);
        tvTeamA = (TextView) findViewById(R.id.tv_PointsA);
        tvTeamB = (TextView) findViewById(R.id.tv_PointsB);

    }


    public void addThreeForA(View view) {
        pointsA += 3;
        tvTeamA.setText(String.valueOf(pointsA));
    }

    public void addTwoForA(View view) {
        pointsA += 2;
        tvTeamA.setText(String.valueOf(pointsA));
    }

    public void addOneForA(View view) {
        pointsA += 1;
        tvTeamA.setText(String.valueOf(pointsA));
    }

    public void subtractOneForA(View view) {
        if (pointsA != 0) {
            pointsA -= 1;
        }
        tvTeamA.setText(String.valueOf(pointsA));
    }

    public void addThreeForB(View view) {
        pointsB += 3;
        tvTeamB.setText(String.valueOf(pointsB));
    }

    public void addTwoForB(View view) {
        pointsB += 2;
        tvTeamB.setText(String.valueOf(pointsB));
    }

    public void addOneForB(View view) {
        pointsB += 1;
        tvTeamB.setText(String.valueOf(pointsB));
    }

    public void subtractOneForB(View view) {
        if (pointsB != 0) {
            pointsB -= 1;
        }
        tvTeamB.setText(String.valueOf(pointsB));
    }

    public void reset(View view) {
        pointsA = 0;
        pointsB = 0;
        tvTeamA.setText(String.valueOf(pointsA));
        tvTeamB.setText(String.valueOf(pointsB));    }
}