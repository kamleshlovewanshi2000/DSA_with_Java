package com.dsa.Array;

import java.util.Scanner;

public class SearchAnElement {
    public static void search(int arr[], int key){
        // Key search using linear search
        for(int i=0; i< arr.length;i++){
            if(arr[i]==key){
                System.out.println(key+" found at index = "+i);
            }
        }
    }

    // Driver code:
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        // size of array
        System.out.println("Enter the size of array :");
        int size = sc.nextInt();
        // Create an array
        int arr[] = new int[size];

        System.out.println("Enter array elements of size "+size+" :");
        // Input array element
        for(int i=0; i<size; i++){
            arr[i] = sc.nextInt();
        }
        for (int i=0; i<size; i++){
            System.out.print(arr[i]+" ");
        }
        System.out.println("\nEnter a value which index you want to search: ");
        int key = sc.nextInt();

        // function called
        search(arr,key);
    }
}
