package main.java.com.github.matveisergin.figures.twodimensional;

import main.java.com.github.matveisergin.figures.Figure;
import main.java.com.github.matveisergin.figures.methods.MethodsForPoligons;
import main.java.com.github.matveisergin.figures.Point;

import java.util.List;

import static main.java.com.github.matveisergin.figures.constants.Consts.FIGURE_IS_INVALID;
import static main.java.com.github.matveisergin.figures.constants.Consts.FIGURE_IS_VALID;

public class Polygon extends Figure {
    public Polygon(List<Point> point) {
        super(point);
    }

    @Override
    public boolean validate() {
        for (int i = 0; i < points.size() - 1; i++) {
            boolean firstCheck = points.get(i).getX() == points.get(i + 1).getX();
            boolean secondCheck = points.get(i).getY() == points.get(i + 1).getY();
            if (firstCheck && secondCheck) {
                System.out.println(FIGURE_IS_INVALID);
                return false;
            }
        }
        System.out.println(FIGURE_IS_VALID);
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
