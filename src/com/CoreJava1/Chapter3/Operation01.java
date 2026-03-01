package com.CoreJava1.Chapter3;

import java.util.Scanner;

public class Operation01 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();

        //取n二进制数的第四位（从右往左）
        int fourthBitFromRight = ( n & 0b1000 ) / 0b1000;
        System.out.println(fourthBitFromRight);

        //左移和右移
        int fourthBitFromRight2 = ( n & (1 << 3) ) >> 3;
        System.out.println(fourthBitFromRight2);

        //更加经典，推荐使用的方法
        int fourthBitFromRight3 = ( n >> 3 ) & 1;
        System.out.println(fourthBitFromRight3);

        //判断奇偶
        int judge = n & 1;
        String parityCheck = switch(judge) {
            case 1 -> "奇数";
            case 0 -> "偶数";
            default -> "?";
        };

        System.out.println(parityCheck);

    }
}
