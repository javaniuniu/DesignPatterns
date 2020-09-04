package com.javaniuniu.strategy;

/**
 * @auther: javaniuniu
 * @date: 2020/9/4 8:44 AM
 */
// 继承比较类，根据身高比较
public class CatHeightComparator implements Comparator<Cat> {
    @Override
    public int compare(Cat o1, Cat o2) {
        if(o1.height > o2.height) return -1;
        else if (o1.height < o2.height) return 1;
        else return 0;
    }
}
