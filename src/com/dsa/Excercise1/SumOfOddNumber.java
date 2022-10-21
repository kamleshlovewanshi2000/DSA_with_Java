package com.dsa.Excercise1;

import java.util.Scanner;

public class SumOfOddNumber {
    // Finction to print sum of odd number
    public static void sumOfOddNumber(int n){
        int odd = 0;
        for(int i=1; i<=n; i++){
            if(i%2 !=0){
                odd = odd+i;
            }
        }
        System.out.println(odd);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        sumOfOddNumber(n);
    }
}
