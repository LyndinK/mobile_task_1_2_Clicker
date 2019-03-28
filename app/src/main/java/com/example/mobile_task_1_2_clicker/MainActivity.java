package com.example.mobile_task_1_2_clicker;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextClock;
import android.widget.TextView;
import android.widget.ImageButton;

public class MainActivity extends AppCompatActivity {

    TextView mainText;
    Button mainBtn;
    Button lessBtn;
    Button ann;
    ImageButton KIT;

    private long score = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        mainText = (TextView) findViewById(R.id.mainText);
        mainBtn = (Button) findViewById(R.id.button);
        lessBtn = (Button) findViewById(R.id.button2);
        ann = (Button) findViewById(R.id.button3);
        KIT = (ImageButton) findViewById(R.id.imageButton3);


        View.OnClickListener clickListener = new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                score ++;
                String s = "" + score;
                mainText.setText(s.toCharArray(),0, s.length());
            }
        };

        mainBtn.setOnClickListener(clickListener);

        View.OnClickListener clickListener1 = new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                score --;
                String s = "" + score;
                mainText.setText(s.toCharArray(),0, s.length());
            }
        };

        lessBtn.setOnClickListener(clickListener1);

        View.OnClickListener clickListener2 = new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                score = 0;
                String s = "" + score;
                mainText.setText(s.toCharArray(),0, s.length());
            }
        };

        ann.setOnClickListener(clickListener2);

        View.OnClickListener clickListener3 = new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                score = 0;
                String s = "" + score;
                mainText.setText(s.toCharArray(),0, s.length());
            }
        };

        KIT.setOnClickListener(clickListener3);

    }
}

