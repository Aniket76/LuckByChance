package com.aniketvishal.luckbychance;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.RadioButton;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    int p1 = 0;
    int p2 = 0;
    int p3 = 0;
    int p4 = 0;

    int mode;

    int int_tv1a=0;
    int int_tv1b=1;

    int int_tv2a=0;
    int int_tv2b=1;

    int int_tv3a=0;
    int int_tv3b=1;

    int int_tv4a=0;
    int int_tv4b=1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void player1(View view) {

        if (p1 % 2 == 0) {
            double double_tv1a = Math.random();
            int_tv1a = (int)(double_tv1a*mode);

            display1a(int_tv1a);
            check();
        }
        else {
            double double_tv1b = Math.random();
            int_tv1b = (int)(double_tv1b*mode);

            display1b(int_tv1b);
            check();
        }

        p1++;
    }

    private void display1a(int number) {
        TextView tv = (TextView) findViewById(R.id.tv_p1a);
        tv.setText("" + number);
    }

    private void display1b(int number) {
        TextView tv = (TextView) findViewById(R.id.tv_p1b);
        tv.setText("" + number);
    }


    public void player2(View view) {

        if (p2 % 2 == 0) {
            double double_tv1a = Math.random();
            int_tv2a = (int)(double_tv1a*mode);

            display2a(int_tv2a);
            check();
        }
        else {
            double double_tv1b = Math.random();
            int_tv2b = (int)(double_tv1b*mode);

            display2b(int_tv2b);
            check();
        }

        p2++;
    }

    private void display2a(int number) {
        TextView tv = (TextView) findViewById(R.id.tv_p2a);
        tv.setText("" + number);
    }

    private void display2b(int number) {
        TextView tv = (TextView) findViewById(R.id.tv_p2b);
        tv.setText("" + number);
    }

    public void player3(View view) {

        if (p3 % 2 == 0) {
            double double_tv1a = Math.random();
            int_tv3a = (int)(double_tv1a*mode);

            display3a(int_tv3a);
            check();
        }
        else {
            double double_tv1b = Math.random();
            int_tv3b = (int)(double_tv1b*mode);

            display3b(int_tv3b);
            check();
        }

        p3++;
    }

    private void display3a(int number) {
        TextView tv = (TextView) findViewById(R.id.tv_p3a);
        tv.setText("" + number);
    }

    private void display3b(int number) {
        TextView tv = (TextView) findViewById(R.id.tv_p3b);
        tv.setText("" + number);
    }

    public void player4(View view) {

        if (p4 % 2 == 0) {
            double double_tv1a = Math.random();
            int_tv4a = (int)(double_tv1a*mode);

            display4a(int_tv4a);
            check();
        }
        else {
            double double_tv1b = Math.random();
            int_tv4b = (int)(double_tv1b*mode);

            display4b(int_tv4b);
            check();
        }

        p4++;
    }

    private void display4a(int number) {
        TextView tv = (TextView) findViewById(R.id.tv_p4a);
        tv.setText("" + number);
    }

    private void display4b(int number) {
        TextView tv = (TextView) findViewById(R.id.tv_p4b);
        tv.setText("" + number);
    }


    private void display_result(String winner) {
        TextView tv = (TextView) findViewById(R.id.tv_winner);
        tv.setText("" + winner);
    }

    private void check() {
        if(int_tv1a == int_tv1b) {
            display_result("Player 1 : Winner");
        }

        else if(int_tv2a == int_tv2b) {
            display_result("Player 2 : Winner");
        }

        else if(int_tv3a == int_tv3b) {
            display_result("Player 3 : Winner");
        }

        else if(int_tv4a == int_tv4b) {
            display_result("Player 4 : Winner");
        }

    }


    public void reset(View view) {
        p1 = 0;
        p2 = 0;
        p3 = 0;
        p4 = 0;

        int_tv1a=0;
        int_tv1b=1;

        int_tv2a=0;
        int_tv2b=1;

        int_tv3a=0;
        int_tv3b=1;

        int_tv4a=0;
        int_tv4b=1;

        display1a(int_tv1a);
        display1b(int_tv1b);

        display2a(int_tv2a);
        display2b(int_tv2b);

        display3a(int_tv3a);
        display3b(int_tv3b);

        display4a(int_tv4a);
        display4b(int_tv4b);

        display_result("Who is the Winner?");
    }


    public void onRadioButtonClicked(View view) {
        // Is the button now checked?
        boolean checked = ((RadioButton) view).isChecked();

        // Check which radio button was clicked
        switch(view.getId()) {
            case R.id.easy_radio_button:
                if (checked)
                    mode = 10;
                    break;
            case R.id.medium_radio_button:
                if (checked)
                    mode = 15;
                    break;
            case R.id.hard_radio_button:
                if (checked)
                    mode = 20;
                    break;
            case R.id.expert_radio_button:
                if (checked)
                    mode = 25;
                break;
        }
    }


}
