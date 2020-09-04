package com.javaniuniu.factorymethod;

public class SingletonCarFactory {
    static SingletonCarFactory scf = new SingletonCarFactory();
    private SingletonCarFactory(){}

    public static SingletonCarFactory getScf() {
        return scf;
    }

    public Moveable create() {
        System.out.println("a car created!");
        return new Car();
    }
}