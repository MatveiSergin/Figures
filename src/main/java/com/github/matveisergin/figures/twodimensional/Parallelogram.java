package main.java.com.github.matveisergin.figures.twodimensional;

import main.java.com.github.matveisergin.figures.Figure;
import main.java.com.github.matveisergin.figures.methods.MethodsForPoligons;
import main.java.com.github.matveisergin.figures.Point;

import java.util.List;

import static main.java.com.github.matveisergin.figures.constants.Consts.FIGURE_IS_INVALID;
import static main.java.com.github.matveisergin.figures.constants.Consts.FIGURE_IS_VALID;

public class Parallelogram extends Figure {
    public Parallelogram(List<Point> point) {
        super(point);
    }

    @Override
    public boolean validate() {
        if (MethodsForPoligons.isParallelogram(points)) {
            System.out.println(FIGURE_IS_VALID);
            return true;
        } else {
            System.out.println(FIGURE_IS_INVALID);
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
