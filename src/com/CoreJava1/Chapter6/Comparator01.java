package com.CoreJava1.Chapter6;

import java.util.Arrays;
import java.util.Comparator;

public class Comparator01 {
    public static void main(String[] args){
        String[] str = new String[4];
        str[0] = "apple";
        str[1] = "book";
        str[2] = "orange";
        str[3] = "pineapple";

        System.out.println(Arrays.toString(str));

        var lc = new LengthComparator();

        if ( lc.compare(str[0],str[1]) > 0){
            System.out.println("first更大");
        } else if ( lc.compare(str[0], str[1]) < 0 ) {
            System.out.println("second更大");
        } else System.out.println("相等");

        Arrays.sort(str, new LengthComparator());
        System.out.println(Arrays.toString(str));
    }
}

class LengthComparator implements Comparator<String> {
    public int compare(String first, String second){
        return first.length() - second.length();
    }
}
