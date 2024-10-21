package com.pichuzhkin.threedimensionalshapes;

public class Sphere {
    private double radius;
    private double centerX;
    private double centerY;
    private double centerZ;

    public Sphere(double radius) {
        if (radius <= 0) {
            throw new IllegalArgumentException("Радиус должен быть положительным числом.");
        }
        this.radius = radius;
    }

    public double getVolume() {
        return (4.0 / 3.0) * Math.PI * Math.pow(radius, 3);
    }

    public double getSurfaceArea() {
        return 4 * Math.PI * Math.pow(radius, 2);
    }

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        if (radius <= 0) {
            throw new IllegalArgumentException("Радиус должен быть положительным числом.");
        }
        this.radius = radius;
    }

    public boolean isPointInside(double x, double y, double z) {
        double distance = Math.sqrt(Math.pow(x - centerX, 2) + Math.pow(y - centerY, 2) + Math.pow(z - centerZ, 2));
        return distance <= radius;
    }

    @Override
    public String toString() {
        return "Сфера с радиусом " + radius +
                "\nОбъем: " + getVolume() +
                "\nПлощадь поверхности: " + getSurfaceArea();
    }
}

