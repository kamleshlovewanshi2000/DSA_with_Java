package com.dsa.Excercise1;
import java.util.*;
public class Power {
    public static long pow(int x, int n){
        // Condition : if x=0 than 0^n= 0;
        if (x==0){
            return 0;
        }
        // Condition: if n=0 than x^0 = 1;
        if(n==0){
            return 1;
        }
        // For all other cases;
        return x*pow(x,n-1);
    }
    // Driver code:
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int x = sc.nextInt();
        System.out.print("Enter the power of number: ");
        int n = sc.nextInt();

        // function called;
        System.out.println(x+"^"+n+" = "+pow(x,n));
    }

}
