package com.example.android.quizapp;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    int score = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void getScore(View view) {
        //Question 1
        RadioGroup questionOne = (RadioGroup) findViewById(R.id.radio_group_one);

        int answerOneId = questionOne.getCheckedRadioButtonId();
        if (answerOneId != -1) {
            RadioButton answerOne = (RadioButton) findViewById(answerOneId);
            //Question 1: a is the right option
            String answerOneActual = getString(R.string.answer_one_a);
            String answerOneText = answerOne.getText().toString();
            boolean isQuestionOneCorrect = answerOneActual.equals(answerOneText);
            if (isQuestionOneCorrect) {
                score++;
            }
        }


        //Question 2
        EditText answerTwo = (EditText) findViewById(R.id.answer_two_edit_text);
        //answer: Roja
        String answerTwoActual = getString(R.string.question_two_answer).trim().toLowerCase();
        String answerTwoText = answerTwo.getText().toString().trim().toLowerCase();
        boolean isQuestionTwoCorrect = answerTwoActual.equals(answerTwoText);
        if (isQuestionTwoCorrect) {
            score++;
        }


        //Question 3
        RadioGroup questionThree = (RadioGroup) findViewById(R.id.radio_group_three);

        int answerThreeId = questionThree.getCheckedRadioButtonId();
        if (answerThreeId != -1) {
            RadioButton answerThree = (RadioButton) findViewById(answerThreeId);
            //Question 3: b is the right option
            String answerThreeActual = getString(R.string.answer_three_b);
            String answerThreeText = answerThree.getText().toString();
            boolean isQuestionThreeCorrect = answerThreeActual.equals(answerThreeText);
            if (isQuestionThreeCorrect) {
                score++;
            }
        }

        //Question 4
        EditText answerFour = (EditText) findViewById(R.id.answer_four_edit_text);
        //answer: Mozart
        String answerFourActual = getString(R.string.question_four_answer).trim().toLowerCase();
        String answerFourText = answerFour.getText().toString().trim().toLowerCase();
        boolean isQuestionFourCorrect = answerFourActual.equals(answerFourText);
        if (isQuestionFourCorrect) {
            score++;
        }

        //Question 5
        RadioGroup questionFive = (RadioGroup) findViewById(R.id.radio_group_five);

        int answerFiveId = questionFive.getCheckedRadioButtonId();
        if (answerFiveId != -1) {
            RadioButton answerFive = (RadioButton) findViewById(answerFiveId);
            //Question 5: b is the right option
            String answerFiveActual = getString(R.string.answer_five_b);
            String answerFiveText = answerFive.getText().toString();
            boolean isQuestionFiveCorrect = answerFiveActual.equals(answerFiveText);
            if (isQuestionFiveCorrect) {
                score++;
            }
        }

        //Question 6
        CheckBox originalSongCheckBox = (CheckBox) findViewById(R.id.checkbox_song);
        CheckBox originalScoreCheckBox = (CheckBox) findViewById(R.id.checkbox_score);
        CheckBox mixingCheckBox = (CheckBox) findViewById(R.id.checkbox_mixing);
        boolean isQuestionSixCorrect = (originalScoreCheckBox.isChecked() &&
                originalSongCheckBox.isChecked() && !mixingCheckBox.isChecked());
        if (isQuestionSixCorrect) {
            score++;
        }

        //Question 7
        RadioGroup questionSeven = (RadioGroup) findViewById(R.id.radio_group_seven);

        int answerSevenId = questionSeven.getCheckedRadioButtonId();
        if (answerSevenId != -1) {
            RadioButton answerSeven = (RadioButton) findViewById(answerSevenId);
            //Question 7: a is the right option
            String answerSevenActual = getString(R.string.answer_seven_a);
            String answerSevenText = answerSeven.getText().toString();
            boolean isQuestionSevenCorrect = answerSevenActual.equals(answerSevenText);
            if (isQuestionSevenCorrect) {
                score++;
            }
        }

        //Display the score as a toast
        String result = "You got " + score + " answers correct!";
        Toast toast = Toast.makeText(this, result, Toast.LENGTH_LONG);
        toast.show();
        score = 0;
    }

    public void reset(View view) {
        RadioGroup questionOne = (RadioGroup) findViewById(R.id.radio_group_one);

        RadioGroup questionThree = (RadioGroup) findViewById(R.id.radio_group_three);
        RadioGroup questionFive = (RadioGroup) findViewById(R.id.radio_group_five);

        RadioGroup questionSeven = (RadioGroup) findViewById(R.id.radio_group_seven);

        CheckBox originalSongCheckBox = (CheckBox) findViewById(R.id.checkbox_song);
        CheckBox originalScoreCheckBox = (CheckBox) findViewById(R.id.checkbox_score);
        CheckBox mixingCheckBox = (CheckBox) findViewById(R.id.checkbox_mixing);

        questionOne.clearCheck();
        questionThree.clearCheck();
        questionFive.clearCheck();
        questionSeven.clearCheck();

        originalSongCheckBox.setChecked(false);
        originalScoreCheckBox.setChecked(false);
        mixingCheckBox.setChecked(false);

        EditText answerTwo = (EditText) findViewById(R.id.answer_two_edit_text);
        answerTwo.setText("");

        EditText answerFour = (EditText) findViewById(R.id.answer_four_edit_text);
        answerFour.setText("");
    }
}
