package com.dsa.Array;
import java.util.*;

public class SearchIn2DArray {
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
        System.out.println("Enter a value which index you find in matrix:");
        int key = sc.nextInt();
        // search an index of a value
        for (int i=0; i<rows; i++){
            for (int j=0; j<cols; j++){
                if(numbers[i][j]==key){
                    System.out.println("key found at location ("+i+","+j+")");
                }
            }
        }
    }
}
