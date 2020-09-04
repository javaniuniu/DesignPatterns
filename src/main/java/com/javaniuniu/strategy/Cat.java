package com.javaniuniu.strategy;

/**
 * @auther: javaniuniu
 * @date: 2020/9/4 8:33 AM
 */
public class Cat {
    int weight, height;

    public Cat(int weight, int height) {
        this.weight = weight;
        this.height = height;
    }
    public int compareTo(Cat cat) {
        if (this.weight < cat.weight) return -1;
        if (this.weight > cat.weight) return 1;
        else return 0;
    }

    @Override
    public String toString() {
        return "Cat{" +
                "weight=" + weight +
                ", height=" + height +
                '}';
    }
}
