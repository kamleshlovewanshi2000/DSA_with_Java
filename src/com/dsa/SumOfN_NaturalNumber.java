package com.dsa;
import java.util.*;
public class SumOfN_NaturalNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int sum = 0;
        for (int i=0; i<=n; i++){
            sum = sum+i;
        }
        System.out.println("Sum of given n natural number "+sum);
        System.out.println();
        System.out.println("Table of "+n+" are:");
        for(int i=1; i<11; i++){
            System.out.println(n+" X "+i+" = "+n*i);
        }
    }
}
