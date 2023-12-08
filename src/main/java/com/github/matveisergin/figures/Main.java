package main.java.com.github.matveisergin.figures;

import main.java.com.github.matveisergin.figures.constants.Consts;
import main.java.com.github.matveisergin.figures.threedimensional.Cone;
import main.java.com.github.matveisergin.figures.threedimensional.Cylinder;
import main.java.com.github.matveisergin.figures.threedimensional.Sphere;
import main.java.com.github.matveisergin.figures.threedimensional.TruncatedSphere;
import main.java.com.github.matveisergin.figures.twodimensional.*;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import static main.java.com.github.matveisergin.figures.constants.Consts.*;

public class Main {
    public static Boolean inArray(String str, String[] array) {
        for (String element : array) {
            if (element.equals(str)) {
                return true;
            }
        }
        return false;
    }

    public static List<Point> getPoints(Scanner scanner, String command) {
        List<Point> points = new ArrayList<>();
        String inputData = scanner.nextLine();
        while (!inputData.equals(STRING_FOR_STOP_INPUT)) {
            String[] coordinates = inputData.split(WHITE_SPACE);
            if (coordinates.length == Consts.NUMBER_OF_POINTS_TWO &&
                    inArray(command, Consts.FIGURES_2D)) {
                Point point = new Point(
                        Integer.parseInt(coordinates[0]),
                        Integer.parseInt(coordinates[1]));
                points.add(point);
            } else if (coordinates.length == Consts.NUMBER_OF_POINTS_THREE &&
                    inArray(command, Consts.FIGURES_3D)) {
                Point point = new Point(
                        Integer.parseInt(coordinates[0]),
                        Integer.parseInt(coordinates[1]),
                        Integer.parseInt(coordinates[Consts.THIRD_POINT]));
                points.add(point);
            } else {
                System.out.println(PLEASE_RETYPE);
            }
            inputData = scanner.nextLine();
        }
        return points;
    }

    public static Figure getFigure() {
        Scanner scanner = new Scanner(System.in);
        String command = scanner.nextLine();
        while (!command.equals(STRING_FOR_END)) {
            switch (command) {
                case SQUARE_NAME:
                    return new Square(getPoints(scanner, command));
                case RECTANGLE_NAME:
                    return new Rectangle(getPoints(scanner, command));
                case PARALLELOGRAM_NAME:
                    return new Parallelogram(getPoints(scanner, command));
                case TRIANGLE_NAME:
                    return new Triangle(getPoints(scanner, command));
                case CIRCLE_NAME:
                    return new Circle(getPoints(scanner, command));
                case POLYGON_NAME:
                    return new Polygon(getPoints(scanner, command));
                case CONE_NAME:
                    return new Cone(getPoints(scanner, command));
                case CYLINDER_NAME:
                    return new Cylinder(getPoints(scanner, command));
                case SPHERE_NAME:
                    return new Sphere(getPoints(scanner, command));
                case TRUNCATED_SPHERE_NAME:
                    return new TruncatedSphere(getPoints(scanner, command));
                case FIGURE_NAME:
                    return new Figure(getPoints(scanner, command));
                default:
                    System.out.println(PLEASE_RETYPE);
                    break;
            }
            command = scanner.nextLine();
        }
        return null;
    }

    public static void main(String[] args) {
        Figure figure = getFigure();
        while (figure != null) {
            if (figure.validate()) {
                if (figure.getArea() == 0) {
                    System.out.println(HAS_NO_AREA);
                } else {
                    System.out.printf(FORMAT_FOR_OUTPUT, figure.getArea());
                }
                if (figure.getPerimeter() == 0) {
                    System.out.println(HAS_NO_PERIMETER);
                } else {
                    System.out.printf(FORMAT_FOR_OUTPUT, figure.getPerimeter());
                }
            }
            figure = getFigure();
        }
    }
}
