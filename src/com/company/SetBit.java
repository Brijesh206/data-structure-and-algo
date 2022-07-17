package com.company;

// Set ith bit of the given number and get new number

import java.util.Scanner;

public class SetBit {
    public void setBit(int number, int i){
        int mask = 1 << i;
        int result = number | mask;
        System.out.println("New number is : " + result);
    }

    public static void main(String[] args) {
        int num, i;
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number and the position of the bit : ");
        num = sc.nextInt();
        i = sc.nextInt();

        SetBit obj = new SetBit();
        obj.setBit(num, i);
    }
}
