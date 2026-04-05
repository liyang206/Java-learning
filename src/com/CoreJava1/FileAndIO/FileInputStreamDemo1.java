package com.CoreJava1.FileAndIO;

import java.io.FileInputStream;
import java.io.FileNotFoundException;

public class FileInputStreamDemo1 {
    public static void main(String[] args) throws Exception {
        FileInputStream is = new FileInputStream("src\\com\\demo01.txt");
        byte[] b = new byte[3];
        int len;
        while ((len = is.read(b)) != -1) {
            System.out.print(new String(b, 0, len));  //从索引为零的位置开始，读取到几个就倒出几个，否则最后数组中装的应该是g66
        }
        //读取汉字还是可能会乱码

        //当然，可以使用readAllBytes一次性读完
    }
}