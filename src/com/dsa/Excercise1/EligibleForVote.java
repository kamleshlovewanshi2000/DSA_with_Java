package com.dsa.Excercise1;

import java.util.Scanner;

public class EligibleForVote {
    public static void votingSystem(int age){
        if(age>18){
            System.out.println("You are eligible for vote");
        }
        else {
            System.out.println("You are not eligible for vote");
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your age:");
        int age = sc.nextInt();
        votingSystem(age);
    }
}
