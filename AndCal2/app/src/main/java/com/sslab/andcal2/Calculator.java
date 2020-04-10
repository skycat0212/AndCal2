package com.sslab.andcal2;

public class Calculator {


    private double value1;
    private double value2;
    private double result;

    private int operator; // 연산자 0 초기화, 1 은 연산이어서 할때, 2 + , 3 - , 4 * , 5 / // 이퀄 제외하기
    private int priceFlag; // 0 = price1, 1 = price2
//    private int equalFlag;

    Calculator(){
        value1 = 0;
        value2 = 0;
        result = 0;
        priceFlag = 0;
        operator = 0;
//        equalFlag = 0;
    }

    public void setPriceFlag(int flag ){
        if(flag == 0)
            priceFlag = 0;
        else priceFlag = 1;}
    public int getPriceFlag(){ return priceFlag; }

    public void setValue1(double inputPrice){ value1 = inputPrice; }
    public double getValue1(){ return value1; }

    public void setValue2(double inputPrice){ value2 = inputPrice; }
    public double getValue2(){ return value2; }

    public void setResult(double inputPrice){ result = inputPrice; }
    public double getResult(){ return result; }

    public void setOperator(int inputOperator){ operator = inputOperator;}
    public int getOperator(){ return  operator;}

//    public void setEqualFlag(int inputEqualFlag){ equalFlag = inputEqualFlag;}
//    public int getEqualFlag(){ return  equalFlag;}

    public double divide(double inputPrice1, double inputPrice2){ return inputPrice1 / inputPrice2; }
    public double multiple(double inputPrice1, double inputPrice2){ return inputPrice1 * inputPrice2; }
    public double minus(double inputPrice1, double inputPrice2){ return inputPrice1 - inputPrice2; }
    public double plus(double inputPrice1, double inputPrice2){ return inputPrice1 + inputPrice2; }


    public double doCase(int operator){
        double result=0;
        switch (operator){
            case 5:
                result = divide(value1, value2);
                break;
            case 4:
                result = multiple(value1, value2);
                break;
            case 3:
                result = minus(value1, value2);
                break;
            case 2:
                result = plus(value1, value2);
                break;
        }
        return result;
    }

}
