package main.java.com.github.matveisergin.figures.threedimensional;

import main.java.com.github.matveisergin.figures.constants.Consts;
import main.java.com.github.matveisergin.figures.Figure;
import main.java.com.github.matveisergin.figures.Point;

import java.util.List;

import static main.java.com.github.matveisergin.figures.constants.Consts.FIGURE_IS_INVALID;
import static main.java.com.github.matveisergin.figures.constants.Consts.FIGURE_IS_VALID;

public class Cylinder extends Figure {
    private final int x1 = points.get(0).getX();
    private final int y1 = points.get(0).getY();
    private final int z1 = points.get(0).getZ();
    private final int x2 = points.get(1).getX();
    private final int y2 = points.get(1).getY();
    private final int z2 = points.get(1).getZ();
    private final int x3 = points.get(Consts.THIRD_POINT).getX();
    private final int y3 = points.get(Consts.THIRD_POINT).getY();
    private final int z3 = points.get(Consts.THIRD_POINT).getZ();

    public Cylinder(List<Point> point) {
        super(point);
    }

    @Override
    public boolean validate() {
        if (points.size() != Consts.NUMBER_OF_POINTS_THREE) {
            System.out.println(FIGURE_IS_INVALID);
            return false;
        }
        boolean firstCheck = !(x1 == x2 && y1 == y2 && z1 == z2);
        boolean secondCheck = !(x1 == x3 && y1 == y3 && z1 == z3);
        boolean thirdCheck = !(x2 == x3 && y2 == y3 && z2 == z3);
        boolean fourthCheck = z2 == z3 || z1 == z3;

        if (firstCheck && secondCheck && thirdCheck && fourthCheck) {
            System.out.println(FIGURE_IS_VALID);
            return true;
        }
        System.out.println(FIGURE_IS_INVALID);
        return false;
    }

    @Override
    public double getArea() {
        double radius;
        if (z1 == z2) {
            radius = Math.sqrt(Math.pow(x2 - x1, Consts.DEGREE_OF_NUMBER) + Math.pow(y2 - y1, Consts.DEGREE_OF_NUMBER));
        } else {
            radius = Math.sqrt(Math.pow(x3 - x1, Consts.DEGREE_OF_NUMBER) + Math.pow(y3 - y1, Consts.DEGREE_OF_NUMBER));
        }
        double height = Math.sqrt(Math.pow(x2 - x1, Consts.DEGREE_OF_NUMBER) + Math.pow(y2 - y1, Consts.DEGREE_OF_NUMBER));
        return Consts.NUMBER_FOR_FORMULA * Math.PI * radius * height + Consts.NUMBER_FOR_FORMULA * Math.PI * radius;
    }
}
