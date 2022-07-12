package com.company;

// Find if given number is even or odd using bitwise operators
import java.util.*;
import java.util.Scanner;

public class OddEven {
    public static void main(String[] args) {
        int num;
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number : ");
        num = sc.nextInt();

//        let   num = 5 then
//
//                1 0 1
//              & 0 0 1
//            ____________
//                0 0 1     =  decimal 1    that is odd therefor 5 is odd number

        if((num & 1) == 0){
            System.out.println("Given number is Even");
        }else{
            System.out.println("Given number is Odd");
        }
    }

}
