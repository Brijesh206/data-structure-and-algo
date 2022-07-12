package com.company;

// Swap two numbers using bitwise operator OR
// Swap two numbers without using third variable

import java.util.Scanner;

public class SwapNumbers {
    public static void main(String[] args) {
        int num1, num2;
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter two numbers : ");
        num1 = sc.nextInt();
        num2 = sc.nextInt();

        System.out.println("Before swapping : num1 = " + num1 + "  num2 = " + num2);
        num1 = num1 ^ num2;
        num2 = num1 ^ num2;
        num1 = num1 ^ num2;
        System.out.println("After swapping : num1 = " + num1 + "   num2 = " + num2);

    }
}
