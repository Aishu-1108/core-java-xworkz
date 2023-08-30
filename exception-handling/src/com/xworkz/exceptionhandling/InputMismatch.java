package com.xworkz.exceptionhandling;

import java.util.InputMismatchException;
import java.util.Scanner;

public class InputMismatch {
    public static void main(String[] args) {
        System.out.println("Main started");
        Scanner sc = new Scanner(System.in);
        int num;
        System.out.println("enter your phone Number:");
        try{
        num = sc.nextInt();
            System.out.println("The name is"+num);
        }catch (InputMismatchException e){
            System.out.println("Input doesnot match");
        }

        System.out.println("Main started");
    }
}
