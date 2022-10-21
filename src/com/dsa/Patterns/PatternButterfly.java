package com.dsa;

public class PatternButterfly {
    public static void main(String[] args) {
        int n = 4;
//        int m = 8;
        // Upper half
        for (int i=1; i<=n; i++){
            // 1st part of upper half
            for (int j=1; j<=i; j++){
                System.out.print("*");
            }
            // Print Spaces
            int spaces = 2*(n-i);
            for (int j=1; j<=spaces; j++){
                System.out.print(" ");
            }
            // 2nd part of Upper Half
            for (int j=1; j<=i; j++){
                System.out.print("*");
            }
            System.out.println();
        }
        // lower half
        for (int i=n; i>=1; i--){
            // 1st part of lower half
            for (int j=1; j<=i; j++){
                System.out.print("*");
            }
            // Print Spaces
            int spaces = 2*(n-i);
            for (int j=1; j<=spaces; j++){
                System.out.print(" ");
            }
            // 2nd part of lower Half
            for (int j=1; j<=i; j++){
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
