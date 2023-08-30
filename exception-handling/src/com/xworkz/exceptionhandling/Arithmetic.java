package com.xworkz.exceptionhandling;

public class Arithmetic {
    public static void main(String[] args) {
        System.out.println("main started");
        int a,b,c;
        a=5;
        b=0;
        c=0;
        try {
            c = a / b;
        }catch (ArithmeticException e) {
            System.out.println("Any number divided by zero is infinity");
        }

        System.out.println("The value of c:"+c);
        System.out.println("main ended");

    }
}
