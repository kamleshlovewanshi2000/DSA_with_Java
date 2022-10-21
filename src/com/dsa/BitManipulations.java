package com.dsa;
import java.util.*;

public class BitManipulations {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        // Operation 1: Get (means to check bit is zero or one)
        // Get the 3rd bit(position = 2) of a number n. (n = 0101)
//        int n = 5;  // 0101
//        int pos = 3;
//        int bitMask = 1<<pos;   // 2=> 0100  ;   3=> 1000
//        System.out.println(bitMask);
//
//        if((bitMask & n)==0){  // 2=> (0100 & 0101 = 0100) 3=> ( 1000 & 0101 = 0000)
//            System.out.println("Bit was Zero");
//        }else{
//            System.out.println("Bit was One");
//        }

        // Operation 2: Set (means to make 1 for given position of no.)
        // Set the 2nd bit(position=1) of a number m. (n=0101)

//        int n = 5;
//        int pos = 1;
//        int bitMask = 1<<pos;  // 1=> 0001<<1 = 0010(2)
//        int newNumber = bitMask | n;   // 0010 | 0101 = 0111(7)
//        System.out.println(newNumber);

        // Operation 3:Clear  (means to make 0 for given position of no.)
        // Clear the 3rd bit (Position = 2) of a number n. (n=0101)
//        int n = 5;
//        int pos = 2;
//        int bitMask = 1<<pos;   // 1=> 0001<<2 = 0100
//        int newNumber = (~(bitMask) & n); // ~(0100) & 0101 => 1011 & 0101 = 0001
//        System.out.println(newNumber);

        // Operation 3:Update: we use 2 operation: set and clear.
        // Update the 2nd bit (Position = 1) of a number n to 1. (n=0101)
        int n = 5;  //0101
        int pos = 1;
        int bitMask = 1<<pos;   //0001<<1 = 0010
        System.out.println("Plese choose operation: \n1: Set\n0: Clear");
        int operation = sc.nextInt();

        if(operation==1){
            // Set
            int newValue = bitMask | n;   // 0010 | 0101 = 0111 (7)
            System.out.println(newValue);
        }else if(operation==0) {
        int newBitMask = ~bitMask;  // ~0010 = 1101
            int value = newBitMask & n;   // 1101 & 0101 = 0101 (5)
            System.out.println(value);
        }else {
            System.out.println("Invalid operation");
        }
    }
}
