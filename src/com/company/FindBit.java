package com.company;

// Find the bit at the given position

import java.util.Scanner;

public class FindBit {
    public void findBit(int number, int i){
        int mask = 1 << i;
        int res = number & mask;
        if(res == 0){
            System.out.println(i + " bit is : 0" );
        }else{
            System.out.println(i + " bit is : 1");
        }
    }
    public static void main(String[] args) {
        int num, i;
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number and the position of the bit : ");
        num = sc.nextInt();
        i = sc.nextInt();

        FindBit obj = new FindBit();
        obj.findBit(num, i);
    }

}
