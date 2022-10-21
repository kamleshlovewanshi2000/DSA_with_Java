package com.dsa.Array;
import java.util.*;
public class TwoDArray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        // Input rows and columns
        int rows = sc.nextInt();
        int cols = sc.nextInt();

        // Define a 2D Array
        int numbers[][] = new int[rows][cols];

        // Insert elements using nested for loops
        for (int i=0; i<rows; i++){
            for (int j=0; j<cols; j++){
                numbers[i][j] = sc.nextInt();
            }
        }
        // Print element of 2D array using nested for loops
        for (int i=0; i<rows; i++){
            for (int j=0; j<cols; j++){
                System.out.print(numbers[i][j]+" ");
            }
            System.out.println();
        }
    }
}
