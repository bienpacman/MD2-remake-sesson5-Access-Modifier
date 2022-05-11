package com.company.useAccessModifier;

public class TestCircle {
    public static void main(String[] args) {

        Circle circle = new Circle(1.0,"red");
        System.out.println(circle.getRadius());
        System.out.println(circle.getArea());
    }
}
