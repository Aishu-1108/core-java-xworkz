package com.xworkz.exceptionhandling;

public class NullPointerExceptionTester {

    public static void main(String[] args) {
        System.out.println("Main started");
        String name=null;

        try{
            System.out.println(name.length());
        }catch (NullPointerException e){
            System.out.println("The value of the variable is null");
        }
        System.out.println("The value is:"+name);
        System.out.println("Main started");
    }
}
