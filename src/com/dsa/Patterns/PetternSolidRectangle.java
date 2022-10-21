package com.dsa;
import java.util.Scanner;

public class PetternSolidRectangle {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the rows:");
        int row = sc.nextInt();
        System.out.println("Enter the Columns:");
        int col = sc.nextInt();
        for(int i=0; i<row; i++){
            for (int j=0; j<col; j++){
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
