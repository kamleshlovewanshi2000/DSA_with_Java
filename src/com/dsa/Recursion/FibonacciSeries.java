package com.dsa.Recursion;

public class FibonacciSeries {
    // Print the fibonacci Series till n-th term*
    public static void fibonacci(int a, int b, int n){
        if(n==0){
    return;
        }
        int c = a+b;
        System.out.print(c+" ");
        fibonacci(b,c,n-1);
    }

    public static void main(String[] args) {
        int n = 10;
        int a = 0;
        int b = 1;
        System.out.print(a+" "+ b+" ");
        fibonacci(a,b,n-2);
    }
}
