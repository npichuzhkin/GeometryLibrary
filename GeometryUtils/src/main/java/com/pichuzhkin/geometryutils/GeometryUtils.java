package com.pichuzhkin.geometryutils;

import com.pichuzhkin.geometrylibrary.twodimensionalfigures.Circle;
import com.pichuzhkin.geometrylibrary.twodimensionalfigures.Rectangle;
import com.pichuzhkin.geometrylibrary.twodimensionalfigures.Triangle;

public class GeometryUtils {
    public static boolean isLargerThan(Rectangle f1, Rectangle f2){
        return f1.getArea() > f2.getArea();
    }
    public static boolean isLargerThan(Triangle f1, Triangle f2){
        return f1.getArea() > f2.getArea();
    }
    public static boolean isLargerThan(Circle f1, Circle f2){
        return f1.getArea() > f2.getArea();
    }

    public static boolean isLessThan(Rectangle f1, Rectangle f2){
        return f1.getArea() < f2.getArea();
    }
    public static boolean isLessThan(Triangle f1, Triangle f2){
        return f1.getArea() < f2.getArea();
    }
    public static boolean isLessThan(Circle f1, Circle f2){
        return f1.getArea() < f2.getArea();
    }

}
