package com.test.factory;

public class SimpleFactory {
    public static Car produceCar(String name){
        if("Benz".equals(name)){
            return new Benz();
        }else if("BYD".equals(name)){
            return new BYD();
        }else {
            return null;
        }
    }

    public static void main(String[] args){
        Car car1 = SimpleFactory.produceCar("Benz");
        Car car2 = SimpleFactory.produceCar("BYD");
        Car car3 = SimpleFactory.produceCar("??");

        car1.run();
        car2.run();
//        car3.run();
    }
}
