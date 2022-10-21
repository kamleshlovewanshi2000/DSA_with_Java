package com.dsa.Excercise1;
import java.util.*;
public class EnterNumTillUserWant {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = 0,
                countPos = 0,
                countNeg = 0,
                countZeros = 0;
        char choice;

        // Using do while condition;
        do{
            System.out.println("Enter the Number:");
            num = sc.nextInt();
            if (num>0){
                countPos++;
            }
            else if(num<0){
                countNeg++;
            }
            else{
                countZeros++;
            }
            System.out.print("Do you want to continue y/n? :");
            choice = sc.next().charAt(0);
        }while (choice=='y' || choice=='Y');

        // Print Result
        System.out.println("Positive Numbers: "+ countPos);
        System.out.println("Negative Numbers: "+ countNeg);
        System.out.println("Zeros Numbers: "+ countZeros);
    }
}
