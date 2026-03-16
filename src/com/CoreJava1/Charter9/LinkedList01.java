package com.CoreJava1.Charter9;

import java.util.Arrays;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.ListIterator;

public class LinkedList01 {
    public static void main(String[] args) {
        var a = new LinkedList<String>(Arrays.asList("Amy", "Carl", "Erica"));
        var b = new LinkedList<String>();
        b.add("Bob");
        b.add("Doug");
        b.add("Frances");
        b.add("Gloria");

        ListIterator<String> ItrA = a.listIterator();
        for (String s : b) {
            if (ItrA.hasNext()) ItrA.next();
            ItrA.add(s);
        }

        System.out.println(a);

        Iterator<String> ItrB = b.iterator();
        while (ItrB.hasNext()) {
            ItrB.next();
            if (ItrB.hasNext())  ItrB.next();
            ItrB.remove();
        }

        System.out.println(b);

        a.removeAll(b);

        System.out.println(a);
    }
}
