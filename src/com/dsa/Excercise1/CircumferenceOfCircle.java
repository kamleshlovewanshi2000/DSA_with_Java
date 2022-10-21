package com.dsa.Excercise1;
import java.util.*;
public class CircumferenceOfCircle {
    public static float circumferenceOfCircle(float r){
        float pi = (float) 3.14;
        float C = 2*pi*r;
        return C;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        float r = sc.nextFloat();
        System.out.println("C = "+circumferenceOfCircle(r));
    }
}
