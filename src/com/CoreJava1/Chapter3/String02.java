package com.CoreJava1.Chapter3;

public class String02 {
    public static void main(String[] args) {
        //多个字符串的拼接
        String str1 = "ni";
        String str2 = "hao";

        StringBuilder sb = new StringBuilder();
        sb.append(str1);
        sb.append(str2);
        System.out.println(sb.toString());

        /*
        StringBuilder类中其他重要的方法
        int length();
        在offset位置插入str并且返回this(调用者):
        StringBuilder insert(int offset, String str);
        StringBuilder delete(int startIndex, int endIndex);(注意右边取不到)
         */
    }
}
