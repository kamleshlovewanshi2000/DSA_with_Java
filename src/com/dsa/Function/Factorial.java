package com.dsa.Function;
import  java.util.*;
public class Factorial {
    public static void calculateFact(int n){
        int factorial = 1;
        // Condition for negative number
        if(n<0){
            System.out.println("Invalid number!");
            return;
        }
        // loop
        for (int i=n; i>=1; i--){
            factorial = factorial * i;
        }
        System.out.printf("Factorial of %d is %d",n,factorial);
        return;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        calculateFact(n);
//        System.out.println("Factorial of "+n+" :"+calculateFact(n));
    }
}
