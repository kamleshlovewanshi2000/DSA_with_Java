package com.dsa;

public class Loops {
    public static void main(String[] args) {
        // Print number 0 to 10 using for loop
        for(int i=0; i<11; i++){
//            System.out.println(i);
            System.out.print(i+" ");
        }
        System.out.println();
        // Print number 0 to 10 using while loop
        int i=0;
        while(i<11){
            System.out.print(i+" ");
            i++;
        }
        System.out.println();
        // demonstrate the do while loop
        int j=0;
        do {
            System.out.println(j);
            j++;
        } while(j<11);
    }
}
