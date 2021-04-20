package org.example;

public class Calculator {
    private final double value;


    private Calculator(double value) {
        this.value = value;
    }

    public static Calculator of(double value){
        return new Calculator(value);
    }


    public Calculator add(double number){
        return new Calculator(value + number);
    }

    public double getResult(){
        return value;
    }
}
