package com.example.dice;

import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import com.example.dice.R;

import java.security.SecureRandom;

public class DiceActivity extends Activity implements View.OnClickListener {
    private TextView textResult;
    private int max = 6;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_dice);

        //max = getIntent().getIntExtra("max", 0);

        //TextView textTitle = (TextView) findViewById(R.id.textTitle);
        //textTitle.setText(max + " sided dice");

        textResult = ((TextView) findViewById(R.id.textResult));
        textResult.setText("");

        Button buttonRoll = (Button) findViewById(R.id.buttonRoll);
        buttonRoll.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {
        SecureRandom random = new SecureRandom();
        int result = random.nextInt(max) + 1;
        textResult.setText(String.valueOf(result));
    }
}