package com.mainacad;

import com.mainacad.circle.Circle;
import com.mainacad.square.Square;
import com.mainacad.triangle.Triangle;

public class ApplicationRunner {

    public static void main(String[] args) {

        Square square = new Square();
        square.setSide(10.0);

        System.out.println("Square with side " + square.getSide() + " has area " + square.getArea());

        Circle circle = new Circle();
        circle.setRadius(10.0);

        System.out.println("Circle with radius " + circle.getRadius() + " has area " + circle.getArea());

        Triangle triangle = new Triangle();
        triangle.setBase(10.0);
        triangle.setHeight(12.0);

        System.out.println("Triangle with base " + triangle.getBase() + " and height " + triangle.getHeight() + " has area " + triangle.getArea());






    }


}
