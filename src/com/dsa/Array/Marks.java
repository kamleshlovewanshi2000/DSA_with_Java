package com.dsa.Array;
import java.util.*;

public class Marks {
    public static void main(String[] args) {
       /*
        int marks[] = new int[3];  // array size is 3;
        // insert array element;
        marks[0] = 97;  //physic
        marks[1] = 98; // maths
        marks[2] = 95; // chemistry

        //access array element
//        System.out.println(marks[0]);
//        System.out.println(marks[1]);
//        System.out.println(marks[2]);

        // Access array element using for loop
        for(int i=0; i<marks.length;i++){
            System.out.println(marks[i]);
        }

        */
        Scanner sc = new Scanner(System.in);
        // Take size from user
        int size = sc.nextInt();
        // Define an array
        int arr[] = new int[size];
        // Take elements from user
        for(int i=0; i<size; i++){
            arr[i] = sc.nextInt();
        }
        // Print array elements
        for(int i=0; i<size; i++){
            System.out.println(arr[i]);
        }
    }
}
