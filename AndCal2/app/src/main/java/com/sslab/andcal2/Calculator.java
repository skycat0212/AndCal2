package com.sslab.andcal2;

public class Calculator {


    private double price1;
    private double price2;
    private double result;

    private int dustkswk
    private int priceFlag; // 0 = price1, 1 = price2

    Calculator(){
        price1 = 0;
        price2 = 0;
        result = 0;
        priceFlag = 0;
    }

    public void setPriceFlag(int flag ){
        if(flag == 0)
            priceFlag = 0;
        else priceFlag = 1;}
    public int getPriceFlag(){ return priceFlag; }

    public void setPrice1(double inputPrice){ price1 = inputPrice; }
    public double getPrice1(){ return price1; }

    public void setPrice2(double inputPrice){ price2 = inputPrice; }
    public double getPrice2(){ return price2; }

    public void setResult(double inputPrice){ result = inputPrice; }
    public double getResult(){ return result; }

    public double divide(double inputPrice1, double inputPrice2){ return inputPrice1 / inputPrice2; }
    public double multiple(double inputPrice1, double inputPrice2){ return inputPrice1 * inputPrice2; }
    public double minus(double inputPrice1, double inputPrice2){ return inputPrice1 - inputPrice2; }
    public double plus(double inputPrice1, double inputPrice2){ return inputPrice1 + inputPrice2; }

    public double equal(double inputPrice1){
        return inputPrice1;
    }
    public double equal(double inputPrice1, int caseNum, double inputPrice2){
        return doCase(inputPrice1,inputPrice2, caseNum);
    }

    public double doCase(double inputPrice1, double inputPrice2, int caseNum){
        double result=0;
        switch (caseNum){
            case 1:
                result = divide(inputPrice1,inputPrice2);
                break;
            case 2:
                result = multiple(inputPrice1,inputPrice2);
                break;
            case 3:
                result = minus(inputPrice1,inputPrice2);
                break;
            case 4:
                result = plus(inputPrice1,inputPrice2);
                break;
        }
        return result;
    }



}
