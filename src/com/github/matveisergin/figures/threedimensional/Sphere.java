package com.github.matveisergin.figures.threedimensional;

import com.github.matveisergin.figures.constants.Consts;
import com.github.matveisergin.figures.Figure;
import com.github.matveisergin.figures.Point;

import java.util.List;

public class Sphere extends Figure {
    private final int x1 = points.get(0).getX();
    private final int y1 = points.get(0).getY();
    private final int z1 = points.get(1).getZ();
    private final int x2 = points.get(1).getX();
    private final int y2 = points.get(1).getY();
    private final int z2 = points.get(1).getZ();

    public Sphere(List<Point> point) {
        super(point);
    }

    @Override
    public boolean validate() {
        if (points.size() == Consts.NUMBER_OF_POINTS_TWO && !(x1 == x2 && y1 == y2 && z1 == z2)) {
            System.out.println("The figure is valid");
            return true;
        } else {
            System.out.println("The figure is invalid");
            return false;
        }
    }

    @Override
    public double getArea() {
        double radius = Math.sqrt(Math.pow(x2 - x1, Consts.DEGREE_OF_NUMBER) + Math.pow(y2 - y1, Consts.DEGREE_OF_NUMBER));
        return 4 * Math.PI * Math.pow(radius, Consts.DEGREE_OF_NUMBER);
    }
}
