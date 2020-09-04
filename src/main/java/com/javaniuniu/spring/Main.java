package com.javaniuniu.spring;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * @auther: javaniuniu
 * @date: 2020/9/4 3:51 PM
 */
public class Main {
    public static void main(String[] args) {
        ApplicationContext context = new ClassPathXmlApplicationContext("app.xml");
//        Driver d = (Driver) context.getBean("d");
        Tank t = (Tank) context.getBean("t");
        t.move();
    }
}
