package com.github.matveisergin.figures.twodimensional;

import com.github.matveisergin.figures.Figure;
import com.github.matveisergin.figures.methods.MethodsForPoligons;
import com.github.matveisergin.figures.Point;

import java.util.List;

public class Polygon extends Figure {
    public Polygon(List<Point> point) {
        super(point);
    }

    @Override
    public double getArea() {
        return MethodsForPoligons.getArea(points);
    }

    @Override
    public boolean validate() {
        System.out.println("The figure is valid");
        return true;
    }

    @Override
    public double getPerimeter() {
        return MethodsForPoligons.getPerimeter(points);
    }
}
