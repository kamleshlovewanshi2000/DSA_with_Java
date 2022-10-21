package com.dsa;

public class SolidRhombus {
    public static void main(String[] args) {
        // Program to design solid Rhombus
        System.out.println("Solid Rhombus Pattern");
        int n = 5;
        // outer loop
        for (int i=1; i<=n; i++){
            // Space
            for(int j=1; j<=n-i; j++){
                System.out.print(" ");
            }
            for (int j=1; j<=5; j++){
                System.out.print("*");
            }
            System.out.println();
        }

        // Program to design Hollow Rhombus
        System.out.println("Hollow Rhombus Pattern");
//        int n = 5;
        // outer loop
        for (int i=1; i<=n; i++){
            // Space
            for(int j=1; j<=n-i; j++){
                System.out.print(" ");
            }
            if(i == 1 || i == n){
                for (int j=1; j<=n; j++){
                    System.out.print("*");
                }
            }
            else {
                for(int j=1; j<=n; j++){
                    if(j==1 || j==n){
                        System.out.print("*");
                    }
                    else{
                        System.out.print(" ");
                    }
                }
            }
            System.out.println();
        }
    }
}
