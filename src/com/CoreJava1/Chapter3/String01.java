package com.CoreJava1.Chapter3;

import java.util.Scanner;

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
		
		
		//空串和Null串(以下均为演示代码)
		//检验空串
		/*
		if ( name.length() == 0 ){
			System.out.println("name是一个空串");
		}
		if ( str.equals("") ){
			System.out.println("str是一个空串");
		}
		
		//检验Null串
		if ( str1 == null ){
			System.out.println("str1是一个Null串");
		}
		*/

        //获取字符串的真实长度
        //注意codePointCount和length是不一样的
        //length可能会因为emoji的出现略大
        int cpCount = str.codePointCount(0, str.length());
        System.out.println(cpCount);

        //获取第i个码点（注意，这里的i表示的是索引）
        Scanner sc = new Scanner(System.in);
        int i = sc.nextInt() % cpCount;
        int index = str.offsetByCodePoints(0, i);  //转换为char级别对应的索引（因为可能一个码点有两个char）
        int cp =  str.codePointAt(index);

        //将第i个码点转换为字符
        String str7 = Character.toString(cp);  //如果是Character.toChars(codePointCount),那么返回的就是char[]
        System.out.println(str7);

        //获取字符串
        StringBuffer sb = new StringBuffer();
        for ( int j = 0; j < cpCount ; j++ ) {
            sb.appendCodePoint(str.codePointAt(j));  //这里底层其实依然是利用sb.append( Character.toChars(codePointCount) )
        }
        System.out.println(sb);
        System.out.println(sb.toString());
    }
}
