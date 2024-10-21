package com.pichuzhkin.threedimensionalshapes;

public class Cube {
    private double edgeLength;


    public Cube(double edgeLength) {
        if (edgeLength <= 0) {
            throw new IllegalArgumentException("Длина ребра должна быть положительным числом.");
        }
        this.edgeLength = edgeLength;
    }


    public double getVolume() {
        return Math.pow(edgeLength, 3);
    }

    public double getSurfaceArea() {
        return 6 * Math.pow(edgeLength, 2);
    }

    public double getEdgeLength() {
        return edgeLength;
    }

    public void setEdgeLength(double edgeLength) {
        if (edgeLength <= 0) {
            throw new IllegalArgumentException("Длина ребра должна быть положительным числом.");
        }
        this.edgeLength = edgeLength;
    }

    @Override
    public String toString() {
        return "Куб с длиной ребра " + edgeLength +
                "\nОбъем: " + getVolume() +
                "\nПлощадь поверхности: " + getSurfaceArea();
    }
}

