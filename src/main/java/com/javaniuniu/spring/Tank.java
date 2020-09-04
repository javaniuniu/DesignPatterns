package com.javaniuniu.spring;

import java.util.Random;

/**
 * @auther: javaniuniu
 * @date: 2020/9/4 3:47 PM
 */
public class Tank {
    Driver driver;

    /**
     * 模拟坦克移动了一段儿时间
     */
    public void move() {
        System.out.println("Tank moving claclacla...");
        try {
            Thread.sleep(new Random().nextInt(10000));
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

}
