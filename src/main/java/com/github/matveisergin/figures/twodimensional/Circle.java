package main.java.com.github.matveisergin.figures.twodimensional;

import main.java.com.github.matveisergin.figures.Figure;
import main.java.com.github.matveisergin.figures.Point;

import java.util.List;

import static main.java.com.github.matveisergin.figures.constants.Consts.*;

public class Circle extends Figure {
    private final int x1 = points.get(0).getX();
    private final int y1 = points.get(0).getY();
    private final int x2 = points.get(1).getX();
    private final int y2 = points.get(1).getY();

    public Circle(List<Point> point) {
        super(point);
    }

    @Override
    public double getArea() {
        return Math.PI * Math.pow(getRadius(), DEGREE_OF_NUMBER);
    }

    @Override
    public boolean validate() {
        if (points.size() == NUMBER_OF_POINTS_TWO) {

            if (!(x1 == x2 && y1 == y2)) {
                System.out.println(FIGURE_IS_VALID);
                return true;
            }
        }
        System.out.println(FIGURE_IS_INVALID);
        return false;
    }

    @Override
    public double getPerimeter() {
        return Math.PI * getRadius() * NUMBER_FOR_FORMULA;
    }

    private double getRadius() {
        double radius = Math.sqrt(Math.pow(x2 - x1, DEGREE_OF_NUMBER) + Math.pow(y2 - y1, DEGREE_OF_NUMBER));
        return radius;
    }
}
