package com.dsa.Recursion;

public class PrintSum {
    public static void printSum(int i, int n, int sum){
        // base condition
        if(i==n){
            sum += i;
            System.out.println(sum);
            return;
        }

        // Step
        sum += i;
        printSum(i+1, n, sum);
        System.out.println(i);     // it's return value of i when stack memory is deleted
    }
    public static void main(String[] args) {
        int n=5;
        int i=1;
        int sum = 0;
        printSum(i,n,sum);
    }
}
