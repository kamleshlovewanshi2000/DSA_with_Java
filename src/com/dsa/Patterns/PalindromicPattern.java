package com.dsa;

public class PalindromicPattern {
    public static void main(String[] args) {
        int n = 5;
        for (int i=1; i<=n; i++) {
            //Space
            for (int j=1; j<=n-i; j++) {
                System.out.print(" ");
            }
            // first half backward loop form j=i to 2.
            for (int j=i; j>=1; j--) {
                System.out.print(j);
            }
            //second half, forward j=2 to i.
            for (int j=2; j <= i; j++) {
                System.out.print(j);
            }
            System.out.println();
        }
    }
}