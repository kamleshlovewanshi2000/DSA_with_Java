package com.dsa;

import java.util.Scanner;

public class Calculator {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter number 1:");
        int num1 = sc.nextInt();
        System.out.println("Enter number 2:");
        int num2 = sc.nextInt();

        System.out.println("Enter calculator functions: 1: +, 2: -, 3: *, 4: /, 5: %");
        int fun = sc.nextInt();
        switch (fun){
            case 1:
                int sum = num1+num2;
                System.out.println("Sum:"+sum);
                break;
            case 2:
                 int sub = num1-num2;
                System.out.println("Subtraction:"+sub);
                break;
            case 3:
                int mul = num1*num2;
                System.out.println("Multiplication:"+mul);
                break;
            case 4:
                int div = num1/num2;
                System.out.println("Division:"+div);
                break;
            case 5:
                int mod = num1%num2;
                System.out.println("Modulo:"+mod);
                break;
            default:
                System.out.println("Invalid operation");
        }
    }
}
