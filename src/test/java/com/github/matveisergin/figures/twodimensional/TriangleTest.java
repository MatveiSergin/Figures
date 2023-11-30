package test.java.com.github.matveisergin.figures.twodimensional;

import main.java.com.github.matveisergin.figures.Point;
import main.java.com.github.matveisergin.figures.twodimensional.Triangle;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.List;

public class TriangleTest {
    private Triangle firstTriangle;
    private Triangle secondTriangle;
    private Point firstPoint = new Point(0, 0);
    private Point secondPoint = new Point(0, 1);
    private Point thirdPoint = new Point(10, 100);
    private Point fourthPoint = new Point(-10, 10);
    private Point fifthoint = new Point(-5, 10);
    private Point sixthPoint = new Point(-5, -10);
    private final double EXPECTED_AREA_FIRST_TRIANGLE = 5;
    private final double EXPECTED_AREA_SECOND_TRIANGLE = 50;
    private final double EXPECTED_PERIMETER_FIRST_TRIANGLE = 201.0026;
    private final double EXPECTED_PERIMETER_SECOND_TRIANGLE = 45.616;
    private final double DELTA = 0.001;

    @BeforeEach
    void setUp() {
        firstTriangle = new Triangle(List.of(firstPoint, secondPoint, thirdPoint));
        secondTriangle = new Triangle(List.of(fourthPoint, fifthoint, sixthPoint));
    }

    @Test
    void getArea() {
        Assertions.assertTrue(firstTriangle.validate());
        double firstArea = firstTriangle.getArea();
        Assertions.assertEquals(EXPECTED_AREA_FIRST_TRIANGLE, firstArea);

        Assertions.assertTrue(secondTriangle.validate());
        double secondArea = secondTriangle.getArea();
        Assertions.assertEquals(EXPECTED_AREA_SECOND_TRIANGLE, secondArea, DELTA);
    }

    @Test
    void getPerimeter() {
        Assertions.assertTrue(firstTriangle.validate());
        double firstPerimeter = firstTriangle.getPerimeter();
        Assertions.assertEquals(EXPECTED_PERIMETER_FIRST_TRIANGLE, firstPerimeter, DELTA);

        Assertions.assertTrue(secondTriangle.validate());
        double secondPerimeter = secondTriangle.getPerimeter();
        Assertions.assertEquals(EXPECTED_PERIMETER_SECOND_TRIANGLE, secondPerimeter, DELTA);
    }
}
