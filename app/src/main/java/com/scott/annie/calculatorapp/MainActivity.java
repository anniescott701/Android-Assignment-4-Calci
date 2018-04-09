package com.scott.annie.calculatorapp;

import android.os.Bundle;
import android.app.Activity;
import android.view.Menu;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends Activity {


    private Button one , two, three , four , five, six, seven, eight, nine, add,sub,mul,div,zero,equal;
    private TextView Number, result;
    private final char ADD = '+';
    private final char EQU = 0;
    private final char SUB = '-';
    private final char MUL = '*';
    private final char DIv = '/';
    private double num1 = Double.NaN;
    private double num2;



    private char CALCULATE;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        setupUIViews();
        zero.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View arg0) {
                // TODO Auto-generated method stub
                Number.setText(Number.getText().toString() + "0");

            }
        });

        one.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View arg0) {
                // TODO Auto-generated method stub
                Number.setText(Number.getText().toString() + "1");

            }
        });

        two.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View arg0) {
                // TODO Auto-generated method stub
                Number.setText(Number.getText().toString() + "2");

            }
        });

        three.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View arg0) {
                // TODO Auto-generated method stub
                Number.setText(Number.getText().toString() + "3");

            }
        });

        four.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View arg0) {
                // TODO Auto-generated method stub
                Number.setText(Number.getText().toString() + "4");

            }
        });

        five.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View arg0) {
                // TODO Auto-generated method stub
                Number.setText(Number.getText().toString() + "5");

            }
        });

        six.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View arg0) {
                // TODO Auto-generated method stub
                Number.setText(Number.getText().toString() + "6");

            }
        });

        seven.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View arg0) {
                // TODO Auto-generated method stub
                Number.setText(Number.getText().toString() + "7");

            }
        });

        eight.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View arg0) {
                // TODO Auto-generated method stub
                Number.setText(Number.getText().toString() + "8");

            }
        });

        nine.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View arg0) {
                // TODO Auto-generated method stub
                Number.setText(Number.getText().toString() + "9");

            }
        });


        add.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View arg0) {
                // TODO Auto-generated method stub
                compute();
                CALCULATE = ADD;
                result.setText(String.valueOf(num1)+"+");
                Number.setText(null);
            }
        });

        sub.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View arg0) {
                // TODO Auto-generated method stub
                compute();
                CALCULATE = SUB;
                result.setText(String.valueOf(num1) + "-");
                Number.setText(null);
            }
        });

        mul.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View arg0) {
                // TODO Auto-generated method stub
                compute();
                CALCULATE = MUL;
                result.setText(String.valueOf(num1) + "*");
                Number.setText(null);
            }
        });

        div.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View arg0) {
                // TODO Auto-generated method stub
                compute();
                CALCULATE = DIv;
                result.setText(String.valueOf(num1) + "/");
                Number.setText(null);
            }
        });


        equal.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View arg0) {
                // TODO Auto-generated method stub
                compute();
                CALCULATE = EQU;
                result.setText(result.getText().toString() + String.valueOf(num2) + "=" + String.valueOf(num1));
                Number.setText(null);


            }
        });


    }

    private void setupUIViews(){

        one = (Button)findViewById(R.id.b0);
        zero = (Button)findViewById(R.id.b1);
        two = (Button)findViewById(R.id.b2);
        three = (Button)findViewById(R.id.b3);
        four = (Button)findViewById(R.id.b4);
        five = (Button)findViewById(R.id.b5);
        six = (Button)findViewById(R.id.b6);
        seven = (Button)findViewById(R.id.b7);
        eight = (Button)findViewById(R.id.b8);
        nine = (Button)findViewById(R.id.b9);
        add = (Button)findViewById(R.id.add);
        sub = (Button)findViewById(R.id.sub);
        mul = (Button)findViewById(R.id.mul);
        div = (Button)findViewById(R.id.div);
        Number = (TextView)findViewById(R.id.textView1);
        result = (TextView)findViewById(R.id.result);
        equal = (Button)findViewById(R.id.equal);

    }

    private void compute(){
        if(!Double.isNaN(num1)){

            num2 = Double.parseDouble(Number.getText().toString());
            switch(CALCULATE){

                case ADD:
                    num1 = num1 + num2;
                    break;
                case SUB:
                    num1 = num1 - num2;
                    break;
                case MUL:
                    num1 = num1 * num2;
                    break;
                case DIv:
                    num1 = num1 / num2;
                    break;

                case EQU:

                    break;
            }


        }
        else{
            num1 = Double.parseDouble(Number.getText().toString());
        }

    }


}