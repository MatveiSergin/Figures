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
        while (!inputData.equals("STOP_INPUT")) {
            String[] coordinates = inputData.split(" ");
            if (coordinates.length == Consts.NUMBER_OF_POINTS_TWO && inArray(command, Consts.figures2D)) {
                Point point = new Point(Integer.parseInt(coordinates[0]), Integer.parseInt(coordinates[1]));
                points.add(point);
            } else if (coordinates.length == Consts.NUMBER_OF_POINTS_THREE && inArray(command, Consts.figures3D)) {
                Point point = new Point(Integer.parseInt(coordinates[0]), Integer.parseInt(coordinates[1]), Integer.parseInt(coordinates[Consts.THIRD_POINT]));
                points.add(point);
            } else {
                System.out.println("Please, retype");
            }
            inputData = scanner.nextLine();
        }
        return points;
    }

    public static Figure getFigure() {
        Scanner scanner = new Scanner(System.in);
        String command = scanner.nextLine();
        while (!command.equals("END")) {
            switch (command) {
                case "SQUARE":
                    return new Square(getPoints(scanner, command));
                case "RECTANGLE":
                    return new Rectangle(getPoints(scanner, command));
                case "PARALLELOGRAM":
                    return new Parallelogram(getPoints(scanner, command));
                case "TRIANGLE":
                    return new Triangle(getPoints(scanner, command));
                case "CIRCLE":
                    return new Circle(getPoints(scanner, command));
                case "POLYGON":
                    return new Polygon(getPoints(scanner, command));
                case "CONE":
                    return new Cone(getPoints(scanner, command));
                case "CYLINDER":
                    return new Cylinder(getPoints(scanner, command));
                case "SPHERE":
                    return new Sphere(getPoints(scanner, command));
                case "TRUNCATED_SPHERE":
                    return new TruncatedSphere(getPoints(scanner, command));
                case "FIGURE":
                    return new Figure(getPoints(scanner, command));
                default:
                    System.out.println("Please, retype");
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
                    System.out.println("The figure has no area");
                } else {
                    System.out.printf("%.2f\n", figure.getArea());
                }
                if (figure.getPerimeter() == 0) {
                    System.out.println("The figure has no perimeter");
                } else {
                    System.out.printf("%.2f\n", figure.getPerimeter());
                }
            }
            figure = getFigure();
        }
    }
}
