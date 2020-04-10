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

    private Button one, two, three, four, five, six, seven, eight, nine, zero;
    private Button ac, equal, plus, minus, multiple, divide;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        calculator = new Calculator();

        textView = (TextView)findViewById(R.id.result);
        textView.setText("");

        init();
        initOnClickListenser();


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

    private void init(){
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
    }

    private void initOnClickListenser(){
        one.setOnClickListener(this);
        two.setOnClickListener(this);
        three.setOnClickListener(this);
        four.setOnClickListener(this);
        five.setOnClickListener(this);
        six.setOnClickListener(this);
        seven.setOnClickListener(this);
        eight.setOnClickListener(this);
        nine.setOnClickListener(this);
        zero.setOnClickListener(this);
        ac.setOnClickListener(this);
        equal.setOnClickListener(this);
        plus.setOnClickListener(this);
        minus.setOnClickListener(this);
        multiple.setOnClickListener(this);
        divide.setOnClickListener(this);
    }


    @Override
    public void onClick(View v) {

        if (v == one){
            textView.append("1");
            textView.append(v.toString());
        }
        else if (v == two){
            textView.append("2");
        }
        else if (v == three){
            textView.append("3");
        }
        else if (v == four){
            textView.append("4");
        }
        else if (v == five){
            textView.append("5");
        }
        else if (v == six){
            textView.append("6");
        }
        else if (v == seven){
            textView.append("7");
        }
        else if (v == eight){
            textView.append("8");
        }
        else if (v == nine){
            textView.append("9");
        }
        else if (v == zero){
            textView.append("0");
        }
        else if (v == ac){
            textView.setText("");
        }
        else if (v == equal){
            textView.append("=");
        }
        else if (v == plus){
            textView.append("+");
        }
        else if (v == minus){
            textView.append("-");
        }
        else if (v == multiple){
            textView.append("*");
        }
        else if (v == divide){
            textView.append("/");
        }



        int a = v.getId();
        String sting = String.valueOf(a);
        textView.setText(sting);

    }









    // TODO: 2020-04-04 리스너로 버튼 바꾸기.
    // TODO: 2020-04-04 그런데.... 연산 부분은 지금처럼말고 string으로 받아서 split
    // TODO: 2020-04-04 버튼 아이디 주기.
    // TODO: 2020-04-04 버튼 초기화하기.
    // TODO: 2020-04-04 리스너를 쓰는 방법은 두가지 - 1. 각각의 버튼에 주는거 2. 클래스 전체에 상속받아오기.


}



class CalStack {

    private char[] a;


}