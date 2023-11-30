package main.java.com.github.matveisergin.figures.twodimensional;

import main.java.com.github.matveisergin.figures.Figure;
import main.java.com.github.matveisergin.figures.methods.MethodsForPoligons;
import main.java.com.github.matveisergin.figures.Point;

import java.util.List;

public class Triangle extends Figure {
    private final int x1 = points.get(0).getX();
    private final int y1 = points.get(0).getY();
    private final int x2 = points.get(1).getX();
    private final int y2 = points.get(1).getY();
    private final int x3 = points.get(2).getX();
    private final int y3 = points.get(2).getY();
    public Triangle(List<Point> point) {
        super(point);
    }

    @Override
    public boolean validate() {
        boolean firstAndSecondPointsDontMatch = x1 != x2 || y1 != y2;
        boolean firstAndThirdPointsDontMatch = x1 != x3 || y1 != y3;
        boolean secondAndThirdPointsDontMatch = x2 != x3 || y2 != y3;
        if (firstAndSecondPointsDontMatch && firstAndThirdPointsDontMatch && secondAndThirdPointsDontMatch) {
            System.out.println("The figure is valid");
            return true;
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
