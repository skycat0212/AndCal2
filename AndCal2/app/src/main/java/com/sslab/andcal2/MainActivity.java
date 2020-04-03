package com.sslab.andcal2;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    private Calculator calculator;
    private TextView textView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


    }

    public void onButtonCalACClicked(View v){
        calculator.setPrice1(0);
        calculator.setPrice2(0);
        calculator.setResult(0);
        textView.setText(0);
    }

    public void onButtonCal0Clicked(View v){

    }






}
