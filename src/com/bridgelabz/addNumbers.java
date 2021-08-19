package com.bridgelabz;

import java.util.Scanner;

public class addNumbers {
    public static void main(String[] args) {

        int num1, num2, add;
        Scanner s = new Scanner(System.in);

        System.out.print("Enter first number: ");
        num1 = s.nextInt();

        System.out.print("Enter second number: ");
        num2 = s.nextInt();

        s.close();
        add = num1 + num2;

        System.out.println("Sum of two numbers are: " + add);
    }
}