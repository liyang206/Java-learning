package com.CoreJava1.Charter9;

import java.util.Comparator;
import java.util.Set;
import java.util.TreeSet;

public class treeSet01 {
    public static void main(String[] args) {
        Set<Item> set = new TreeSet<>();
        set.add(new Item("Toaster",1234));
        set.add(new Item("Widget",4562));
        set.add(new Item("Modem",9912));
        System.out.println(set);

        Set<Item> set1 = new TreeSet<>(Comparator.comparing(Item::getDescription));
        set1.addAll(set);
        System.out.println(set1);
    }
}
