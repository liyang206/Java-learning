package com.CoreJava1.Charter9;

import java.util.ArrayList;
import java.util.Iterator;

public class iterator01 {
    public static void main(String[] args) {
        ArrayList<String> list = new ArrayList<>();
        list.add("a");
        list.add("b");
        list.add("c");
        list.add("d");

        Iterator<String> it = list.iterator();
        while (it.hasNext()) {
            System.out.println(it.next());
        }

        for ( String element : list ) {
            System.out.println(element);
        }

        //当然了，注意这里的it迭代器已经遍历到末尾了，所以不会再次打印了。此处只是演示一下
        it.forEachRemaining(System.out::println);

        //删除第一个元素
        Iterator<String> it2 = list.iterator();
        it2.next();
        it2.remove();
        for (String element : list){
            System.out.println(element);
        }
    }
}
