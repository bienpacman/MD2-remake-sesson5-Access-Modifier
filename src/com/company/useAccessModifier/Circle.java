package com.company.useAccessModifier;

import java.nio.channels.Pipe;

public class Circle {
    private double radius = 1.5;
    private String color = "red";

    double area = radius * radius * Math.PI ;

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public Double getArea(){
        return area;
    }
    public Circle(double radius, String color) {
        this.radius = radius;
        this.color = color;
    }
}
