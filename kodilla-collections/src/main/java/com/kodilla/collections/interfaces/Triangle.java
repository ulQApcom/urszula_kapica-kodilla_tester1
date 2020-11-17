package com.kodilla.collections.interfaces;

import java.util.Objects;

public class Triangle implements Shape{
    private double with;
    private double height;
    private double hypotenuse;

    @Override
    public String toString() {
        return "Triangle{" +
                "with=" + with +
                ", height=" + height +
                ", hypotenuse=" + hypotenuse +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Triangle triangle = (Triangle) o;
        return Double.compare(triangle.with, with) == 0 &&
                Double.compare(triangle.height, height) == 0 &&
                Double.compare(triangle.hypotenuse, hypotenuse) == 0;
    }

    @Override
    public int hashCode() {
        return Objects.hash(with, height, hypotenuse);
    }

    public Triangle(double with, double height, double hypotenuse){
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
