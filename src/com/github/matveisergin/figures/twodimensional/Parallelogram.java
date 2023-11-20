package com.github.matveisergin.figures.twodimensional;

import com.github.matveisergin.figures.Figure;
import com.github.matveisergin.figures.methods.MethodsForPoligons;
import com.github.matveisergin.figures.Point;

import java.util.List;

public class Parallelogram extends Figure {
    public Parallelogram(List<Point> point) {
        super(point);
    }

    @Override
    public boolean validate() {
        if (MethodsForPoligons.isParallelogram(points)) {
            System.out.println("The figure is valid");
            return true;
        } else {
            System.out.println("The figure is invalid");
            return false;
        }
    }

    @Override
    public double getArea() {
        return MethodsForPoligons.getArea(points);
    }

    @Override
    public double getPerimeter() {
        return MethodsForPoligons.getPerimeter(points);
    }
}
