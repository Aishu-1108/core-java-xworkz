package com.xworkz.exceptionhandling;

public class ArrayIndex {
    public static void main(String[] args) {
        System.out.println("Main started");
        int arr[] = new int[3];
        try {
            arr[0] = 450;
            arr[1] = 300;
            arr[2] = 600;
            arr[3] = 1000;
        } catch (IndexOutOfBoundsException e) {
            System.out.println("array is full");
        }
        System.out.println("Main ended");
    }
}
