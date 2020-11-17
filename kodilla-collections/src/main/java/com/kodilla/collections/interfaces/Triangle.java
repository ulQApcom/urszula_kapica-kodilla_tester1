package com.kodilla.collections.interfaces;

public class Triangle implements Shape{
    private double with;
    private double height;
    private double hypotenuse;

    public Triangle( double with, double height, double hypotenuse){
        this.with = with;
        this.height = height;
        this.hypotenuse = hypotenuse;
    }

    @Override
    public double getArea() {
        return with * height /2 ;
    }

    @Override
    public double getPerimeter() {
        return with + height + hypotenuse;
    }
}
