package com.CoreJava1.Chapter3;

import java.util.Scanner;

public class Switch01 {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        int seasonCode = scan.nextInt();

        String seasonName = switch (seasonCode) {
            case 1 -> "Spring";
            case 2 -> "Summer";
            case 3 -> "Fall";
            case 4 -> "Winter";
            default -> "???";
        };

        System.out.println(seasonName);


        //多个标签
        int sumLetters = switch (seasonName){
            case "Spring", "Summer", "Fall" -> 6;
            case "Winter" -> 4;
            default -> -1;
        };

        System.out.println(sumLetters);


        //使用枚举常量
        enum Size {
            SMALL, MEDIUM, LARGE;
        };

        Size itemSize = Size.valueOf(scan.next());

        String label = switch (itemSize){
            case SMALL -> "S";  //这里就不需要使用Size.SMALL了
            case MEDIUM -> "M";
            case LARGE -> "L";
            default -> "?";
        };

        System.out.println(label);

    }
}
