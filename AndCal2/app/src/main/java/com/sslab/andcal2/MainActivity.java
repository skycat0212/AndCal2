package com.sslab.andcal2;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import java.util.ArrayList;

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

//        ac = (Button)findViewById(R.id.bAC);
//        equal = (Button)findViewById(R.id.bEqual);
//        plus = (Button)findViewById(R.id.bPlus);
//        minus = (Button)findViewById(R.id.bMinus);
//        multiple = (Button)findViewById(R.id.bMultiple);
//        divide = (Button)findViewById(R.id.bDivide);
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

//        ac.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View v) {
//
//            }
//        });
//        equal.setOnClickListener(this);
//        plus.setOnClickListener(this);
//        minus.setOnClickListener(this);
//        multiple.setOnClickListener(this);
//        divide.setOnClickListener(this);
    }


    @Override
    public void onClick(View v) {

        //
        if (v instanceof Button) {
            Button button = (Button)v;
            textView.append(button.getText());
        }
//        Button button = (Button)v;

//        v.getClass() == Button;

//        textView.append((v.getText().toString()));

//
//        int a = v.getId();
//        String sting = String.valueOf(a);
//        textView.setText(sting);

    }

    public void acButtonClick(View v){
        Button button = (Button)v;
        textView.setText("");
    }

    public void plusButtonClick(View v){
        Button button = (Button)v;

        String rowString = textView.getText().toString();
        String lastString = rowString.substring(rowString.length()-1);
        if(lastString.equals("+") || lastString.equals("-") || lastString.equals("*") || lastString.equals("/")){
            String input = rowString.substring(0,rowString.length()-1);
            textView.setText("");
            textView.append(input);
        }

        textView.append("+");
    }

    public void minusButtonClick(View v){
        Button button = (Button)v;

        String rowString = textView.getText().toString();
        String lastString = rowString.substring(rowString.length()-1);
        if(lastString.equals("+") || lastString.equals("-") || lastString.equals("*") || lastString.equals("/")){
            String input = rowString.substring(0,rowString.length()-1);
            textView.setText("");
            textView.append(input);
        }

        textView.append("-");
    }

    public void multipleButtonClick(View v){
        Button button = (Button)v;

        String rowString = textView.getText().toString();
        String lastString = rowString.substring(rowString.length()-1);
        if(lastString.equals("+") || lastString.equals("-") || lastString.equals("*") || lastString.equals("/")){
            String input = rowString.substring(0,rowString.length()-1);
            textView.setText("");
            textView.append(input);
        }

        textView.append("*");
    }

    public void divideButtonClick(View v){
        Button button = (Button)v;

        String rowString = textView.getText().toString();
        String lastString = rowString.substring(rowString.length()-1);
        if(lastString.equals("+") || lastString.equals("-") || lastString.equals("*") || lastString.equals("/")){
            String input = rowString.substring(0,rowString.length()-1);
            textView.setText("");
            textView.append(input);
        }

        textView.append("/");
    }

    public void equalButtonClick(View v){
        Button button = (Button)v;

        String rowString = textView.getText().toString();
        String lastString = rowString.substring(rowString.length()-1);
        if(lastString.equals("+") || lastString.equals("-") || lastString.equals("*") || lastString.equals("/")){
            String input = rowString.substring(0,rowString.length()-1);
            textView.setText("");
            textView.append(input);
        }

        textView.append("=");
        doEqual();
    }



//    public void numberButtonClick(View v){
//        Button button = (Button)v;
//        Integer number = Integer.parseInt(button.getText().toString());
//        Log.d("number", number.toString());
//        textView.append(number.toString());
//    }


    public void doEqual(){
        String rowString;
        rowString = textView.getText().toString();


        ArrayList firstArray;

        firstArray = new ArrayList();

        while(true) {

            int plusLocation = rowString.indexOf("+"); // + 위치를 반환. 없으면 -1
            int minusLocation = rowString.indexOf("-");// - 위치를 반환. 없으면 -1

            if(plusLocation == minusLocation){
                // + 와 - 가 없으면
            }
            else if(plusLocation == -1){ plusLocation = minusLocation + 1; } // -1 이면 가상의 값을 갖게 해. 연산에 영향을 주지 않는 값.
            else if(minusLocation == -1){ minusLocation = plusLocation + 1;} // -1 이면 가상의 값을 갖게 해. 연산에 영향을 주지 않는 값.

            if(plusLocation < minusLocation){


            }
            else if(minusLocation < plusLocation){


            }

        }

        }

































        /*

        ArrayList firstArray, firstArrayOper, otherOper;
        firstArray = new ArrayList();
        firstArrayOper = new ArrayList();
        otherOper = new ArrayList();

        int cnt = 0;
        int arraySize;
        arraySize=0;
        while(cnt == -1){
            cnt++;
            arraySize=cnt;
            int plusLocation = rowString.indexOf("+");
            int minusLocation = rowString.indexOf("-");
            int smaller;

            int equalFlag =0;

            if(plusLocation == minusLocation && plusLocation==-1){
                cnt=-1;
                equalFlag = 1;
            }
            else if(plusLocation == -1){
                plusLocation = minusLocation+1;
            }
            else if(minusLocation == -1){
                minusLocation = plusLocation+1;
            }

            // 처음 나온게 플러스 연산인지 마이너스 연산인지. 처음꺼 위치를 스몰러로 넣어.
            if (plusLocation <= minusLocation) {
                smaller = plusLocation;
            }
            else smaller = minusLocation;

            //리스트로 첫 연산 전까지 때려박아. 오퍼 리스트에는 연산자(+, - 만)
            firstArray.add(rowString.substring(0,smaller));


            //문자열 검사하기 - * / 있으면 1, 없으면 0
            String string = firstArray.get(cnt).toString();
            if(string.indexOf("*") != -1 || string.indexOf("/") != -1){
                otherOper.add("0");
            }
            otherOper.add("1");

            arraySize = cnt;

            if(equalFlag==0){
                firstArrayOper.add(rowString.charAt(smaller));
            }
            else{
                break;
            }

            rowString = rowString.substring(smaller+1, rowString.length());

        }

        ArrayList secondArray,secondOper;
        secondArray = new ArrayList();
        secondOper = new ArrayList();

        arraySize = firstArray.size();

        int i = 0;
        for(i=0; i< arraySize; i++){

        }


    }

*/







    // TODO: 2020-04-04 리스너로 버튼 바꾸기.
    // TODO: 2020-04-04 그런데.... 연산 부분은 지금처럼말고 string으로 받아서 split
    // TODO: 2020-04-04 버튼 아이디 주기.
    // TODO: 2020-04-04 버튼 초기화하기.
    // TODO: 2020-04-04 리스너를 쓰는 방법은 두가지 - 1. 각각의 버튼에 주는거 2. 클래스 전체에 상속받아오기.


}
