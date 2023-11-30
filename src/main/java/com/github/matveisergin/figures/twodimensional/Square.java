package main.java.com.github.matveisergin.figures.twodimensional;

import main.java.com.github.matveisergin.figures.constants.Consts;
import main.java.com.github.matveisergin.figures.Figure;
import main.java.com.github.matveisergin.figures.methods.MethodsForPoligons;
import main.java.com.github.matveisergin.figures.Point;

import java.util.List;

public class Square extends Figure {
    private final int x1 = points.get(0).getX();
    private final int y1 = points.get(0).getY();
    private final int x2 = points.get(1).getX();
    private final int y2 = points.get(1).getY();
    private final int x3 = points.get(2).getX();
    private final int y3 = points.get(2).getY();
    private final int x4 = points.get(3).getX();
    private final int y4 = points.get(3).getY();

    public Square(List<Point> points) {
        super(points);
    }

    @Override
    public boolean validate() {
        if (!MethodsForPoligons.isParallelogram(points)) {
            System.out.println("The figure is invalid");
            return false;
        }
        int[] firstVector = {x2 - x1, y2 - y1};
        int[] secondVector = {x4 - x1, y4 - y1};
        double lengthFirstSide = Math.sqrt(Math.pow(firstVector[0], Consts.DEGREE_OF_NUMBER) + Math.pow(firstVector[1], Consts.DEGREE_OF_NUMBER));
        double lengthSecondSide = Math.sqrt(Math.pow(secondVector[0], Consts.DEGREE_OF_NUMBER) + Math.pow(secondVector[1], Consts.DEGREE_OF_NUMBER));
        boolean isParallel = (firstVector[0] * secondVector[0] + firstVector[1] * secondVector[1]) == 0;
        if (isParallel && lengthFirstSide == lengthSecondSide) {
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
