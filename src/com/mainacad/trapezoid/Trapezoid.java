package com.mainacad.trapezoid;

import com.mainacad.abs.AbstractShape;

public class Trapezoid extends AbstractShape {

    private double base1;
    private double base2;
    private double height;

    public double getBase1() {
        return base1;
    }

    public void setBase1(double base1) {
        this.base1 = base1;
    }

    public double getBase2() {
        return base2;
    }

    public void setBase2(double base2) {
        this.base2 = base2;
    }

    public double getHeight() {
        return height;
    }

    public void setHeight(double height) {
        this.height = height;
    }
    public double getArea() {
        return (base1 + base2) / 2 * height;
    }
}
