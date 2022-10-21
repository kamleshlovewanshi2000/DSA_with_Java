package com.dsa.Function;
import java.util.*;
public class CalculateSum {
    public static int calculateSum(int a, int b){
        int sum = a+b;
        return sum;
    }
    public static int calcutateProduct(int a, int b){
        return a*b;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int result = calculateSum(a,b);
        System.out.println("Sum of two numbers: "+result);
        System.out.println("Product of two numbers: "+calcutateProduct(a,b));
    }
}
