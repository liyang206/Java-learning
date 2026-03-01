package com.CoreJava1.Chapter3;

public class String01 {
    public static void main(String[] args) {
        String str = "Hello";
        System.out.println(str);

        //substring()截取的范围左闭右开，同时包含零索引
        //范围左值减去右值就是截取字符串的长度
        String str1 = str.substring(0, 2);
        System.out.println(str1);

        //拼接
        String name = "yang";
        int age = 18;
        System.out.println(name+age);

        String str2 = "ni ";
        String str3 = "hao ";
        String str4 = str2+str3+"吗";
        System.out.println("The integrated ues : "+str4);

        //有间隔的拼接，join()
        String str5 = String.join( "/", "S", "M", "L");
        System.out.println(str5);

        //有重复的拼接
        String str6 = name.repeat(5);
        System.out.println(str6);

    }
}
