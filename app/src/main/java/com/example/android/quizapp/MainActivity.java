package com.example.android.quizapp;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    int score = 0;

    public void checkAnswers (View view) {
        RadioGroup radioGroup1 = (RadioGroup) findViewById(R.id.Q1Options);
        int checked1 = radioGroup1.getCheckedRadioButtonId();
        if (checked1 == R.id.Q1O1) {
            score += 1;
        }

        RadioGroup radioGroup2 = (RadioGroup) findViewById(R.id.Q2Options);
        int checked2 = radioGroup2.getCheckedRadioButtonId();
        if (checked2 == R.id.Q2O3) {
            score += 1;
        }

        RadioGroup radioGroup3 = (RadioGroup) findViewById(R.id.Q3Options);
        int checked3 = radioGroup3.getCheckedRadioButtonId();
        if (checked3 == R.id.Q3O2) {
            score += 1;
        }

        RadioGroup radioGroup4 = (RadioGroup) findViewById(R.id.Q4Options);
        int checked4 = radioGroup4.getCheckedRadioButtonId();
        if (checked4 == R.id.Q4O4) {
            score += 1;
        }

        RadioGroup radioGroup5 = (RadioGroup) findViewById(R.id.Q5Options);
        int checked5 = radioGroup5.getCheckedRadioButtonId();
        if (checked5 == R.id.Q5O1) {
            score += 1;
        }

        RadioGroup radioGroup6 = (RadioGroup) findViewById(R.id.Q6Options);
        int checked6 = radioGroup6.getCheckedRadioButtonId();
        if (checked6 == R.id.Q6O3) {
            score += 1;
        }

        RadioGroup radioGroup7 = (RadioGroup) findViewById(R.id.Q7Options);
        int checked7 = radioGroup7.getCheckedRadioButtonId();
        if (checked7 == R.id.Q7O2) {
            score += 1;
        }

        RadioGroup radioGroup8 = (RadioGroup) findViewById(R.id.Q8Options);
        int checked8 = radioGroup8.getCheckedRadioButtonId();
        if (checked8 == R.id.Q8O4) {
            score += 1;
        }

        RadioGroup radioGroup9 = (RadioGroup) findViewById(R.id.Q9Options);
        int checked9 = radioGroup9.getCheckedRadioButtonId();
        if (checked9 == R.id.Q9O1) {
            score += 1;
        }

        RadioGroup radioGroup10 = (RadioGroup) findViewById(R.id.Q10Options);
        int checked10 = radioGroup10.getCheckedRadioButtonId();
        if (checked10 == R.id.Q10O3) {
            score += 1;
        }


    if (score == 10) {
        Toast.makeText(this, "All Answers are correct!", Toast.LENGTH_LONG).show();
    }
        else if (score == 9){
        Toast.makeText(this, "1 Incorrect Answer try Again", Toast.LENGTH_LONG).show();

    }
        else if (score == 8){
        Toast.makeText(this, "2 Incorrect Answers try Again", Toast.LENGTH_LONG).show();

    }
        else if (score == 7){
        Toast.makeText(this, "3 Incorrect Answers try Again", Toast.LENGTH_LONG).show();

    }
        else if (score == 6){
        Toast.makeText(this, "4 Incorrect Answers try Again", Toast.LENGTH_LONG).show();

    }
        else if (score == 5){
        Toast.makeText(this, "5 Incorrect Answers try Again", Toast.LENGTH_LONG).show();

    }
        else if (score == 4){
        Toast.makeText(this, "6 Incorrect Answers try Again", Toast.LENGTH_LONG).show();

    }
        else if (score == 3){
        Toast.makeText(this, "7 Incorrect Answers try Again", Toast.LENGTH_LONG).show();

    }
        else if (score == 2){
        Toast.makeText(this, "8 Incorrect Answers try Again", Toast.LENGTH_LONG).show();

    }
        else if (score == 1){
        Toast.makeText(this, "9 Incorrect Answers try Again", Toast.LENGTH_LONG).show();

    }
        else if (score == 0){
        Toast.makeText(this, "10 Incorrect Answers try Again", Toast.LENGTH_LONG).show();

    }

        }
    }


