package com.test.singleton;

public class SingletonDemo1 {
    private SingletonDemo1(){};

    private  static final SingletonDemo1 sd = new SingletonDemo1();

    public static SingletonDemo1 getInstance(){
        return sd;
    }
}
