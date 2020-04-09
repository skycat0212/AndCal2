package com.sslab.andcal2;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity implements View.OnClickListener{

    private Calculator calculator;
    private TextView textView;

    private Button one;
    private Button two;
    private Button three;
    private Button four;
    private Button five;
    private Button six;
    private Button seven;
    private Button eight;
    private Button nine;
    private Button zero;

    private Button ac;
    private Button equal;
    private Button plus;
    private Button minus;
    private Button multiple;
    private Button divide;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        calculator = new Calculator();

        textView = (TextView)findViewById(R.id.result);
        textView.setText("");

        one = (Button)findViewById(R.id.bOne);
        two = (Button)findViewById(R.id.bTwo);
        three = (Button)findViewById(R.id.bThree);
        four = (Button)findViewById(R.id.bFour);
        five = (Button)findViewById(R.id.bFive);
        six = (Button)findViewById(R.id.bSix);
        seven = (Button)findViewById(R.id.bSeven);
        eight = (Button)findViewById(R.id.bEight);
        nine = (Button)findViewById(R.id.bNine);
        zero = (Button)findViewById(R.id.bZero);


        ac = (Button)findViewById(R.id.bAC);
        equal = (Button)findViewById(R.id.bEqual);
        plus = (Button)findViewById(R.id.bPlus);
        minus = (Button)findViewById(R.id.bMinus);
        multiple = (Button)findViewById(R.id.bMultiple);
        divide = (Button)findViewById(R.id.bDivide);


//
//        one.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View v) {
//                textView.append("1");
//            }
//        });
//
//        plus.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View v) {
//                textView.append("+");
//            }
//        });
//


    }

    @Override
    public void onClick(View v) {
        int a = v.getId();
        String sting = String.valueOf(a);
        textView.setText(sting);

        one.setOnClickListener();
    }









    // TODO: 2020-04-04 리스너로 버튼 바꾸기.
    // TODO: 2020-04-04 그런데.... 연산 부분은 지금처럼말고 string으로 받아서 split
    // TODO: 2020-04-04 버튼 아이디 주기.
    // TODO: 2020-04-04 버튼 초기화하기.
    // TODO: 2020-04-04 리스너를 쓰는 방법은 두가지 - 1. 각각의 버튼에 주는거 2. 클래스 전체에 상속받아오기.


}
