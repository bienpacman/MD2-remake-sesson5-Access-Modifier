package com.company.statticProperty;

public class TestStaticProperty {
    public static void main(String[] args) {
        Car car1 = new Car("Maybach","V12");
        System.out.println(Car.getNumberOfCars());
        Car car2 = new Car("Audi","V6 3.0L");
        System.out.println(Car.getNumberOfCars());
    }
}
