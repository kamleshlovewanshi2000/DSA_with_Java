package com.dsa.Excercise1;
import java.util.*;

public class FibonacciSeries {
    public static int fibonacciNumbers(int n){
        if(n == 0){
            return 0;
        }
        else if(n == 1){
            return 1;
        }
        else{
            return fibonacciNumbers(n-2) + fibonacciNumbers(n-1);
        }
    }
    // Driver Code:
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number:");
        int n = sc.nextInt();

        //function called
        System.out.print("Fibonacci Series of "+n+" : ");
        for (int i=0; i<n; i++){
            System.out.print(fibonacciNumbers(i)+" ");
        }
    }
}
