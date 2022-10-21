package com.dsa.Excercise1;
import java.util.*;

public class Average {
    public static float avarage(int a, int b, int c){
        return (a+b+c)/(3.0f);
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter three numbers: ");
        int x = sc.nextInt();
        int y = sc.nextInt();
        int z = sc.nextInt();
        System.out.println(avarage(x,y,z));
    }
}
