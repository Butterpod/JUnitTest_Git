package org.example.testing;
import java.lang.Math.*;
import java.util.HashSet;
import java.util.Set;

public class Calculator {

    public int add(int a, int b) {
        return a + b;
    }

    public double div(double a, double b) {
        return (double) Math.round(a / b * 100) / 100;
    }

    public int mul(int a, int b) {
        return a * b;
    }

    public int diff(int a, int b) {
        return a - b;
    }


    // Couverture de Test
    public double add(double a, double b) {

        return a + b;

    }
    public double multiply(double a, double b) {

        return a * b;

    }


    public void longCalculation() {
        try {
            // Attendre 2 secondes
            Thread.sleep(500);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

    public Set<Integer> digitsSet(int number) {
        Set<Integer> integers = new HashSet<Integer>();
        String numberString = String.valueOf(number);


        for (int i = 0; i < numberString.length(); i++) {
            if (numberString.charAt(i) != '-') {
                integers.add(Integer.parseInt(numberString, i, i + 1, 10));
            }
        }
        return integers;
    }
}