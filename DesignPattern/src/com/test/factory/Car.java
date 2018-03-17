package com.test.factory;

public class Car {
    private String name;

    public Car(){
        name = "Car";
    };
    public Car(String name){
        this.name = name;
    };

    void run(){
        System.out.println(name + " is running!");
    }
}
