package com.CoreJava1.Chapter3;

import java.util.Arrays;
import java.util.Scanner;

public class ArraySort {
    public static void main(String[] args) {
        //实现draw随机的数字组合
        //随机数字的最大值
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        //需要抽取的数量
        int k = sc.nextInt();

        //初始化数组
        int[] numbers = new int[n];
        for (int i = 0; i < numbers.length; i++) {
            numbers[i] = i+1;
        }

        //抽取的数字
        int[] result = new int[k];

        //随机生成数字
        /*
        知识点：Math.random()会生成[0,1)的小数，用n乘以这个小数，就能得到[0,n-1]的数（这里结果取整）
         */
        int randomIndex;
        for (int i = 0; i < k; i++) {
            randomIndex = (int)( Math.random() * n );
            result[i] = numbers[randomIndex];
            numbers[randomIndex] = numbers[n-1];  //防止出现重复的数字
            n--;
        }

        Arrays.sort(result);

        for ( int r : result ) {
            System.out.println(r);
        }
    }
}
