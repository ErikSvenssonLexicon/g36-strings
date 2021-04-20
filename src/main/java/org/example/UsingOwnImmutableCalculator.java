package org.example;

public class UsingOwnImmutableCalculator {
    public static void main(String[] args) {
        double result = Calculator.of(5)
                .add(3)
                .add(10)
                .add(54)
                .getResult();

        System.out.println(result);




    }
}
