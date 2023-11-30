package test.java.com.github.matveisergin.figures.twodimensional;

import main.java.com.github.matveisergin.figures.Point;
import main.java.com.github.matveisergin.figures.twodimensional.Circle;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.List;

public class CircleTest {
    private Circle firstCircle;
    private Circle secondCircle;
    private Point firstPoint = new Point(0, 0);
    private Point secondPoint = new Point(0, 1);
    private Point thirdPoint = new Point(10, 100);
    private final double EXPECTED_AREA_FIRST_CIRCLE = Math.PI;
    private final double EXPECTED_AREA_SECOND_CIRCLE = 31104.908;
    private final double EXPECTED_PERIMETER_FIRST_CIRCLE = 6.283;
    private final double EXPECTED_PERIMETER_SECOND_CIRCLE = 625.200;
    private final double DELTA = 0.001;

    @BeforeEach
    void setUp() {
        firstCircle = new Circle(List.of(firstPoint, secondPoint));
        secondCircle = new Circle(List.of(secondPoint, thirdPoint));
    }

    @Test
    void getArea() {
        Assertions.assertTrue(firstCircle.validate());
        double firstArea = firstCircle.getArea();
        Assertions.assertEquals(EXPECTED_AREA_FIRST_CIRCLE, firstArea);

        Assertions.assertTrue(secondCircle.validate());
        double secondArea = secondCircle.getArea();
        Assertions.assertEquals(EXPECTED_AREA_SECOND_CIRCLE, secondArea, DELTA);
    }

    @Test
    void getPerimeter() {
        Assertions.assertTrue(firstCircle.validate());
        double firstPerimeter = firstCircle.getPerimeter();
        Assertions.assertEquals(EXPECTED_PERIMETER_FIRST_CIRCLE, firstPerimeter, DELTA);

        Assertions.assertTrue(secondCircle.validate());
        double secondPerimeter = secondCircle.getPerimeter();
        Assertions.assertEquals(EXPECTED_PERIMETER_SECOND_CIRCLE, secondPerimeter, DELTA);
    }
}
