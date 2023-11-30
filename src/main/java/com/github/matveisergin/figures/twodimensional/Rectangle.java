package main.java.com.github.matveisergin.figures.twodimensional;

import main.java.com.github.matveisergin.figures.constants.Consts;
import main.java.com.github.matveisergin.figures.Figure;
import main.java.com.github.matveisergin.figures.methods.MethodsForPoligons;
import main.java.com.github.matveisergin.figures.Point;

import java.util.List;

public class Rectangle extends Figure {
    private final int x1 = points.get(0).getX();
    private final int y1 = points.get(0).getY();
    private final int x2 = points.get(1).getX();
    private final int y2 = points.get(1).getY();
    private final int x3 = points.get(2).getX();
    private final int y3 = points.get(2).getY();
    private final int x4 = points.get(3).getX();
    private final int y4 = points.get(3).getY();
    public Rectangle(List<Point> point) {
        super(point);
    }

    @Override
    public boolean validate() {
        if (!MethodsForPoligons.isParallelogram(points)) {
            System.out.println("The figure is invalid");
            return false;
        }
        int[] firstVector = {x2 - x1, y2 - y1};
        int[] secondVector = {x4 - x1, y4 - y1};
        boolean isParallel = (firstVector[0] * secondVector[0] + firstVector[1] * secondVector[1]) == 0;
        if (!isParallel) {
            System.out.println("The figure is invalid");
            return false;
        }
        System.out.println("The figure is valid");
        return true;
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
