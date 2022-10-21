package com.dsa.Recursion;

public class PrintNumber {
    public static void printNumber(int n){
        // Q1: Print number 5 to 1   (Ascending order)
//        // 1: define base condition
//        if(n==0){
//            return;
//        }
//        // 2: Define Steps
//        System.out.print(n+" ");
//        //3: Recursion: function call itself
//        printNumber(n-1);

        // Q2: Print number 1 to 5   (descending order)

        // base condition
        if(n==6){
            return;
        }
        System.out.println(n);  //print number
        printNumber(n+1);   // recursion call
    }
    public static void main(String[] args) {
//        int n = 5;
        int n = 1;
        printNumber(n);
    }
}
