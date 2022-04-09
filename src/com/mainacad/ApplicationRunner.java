package com.mainacad;

import com.mainacad.abs.Shape;
import com.mainacad.circle.Circle;
import com.mainacad.rectangle.Rectangle;
import com.mainacad.square.Square;
import com.mainacad.trapezoid.Trapezoid;
import com.mainacad.triangle.Triangle;

public class ApplicationRunner {

    public static void main(String[] args) {
        Triangle triangle1 = new Triangle();
        triangle1.setBase(15);
        triangle1.setHeight(20);

        Circle circle1 = new Circle();
        circle1.setRadius(10);

        Square square1 = new Square();
        square1.setSide(28);

        Shape maxShape;

        if (circle1.getArea() > square1.getArea()) {
            maxShape = circle1;
        } else {
            maxShape = square1;
        }

        if (maxShape.getArea() < triangle1.getArea() ) {
            maxShape = triangle1;
        }
        System.out.println("Max shape is " + maxShape.getClass().getSimpleName() + " and has area " + maxShape.getArea());

        Trapezoid trapezoid2 = new Trapezoid();
        trapezoid2.setBase1(20);
        trapezoid2.setBase2(30);
        trapezoid2.setHeight(40);

        Rectangle rectangle2 = new Rectangle();
        rectangle2.setSide1(20);
        rectangle2.setSide2(40);

        Circle circle2 = new Circle();
        circle2.setRadius(20);

        Square square2 = new Square();
        square2.setSide(50);

        Triangle triangle2 = new Triangle();
        triangle2.setBase(30);
        triangle2.setHeight(40);

        Shape minShape;

        if (trapezoid2.getArea() > rectangle2.getArea()){
            minShape = rectangle2;
        } else {
            minShape = trapezoid2;
        }

        if (minShape.getArea() > square2.getArea()) {
            minShape = square2;
        }
        if (circle2.getArea() < minShape.getArea()) {
            minShape = circle2;
        }
        if (triangle2.getArea() < minShape.getArea()) {
            minShape = triangle2;
        }

        System.out.println("Min shape is " + minShape.getClass().getSimpleName() + " and has area " + minShape.getArea());






































//        Square square = new Square();
//        square.setSide(10.0);
//        square.setName("Square");
//
//        System.out.println("Square with side " + square.getSide() + " has area " + square.getArea());
//
//        Circle circle = new Circle();
//        circle.setRadius(10.0);
//
//        System.out.println("Circle with radius " + circle.getRadius() + " has area " + circle.getArea());
//
//        Triangle triangle = new Triangle();
//        triangle.setBase(10.0);
//        triangle.setHeight(12.0);
//
//        System.out.println("Triangle with base " + triangle.getBase() + " and height " + triangle.getHeight() + " has area " + triangle.getArea());
//
//        Rectangle rectangle = new Rectangle();
//        rectangle.setSide1(20.0);
//        rectangle.setSide2(22.0);
//
//        System.out.println("Rectangle with side1 " + rectangle.getSide1() + " and side2 " + rectangle.getSide2() + " has area " + rectangle.getArea());
//
//        Trapezoid trapezoid2 = new Trapezoid();
//        trapezoid2.setBase1(10.0);
//        trapezoid2.setBase2(12.0);
//        trapezoid2.setHeight(14.0);
//
//        System.out.println("Trapezoid with base1 " + trapezoid2.getBase1() + " and base2 " + trapezoid2.getBase1() + " and height " + trapezoid2.getHeight()
//                + " has area " +trapezoid2.getArea());
//
//
    }


}
