package com.CoreJava1.Chapter3;

public class Constants01 {

    //定义一个常量
    public static final int S = 10;

    //另一种设置常量
    private static final int M1;
    private static final int M2;

    static{
        M1 = 10;
        M2 = 20;
    }

    public static void main(String[] args) {

        System.out.println(S);

        Constants01 c = new Constants01();
        c.printInt(M1);
        c.printInt(M2);
    }

    public void printInt(int i){
        System.out.println(i);
    }

}
