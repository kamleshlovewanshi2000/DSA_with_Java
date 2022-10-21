package com.dsa;

public class Pattern5 {
    public static void main(String[] args) {
        int n=4;
        // outer loop --> row
        for (int i=1; i<=n; i++){
            // inner loop --> space
            for (int j=1; j<=n-i; j++){
                System.out.print(" ");
            }
            // inner loop --> print *
            for (int k=1; k<=i; k++){
                System.out.print("*");
            }
            System.out.println();
        }
        // Rotate 180 degree inverted half pyramid
        // outer loop --> row
        for (int i=n; i>=1; i--){
            // inner loop --> space
            for (int j=1; j<=n-i; j++){
                System.out.print(" ");
            }
            // inner loop --> print *
            for (int k=1; k<=i; k++){
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
