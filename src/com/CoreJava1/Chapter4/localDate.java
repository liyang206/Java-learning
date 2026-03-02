package com.CoreJava1.Chapter4;


import java.time.LocalDate;

public class localDate {
    public static void main(String[] args) {
        //注意需要使用静态方法工厂
        LocalDate ld = LocalDate.now();
        LocalDate newYearEve = LocalDate.of(1999, 12, 31);

        System.out.println(ld);
        System.out.println(newYearEve);

        //获取年月日
        int year = newYearEve.getYear();
        int month = newYearEve.getMonthValue();
        int day = newYearEve.getDayOfMonth();

        System.out.println(year);
        System.out.println(month);
        System.out.println(day);

        //一个LocalDate调用plusDays()方法，加上时间
        LocalDate aThousandDaysLater = newYearEve.plusDays(1000);  //这里返回的是一个新的LocalDate对象
        year = aThousandDaysLater.getYear();
        month = aThousandDaysLater.getMonthValue();
        day = aThousandDaysLater.getDayOfMonth();

        System.out.println(year);
        System.out.println(month);
        System.out.println(day);
    }
}
