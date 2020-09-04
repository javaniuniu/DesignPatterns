package com.javaniuniu.factorymethod;

/**
 * @auther: javaniuniu
 * @date: 2020/9/4 11:13 AM
 * 新建交通工具可以使用继承
 * 控制交通工具的生产过程
 *
 * 任意定制交通工具  通过 继承实现 Moveable
 * 任意生产交通工具  通过 对应工厂实现，返回值为共有的 Moveable
 *
 */
public class Main {
    public static void main(String[] args) {
//        Moveable m = new CarFactory().create(); // 严格来说 整个工厂要使用单例模式
        Moveable m = SingletonCarFactory.getScf().create();

        m.go();
    }
}
