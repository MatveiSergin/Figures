package main.java.com.github.matveisergin.figures;

import java.util.List;

import static main.java.com.github.matveisergin.figures.constants.Consts.VALID_FOR_FIGURE;

public class Figure {
    public List<Point> points;

    public Figure(List<Point> point) {
        this.points = point;
    }

    public boolean validate() {
        System.out.println(VALID_FOR_FIGURE);
        return true;
    }
    public double getArea() {
        return 0;
    }

    public double getPerimeter() {
        return 0;
    }
}

