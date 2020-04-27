package com.example.questiongame_homework;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.SeekBar;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    SeekBar seekBar;
    TextView WinOrLose;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        WinOrLose = findViewById(R.id.win_or_lose_TextView);

        seekBar = findViewById(R.id.SeekBar);

        seekBar.setOnSeekBarChangeListener(new SeekBar.OnSeekBarChangeListener() {
            @Override
            public void onProgressChanged(SeekBar seekBar, int progress, boolean fromUser) {

            }

            @Override
            public void onStartTrackingTouch(SeekBar seekBar) {

            }

            @Override
            public void onStopTrackingTouch(SeekBar seekBar) {
                int b = 0;
                int a = seekBar.getProgress();
                if (a > 10 && a <= 35) {
                    b = 25;
                }
                if (a > 35 && a <= 55) {
                    b = 50;
                }

                if (a > 55 && a <= 85) {
                    b = 75;
                }

                if (a > 85 && a <= 100) {
                    b = 100;
                }
                seekBar.setProgress(b);
            }
        });

        Button answer = findViewById(R.id.answer_Button);
        answer.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (seekBar.getProgress() == 75) {
                    WinOrLose.setText("You win");
                } else {
                    WinOrLose.setText("You lose");
                }
            }
        });
    }
}
