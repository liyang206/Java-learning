package com.CoreJava1.Chapter4;

import java.time.DayOfWeek;
import java.time.LocalDate;

public class calendarPrint {
    public static void main(String[] args) {
        //获取当前的时间，并记录
        LocalDate date = LocalDate.now();
        int month = date.getMonthValue();
        int day = date.getDayOfMonth();

        //将date设置为本月的第一天
        date = date.minusDays(day-1);

        //获取本月第一天的星期
        DayOfWeek dayOfWeek = date.getDayOfWeek();
        int week = dayOfWeek.getValue();

        //打印calendar前面的空格（本月第一天前）
        for ( int i = 0 ; i < week ; i++ ) System.out.print("    ");

        //打印日期
        while ( date.getMonthValue() == month ) {
            System.out.printf("%3d", date.getDayOfMonth());

            if (date.getDayOfMonth() == day) {
                System.out.print("*");
            } else System.out.print("  ");

            date = date.plusDays(1);

            if (date.getDayOfWeek().getValue() == 1) {
                System.out.println();
            }
        }
        if (date.getDayOfWeek().getValue() != 1) System.out.println();
    }
}
