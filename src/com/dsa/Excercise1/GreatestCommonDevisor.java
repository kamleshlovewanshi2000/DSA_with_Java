package com.dsa.Excercise1;
import java.util.*;

public class GreatestCommonDevisor {
    public static int gcd(int a, int b){
        if(b==0){
            return a;
        }
        return gcd(b,a%b);
    }
    // Driver code:
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter two number:");
        int a = sc.nextInt();
        int b = sc.nextInt();

        //Function called
        System.out.printf("GCD of %d and %d is: ",a,b);
        System.out.print(gcd(a,b));
    }
}
