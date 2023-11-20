package com.github.matveisergin.figures.twodimensional;

import com.github.matveisergin.figures.constants.Consts;
import com.github.matveisergin.figures.Figure;
import com.github.matveisergin.figures.methods.MethodsForPoligons;
import com.github.matveisergin.figures.Point;

import java.util.List;

public class Rectangle extends Figure {
    public Rectangle(List<Point> point) {
        super(point);
    }

    @Override
    public boolean validate() {
        if (points.size() == Consts.NUMBER_OF_POINTS_FOUR) {
            boolean isValid = true;
            for (int i = 0; i < Consts.NUMBER_OF_POINTS_FOUR; i++) {
                isValid = isValid && (points.get(i).getX() == points.get(i + 1).getX()) || (points.get(i).getY() == points.get(i + 1).getY());
            }
            if (isValid) {
                System.out.println("The figure is valid");
                return true;
            }
        }
        System.out.println("The figure is invalid");
        return false;
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
