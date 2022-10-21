package com.dsa.Recursion;

public class Powers {
    public static int calPower(int x, int n){
//        //base condition
//        if(n==0){ // base case 1
//            return 1;
//        }
//        if(x==0){ // base case 2
//            return 0;
//        }
//        // Kaam with stack height = n
//        int xpownm1 = calPower(x,n-1);
//        int xpow = x * xpownm1;
//
//        return xpow;

        // Stack height = logn
        if(n==0){
            return 1;
        }
        if(x==0){
            return 0;
        }
        if (n%2 == 0){ // if n is even
            return calPower(x, n/2) *calPower(x, n/2);
        }else {
            return calPower(x, n/2) *calPower(x, n/2) * x;
        }
    }

    public static void main(String[] args) {
        int x = 2, n = 5;
        int result = calPower(x,n);
        System.out.println(result);
    }
}
