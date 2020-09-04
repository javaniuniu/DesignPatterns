package com.javaniuniu.strategy;

/**
 * @auther: javaniuniu
 * @date: 2020/9/4 8:43 AM
 */
@FunctionalInterface
public interface Comparator<T> {
    int compare(T o1,T o2);

    default void m() {
        System.out.println("m");
    }
}
