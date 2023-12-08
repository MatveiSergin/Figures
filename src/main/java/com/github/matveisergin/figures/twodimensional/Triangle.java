package main.java.com.github.matveisergin.figures.twodimensional;

import main.java.com.github.matveisergin.figures.Figure;
import main.java.com.github.matveisergin.figures.methods.MethodsForPoligons;
import main.java.com.github.matveisergin.figures.Point;

import java.util.List;

import static main.java.com.github.matveisergin.figures.constants.Consts.*;

public class Triangle extends Figure {
    private final int x1 = points.get(0).getX();
    private final int y1 = points.get(0).getY();
    private final int x2 = points.get(1).getX();
    private final int y2 = points.get(1).getY();
    private final int x3 = points.get(THIRD_POINT).getX();
    private final int y3 = points.get(THIRD_POINT).getY();
    public Triangle(List<Point> point) {
        super(point);
    }

    @Override
    public boolean validate() {
        if (points.size() != NUMBER_OF_POINTS_THREE) {
            System.out.println(FIGURE_IS_INVALID);
            return false;
        }
        boolean firstAndSecondPointsDontMatch = x1 != x2 || y1 != y2;
        boolean firstAndThirdPointsDontMatch = x1 != x3 || y1 != y3;
        boolean secondAndThirdPointsDontMatch = x2 != x3 || y2 != y3;
        boolean pointsDontMAtch = firstAndSecondPointsDontMatch &&
                firstAndThirdPointsDontMatch &&
                secondAndThirdPointsDontMatch;

        double firstSide = Math.sqrt(Math.pow(x2 - x1, DEGREE_OF_NUMBER) + Math.pow(y2 - y1, DEGREE_OF_NUMBER));
        double secondSide = Math.sqrt(Math.pow(x3 - x2, DEGREE_OF_NUMBER) + Math.pow(y3 - y2, DEGREE_OF_NUMBER));
        double thirdSide = Math.sqrt(Math.pow(x3 - x2, DEGREE_OF_NUMBER) + Math.pow(y3 - y2, DEGREE_OF_NUMBER));
        boolean isTriangle = (firstSide + secondSide > thirdSide) &&
                (firstSide + thirdSide > secondSide) &&
                (thirdSide + secondSide > firstSide);

        if (isTriangle && pointsDontMAtch) {
            System.out.println(FIGURE_IS_VALID);
            return true;
        }
        System.out.println(FIGURE_IS_INVALID);
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
