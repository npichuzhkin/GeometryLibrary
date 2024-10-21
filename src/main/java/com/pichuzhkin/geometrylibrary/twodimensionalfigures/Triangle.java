package com.pichuzhkin.geometrylibrary.twodimensionalfigures;

public class Triangle {
    private double a;
    private double b;
    private double c;

    public Triangle (double a, double b, double c){
        this.a = a;
        this.b = b;
        this.c = c;
    }

    public double getArea() {
        double semiPerimeter = getPerimeter() / 2;
        return Math.sqrt(semiPerimeter * (semiPerimeter - a) * (semiPerimeter - b) * (semiPerimeter - c));
    }


    public double getPerimeter() {
        return a+b+c;
    }

    public double getA() {
        return a;
    }

    public void setA(double a) {
        this.a = a;
    }

    public double getB() {
        return b;
    }

    public void setB(double b) {
        this.b = b;
    }

    public double getC() {
        return c;
    }

    public void setC(double c) {
        this.c = c;
    }

    @Override
    public String toString() {
        return "Triangle{" +
                "a=" + a +
                ", b=" + b +
                ", c=" + c +
                '}';
    }
}
