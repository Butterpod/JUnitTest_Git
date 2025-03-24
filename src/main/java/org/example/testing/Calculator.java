package org.example.testing;
import java.lang.Math.*;

public class Calculator {

    public int add(int a, int b){
        return a+b;
    }

    public double div(double a, double b){
        return (double) Math.round(a / b * 100) /100;
    }

    public int mul(int a,int b){
        return a*b;
    }

    public int diff(int a,int b){
        return a-b;
    }

    public void longCalculation() {
        try {
            // Attendre 2 secondes
            Thread.sleep(2000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

}
