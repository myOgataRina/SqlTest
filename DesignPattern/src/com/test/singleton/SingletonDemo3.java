package com.test.singleton;

public class SingletonDemo3 {
    private static class SingletonClass{
        private static final SingletonDemo3 instance = new SingletonDemo3();
    }

    public SingletonDemo3 getInstance(){
        return SingletonClass.instance;
    }

    private SingletonDemo3(){};
}
