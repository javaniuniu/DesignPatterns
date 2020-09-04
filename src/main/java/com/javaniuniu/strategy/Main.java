package com.javaniuniu.strategy;

import java.util.Arrays;

/**
 * @auther: javaniuniu
 * @date: 2020/9/4 8:33 AM
 */
public class Main {
    public static void main(String[] args) {
        Cat[] a = {new Cat(3, 3), new Cat(5, 5), new Cat(1, 1)};
//        Dog[] a = {new Dog(3), new Dog(5), new Dog(1)};
        Sorter<Cat> sorter = new Sorter<>();
        sorter.sort(a, (cat, cat2) -> cat.compareTo(cat2));

        System.out.println(Arrays.toString(a));

    }
}
