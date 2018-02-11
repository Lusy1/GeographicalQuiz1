package com.example.android.geographicalquiz;

import android.content.Intent;
import android.net.Uri;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.TextView;






public class MainActivity extends AppCompatActivity {

    int score = 0;
    String name;
    String[] nameAndMail = new String[2];
    TextView summaryScore;
    EditText edit_name;
    RadioGroup RG1;
    RadioGroup RG2;
    RadioGroup RG3;
    RadioGroup RG4;
    RadioGroup RG5;
    CheckBox CB1;
    CheckBox CB2;
    CheckBox CB3;
    CheckBox CB4;
    String mailText;
    String message = "Your score is: ";
    String message2 = "Your score is: ";


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        RG1 = (RadioGroup) findViewById(R.id.RadioGroup1);
        RG2 = (RadioGroup) findViewById(R.id.RadioGroup2);
        RG3 = (RadioGroup) findViewById(R.id.RGroup3);
        RG4 = (RadioGroup) findViewById(R.id.RGroup4);
        RG5 = (RadioGroup) findViewById(R.id.RGroup5);
        CB1 = (CheckBox) findViewById(R.id.arabian_sea_checkbox);
        CB2 = (CheckBox) findViewById(R.id.red_sea_checkbox);
        CB3 = (CheckBox) findViewById(R.id.medit_checkbox);
        CB4 = (CheckBox) findViewById(R.id.baltic_checkbox);
        edit_name = (EditText) findViewById(R.id.edit_text_view);
        summaryScore = (TextView) findViewById(R.id.summary_score);


    }

    /**
     * Before the app is about to "die", we have the score in the bundle using this method
     */
    @Override
    public void onSaveInstanceState(Bundle outState) {
        super.onSaveInstanceState(outState);

        outState.putInt("Score1",score);


    }

    @Override
    public void onRestoreInstanceState(Bundle savedInstanceState) {
        super.onRestoreInstanceState(savedInstanceState);
        score = savedInstanceState.getInt("Score1");
        display(score,message,message2);
    }

    /**
     * This method is called when the button result is clicked.
     */

    private int calculateScore() {
        RadioButton Sahara = (RadioButton) findViewById(R.id.sahara_radiobutton);
        boolean isSahara = Sahara.isChecked();

        RadioButton Kalahari = (RadioButton) findViewById(R.id.kalahari_radiobutton);
        boolean isKalahari = Kalahari.isChecked();

        RadioButton Arabian = (RadioButton) findViewById(R.id.arabian_radiobutton);
        boolean isArabian = Arabian.isChecked();

        CheckBox Arabian_sea = (CheckBox) findViewById(R.id.arabian_sea_checkbox);
        boolean isArabian_sea = Arabian_sea.isChecked();

        CheckBox Red_sea = (CheckBox) findViewById(R.id.red_sea_checkbox);
        boolean isRed_sea = Red_sea.isChecked();

        CheckBox Medit = (CheckBox) findViewById(R.id.medit_checkbox);
        boolean isMedit = Medit.isChecked();

        CheckBox Baltic = (CheckBox) findViewById(R.id.baltic_checkbox);
        boolean isBaltic = Baltic.isChecked();


        RadioButton United_States = (RadioButton) findViewById(R.id.US_radiobutton);
        boolean isUnited_States = United_States.isChecked();

        RadioButton China = (RadioButton) findViewById(R.id.china_radiobutton);
        boolean isChina = China.isChecked();

        RadioButton India = (RadioButton) findViewById(R.id.india_radiobutton);
        boolean isIndia = India.isChecked();

        RadioButton K2 = (RadioButton) findViewById(R.id.k2_radiobutton);
        boolean isK2 = K2.isChecked();

        RadioButton Kili = (RadioButton) findViewById(R.id.kili_radiobutton);
        boolean isKili = Kili.isChecked();

        RadioButton Mount_Everest = (RadioButton) findViewById(R.id.me_radiobutton);
        boolean isMount_Everest = Mount_Everest.isChecked();

        RadioButton Nile = (RadioButton) findViewById(R.id.nile_radiobutton);
        boolean isNile = Nile.isChecked();

        RadioButton Amazon = (RadioButton) findViewById(R.id.amazon_radiobutton);
        boolean isAmazon = Amazon.isChecked();

        RadioButton Danube = (RadioButton) findViewById(R.id.danube_radiobutton);
        boolean isDanube = Danube.isChecked();

        RadioButton Monaco = (RadioButton) findViewById(R.id.monaco_radiobutton);
        boolean isMonaco = Monaco.isChecked();

        RadioButton Vatican = (RadioButton) findViewById(R.id.vatican_radiobutton);
        boolean isVatican = Vatican.isChecked();

        RadioButton Maldives = (RadioButton) findViewById(R.id.maldives_radiobutton);
        boolean isMaldives = Maldives.isChecked();


        int score = 0;

        if (isKalahari) {
            score = score;
        }
        if (isSahara) {
            score = score + 1;
        }
        if (isArabian) {
            score = score;
        }
        if (isArabian_sea) {
            score = score;
        }
        if (isMedit) {
            score = score + 1;
        }
        if (isRed_sea) {
            score = score + 1;
        }
        if (isBaltic) {
            score = score;
        }
        if (isUnited_States) {
            score = score;
        }
        if (isChina) {
            score = score + 1;
        }
        if (isIndia) {
            score = score;
        }
        if (isK2) {
            score = score;
        }
        if (isKili) {
            score = score;
        }
        if (isMount_Everest) {
            score = score + 1;
        }
        if (isAmazon) {
            score = score;
        }
        if (isNile) {
            score = score + 1;
        }
        if (isMonaco) {
            score = score;
        }
        if (isVatican) {
            score = score + 1;
        }
        if (isMaldives) {
            score = score;
        }

        return score;
    }

    /**
     * This method calculates the score of the quiz.
     */
    public void showResult(View view) {
        score = calculateScore();
        display(score,message,message2);


    }

    /**
     * This method displays the score on the screen.
     */
    private void display(int score, String message, String message2) {
        EditText nameField = (EditText) findViewById(R.id.edit_text_view);
        name = nameField.getText().toString();


        if (score >= 4) {

            TextView scoreTextView = (TextView) findViewById(R.id.summary_score);
            scoreTextView.setText(getString(R.string.congratulations)  + name + "!"  + getString(R.string.your_geography_knowledge )  + getString(R.string.score) + score + getString(R.string.amount_from_7));

        }

        if (score <= 3) {
            TextView scoreTextView2 = (TextView) findViewById(R.id.summary_score);
            scoreTextView2.setText(getString(R.string.you_can_do_better )  + name  + getString(R.string.try_again )  + getString(R.string.score2) + score + getString(R.string.from7));

        }
    }





    public void mail(View v) {
        Intent intent = new Intent(Intent.ACTION_SENDTO);
        intent.setData(Uri.parse("mailto:")); // only email apps should handle this
        intent.putExtra(Intent.EXTRA_SUBJECT, "Geographical Quiz result for " + name);
        if (score >= 4) {
            intent.putExtra(Intent.EXTRA_TEXT, mailText = "Hello " + name + "\n" + message + score);
        }
        else if (score <= 3) {
            intent.putExtra(Intent.EXTRA_TEXT, mailText = "Hello " + name + "\n" + message2 + score);
            }
            if (intent.resolveActivity(getPackageManager()) != null)
                startActivity(intent); }






    /**
     * Resets the score of the quiz to 0.
     * Clears all RadioGroups and CheckBoxes.
     */
    public void resetScore(View v) {
        RadioGroup radioGroup = RG1;
        radioGroup.clearCheck();

        RadioGroup radioGroup2 = (RadioGroup) findViewById(R.id.RadioGroup2);
        radioGroup2.clearCheck();

        RadioGroup radioGroup3 = (RadioGroup) findViewById(R.id.RGroup3);
        radioGroup3.clearCheck();

        RadioGroup radioGroup4 = (RadioGroup) findViewById(R.id.RGroup4);
        radioGroup4.clearCheck();

        RadioGroup radioGroup5 = (RadioGroup) findViewById(R.id.RGroup5);
        radioGroup5.clearCheck();

        CheckBox checkBox = (CheckBox) findViewById(R.id.arabian_sea_checkbox);
        checkBox.setChecked(false);

        CheckBox checkBox1 = (CheckBox) findViewById(R.id.red_sea_checkbox);
        checkBox1.setChecked(false);

        CheckBox checkBox2 = (CheckBox) findViewById(R.id.medit_checkbox);
        checkBox2.setChecked(false);

        CheckBox checkBox3 = (CheckBox) findViewById(R.id.baltic_checkbox);
        checkBox3.setChecked(false);


        TextView textView = (TextView) findViewById(R.id.summary_score);
        textView.setText(R.string.score_setText);


    }




    }

