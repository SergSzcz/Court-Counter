package com.example.android.courtcounter;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

import java.text.NumberFormat;

public class MainActivity extends AppCompatActivity {
    int scoreTeamA = 0;
    int scoreTeamB = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    /**
     * This method is called when the order button is clicked.
     */

    public void increment3TeamA(View view) {
        scoreTeamA = scoreTeamA + 3;
        displayScoreA(scoreTeamA);
    }

    public void increment2TeamA(View view) {
        scoreTeamA = scoreTeamA + 2;
        displayScoreA(scoreTeamA);
    }

    public void increment1TeamA(View view) {
        scoreTeamA = scoreTeamA + 1;
        displayScoreA(scoreTeamA);
    }

    public void increment3TeamB(View view) {
        scoreTeamB = scoreTeamB + 3;
        displayScoreB(scoreTeamB);
    }

    public void increment2TeamB(View view) {
        scoreTeamB = scoreTeamB + 2;
        displayScoreB(scoreTeamB);
    }

    public void increment1TeamB(View view) {
        scoreTeamB = scoreTeamB + 1;
        displayScoreB(scoreTeamB);
    }
    public void reset(View view) {
        scoreTeamA = 0;
        scoreTeamB = 0;
        displayScoreA(scoreTeamB);
        displayScoreB(scoreTeamB);
    }


    /**
     * This method displays the given quantity value on the screen.
     */
    private void displayScoreA(int number) {
        TextView quantityTextView = (TextView) findViewById(R.id.scoreA);
        quantityTextView.setText("" + number);
    }

    private void displayScoreB(int number) {
        TextView quantityTextView = (TextView) findViewById(R.id.scoreB);
        quantityTextView.setText("" + number);
    }
}

    /**private void displayPrice(int number) {
        TextView priceTextView = (TextView) findViewById(R.id.price_text_view);
        priceTextView.setText(NumberFormat.getCurrencyInstance().format(number));
    }

    private void displayMessage(String message) {
        TextView priceTextView = (TextView) findViewById(R.id.price_text_view);
        priceTextView.setText(message);
    }
}
}
*/