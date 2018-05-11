package com.example.android.kalkulator;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    Button button0, button1, button2, button3, button4, button5, button6, button7, button8, button9;
    Button plusButton, minusButton, multiplyButton, divideButton;
    Button equalButton;
    TextView calculations, result;

    StringBuilder input, output;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        init();

        readInput();
    }

    void init(){
        input = new StringBuilder();
        output = new StringBuilder();
        output.append("= ");
        button0 = (Button)findViewById(R.id.button0);
        button1 = (Button)findViewById(R.id.button1);
        button2 = (Button)findViewById(R.id.button2);
        button3 = (Button)findViewById(R.id.button3);
        button4 = (Button)findViewById(R.id.button4);
        button5 = (Button)findViewById(R.id.button5);
        button6 = (Button)findViewById(R.id.button6);
        button7 = (Button)findViewById(R.id.button7);
        button8 = (Button)findViewById(R.id.button8);
        button9 = (Button)findViewById(R.id.button9);
        plusButton = (Button)findViewById(R.id.plusButton);
        minusButton = (Button)findViewById(R.id.minusButton);
        multiplyButton = (Button)findViewById(R.id.multiplyButton);
        divideButton = (Button)findViewById(R.id.divideButton);
        equalButton = (Button)findViewById(R.id.equalButton);

        calculations = (TextView)findViewById(R.id.calculations);
        result = (TextView)findViewById(R.id.result);
    }

    void readInput(){

        button0.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                input.append(0);
                calculations.setText(input);
            }
        });

        button1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                input.append(1);
                calculations.setText(input);
            }
        });

        button2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                input.append(2);
                calculations.setText(input);
            }
        });

        button3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                input.append(3);
                calculations.setText(input);
            }
        });

        button4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                input.append(4);
                calculations.setText(input);
            }
        });

        button5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                input.append(5);
                calculations.setText(input);
            }
        });

        button6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                input.append(6);
                calculations.setText(input);
            }
        });

        button7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                input.append(7);
                calculations.setText(input);
            }
        });

        button8.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                input.append(8);
                calculations.setText(input);
            }
        });

        button9.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                input.append(9);
                calculations.setText(input);
            }
        });

        plusButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                input.append(" + ");
                calculations.setText(input);
            }
        });

        minusButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                input.append(" - ");
                calculations.setText(input);
            }
        });

        multiplyButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                input.append(" * ");
                calculations.setText(input);
            }
        });

        divideButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                input.append(" / ");
                calculations.setText(input);
            }
        });

        equalButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                result.setText(output);
            }
        });

    }
}
