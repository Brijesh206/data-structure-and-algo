package com.company;

// Find the number of bits in the given number

import java.util.Scanner;
import java.lang.*;

public class NumberOfBits {
    public static void main(String[] args) {
        int num, count ;
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the number");
        num = sc.nextInt();
        count = (int) (Math.log(num) / Math.log(2)) + 1;
        System.out.println(count);
    }
}
