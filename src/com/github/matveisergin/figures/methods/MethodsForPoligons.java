package com.github.matveisergin.figures.methods;

import com.github.matveisergin.figures.Point;

import java.util.List;

import static com.github.matveisergin.figures.constants.Consts.*;

public class MethodsForPoligons {

    public static double getPerimeter(List<Point> points) {
        double perimeter = 0;
        int numberOfPoints = points.size();
        for (int i = 0; i < numberOfPoints - 1; i++) {
            perimeter += Math.sqrt(Math.pow(points.get(i + 1).getX() - points.get(i).getX(), DEGREE_OF_NUMBER) + Math.pow(points.get(i + 1).getY() - points.get(i).getY(), DEGREE_OF_NUMBER));
        }
        perimeter += Math.sqrt(Math.pow(points.get(numberOfPoints - 1).getX() - points.get(0).getX(), DEGREE_OF_NUMBER) +
                Math.pow(points.get(numberOfPoints - 1).getY() - points.get(0).getY(), DEGREE_OF_NUMBER));
        return perimeter;
    }

    public static double getArea(List<Point> points) {
        int numberOfPoints = points.size();
        int length = numberOfPoints * NUMBER_FOR_FORMULA;
        int[] coordinates = new int[length];
        int index = 0;
        for (Point point : points) {
            coordinates[index] = point.getX();
            index++;
            coordinates[index] = point.getY();
            index++;
        }
        double square = 0;

        for (int i = 0; i < length - SHIFT_BY_THREE; i = i + NUMBER_FOR_FORMULA) {
            square += (coordinates[i] * coordinates[i + SHIFT_BY_THREE]);
        }

        for (int i = 0; i < length - NUMBER_FOR_FORMULA; i = i + NUMBER_FOR_FORMULA) {
            square -= coordinates[i + SHIFT_BY_TWO] * coordinates[i + 1];
        }

        square -= coordinates[length - 1] * coordinates[0];

        square += coordinates[length - SHIFT_BY_TWO] * coordinates[1];

        square = MULTIPLIER_FOR_AREA * Math.abs(square);

        return square;

    }

    public static boolean isParallelogram(List<Point> points) {
        if (points.size() == NUMBER_OF_POINTS_FOUR) {
            double[] sides = new double[NUMBER_OF_POINTS_FOUR];
            for (int i = 0; i < NUMBER_OF_POINTS_THREE; i++) {
                sides[i] = Math.sqrt(Math.pow(points.get(i + 1).getX() - points.get(i).getX(), DEGREE_OF_NUMBER) +
                        Math.pow(points.get(i + 1).getY() - points.get(i).getY(), DEGREE_OF_NUMBER));
            }
            int differenceBetweenX1AndX4 = points.get(0).getX() - points.get(FOUR_SIDE).getX();
            int differenceBetweenY1AndY4 = points.get(0).getY() - points.get(NUMBER_OF_POINTS_THREE).getY();

            sides[FOUR_SIDE] = Math.sqrt(Math.pow(differenceBetweenX1AndX4, DEGREE_OF_NUMBER)
                    + Math.pow(differenceBetweenY1AndY4, DEGREE_OF_NUMBER));
            return sides[0] == sides[NUMBER_OF_POINTS_TWO] && sides[1] == sides[NUMBER_OF_POINTS_THREE];
        }
        return false;
    }
}