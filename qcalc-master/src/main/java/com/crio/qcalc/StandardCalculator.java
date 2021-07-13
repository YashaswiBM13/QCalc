package com.crio.qcalc;

public class StandardCalculator {
    // private static int result;
    protected static double result;


    public void add(int a, int b){
        long temp = (long)a + (long)b;
        if(temp >  Integer.MAX_VALUE){
        // if(a == Integer.MAX_VALUE || b == Integer.MAX_VALUE){
            throw new ArithmeticException();
        }
        result = a+b;
    }
    public void subtract(int a, int b){
        long temp = (long)a - (long)b;
        if(temp < Integer.MIN_VALUE){
        // if(a == Integer.MIN_VALUE || b == Integer.MIN_VALUE){
            throw new ArithmeticException();
        }
        result = a-b;
    }
    public void multiply(int a, int b){
        result = a*b;
    }
    public void divide(int a, int b){
        if(b == 0){
            throw new ArithmeticException();
        }
        result = (double)a/(double)b;
    }
    public double getResult(){
        return result;
    }
    public void setResult(int value){
        if(value != 0)
        return;
        // this.result = result;
        result = value;
    }
}