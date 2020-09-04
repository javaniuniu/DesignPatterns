package com.javaniuniu.abstractfactory;

/**
 * @auther: javaniuniu
 * @date: 2020/9/4 11:13 AM
 * 灵活扩展产品族 比如司机开车 开枪 吃面包 魔法师骑烧包 魔法棒 吃蘑菇
 * 方便在产品上的扩展
 *
 * 形容词用接口，名称用抽象类
 *
 * 1。在产品单一的纬度上扩展  缺点：在产品族上扩展不方便
 * 2。在产品族的纬度上扩展 缺点：当在某个产品上添加新方法，所有的族都需要做相应的改变
 *
 */
// 抽象工厂
public class Main {
    public static void main(String[] args) {
        AbastractFactory f = new ModernFactory();

        Vehicle c = f.createVehicle();
        c.go();
        Weapon w = f.createWeapon();
        w.shoot();
        Food b = f.createFood();
        b.printName();
    }
}
