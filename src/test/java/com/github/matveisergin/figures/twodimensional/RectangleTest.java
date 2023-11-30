package test.java.com.github.matveisergin.figures.twodimensional;

import main.java.com.github.matveisergin.figures.Point;
import main.java.com.github.matveisergin.figures.twodimensional.Rectangle;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.List;

public class RectangleTest {
    private Rectangle firstRectangle;
    private Rectangle secondRectangle;
    private Point firstPoint = new Point(0, 0);
    private Point secondPoint = new Point(10, 0);
    private Point thirdPoint = new Point(10, 100);
    private Point fourthPoint = new Point(0, 100);
    private Point fifthPoint = new Point(-1, -1);
    private Point sixthPoint = new Point(-1, -2);
    private Point seventhPoint = new Point(3, -2);
    private Point eigthPoint = new Point(3, -1);
    private final double EXPECTED_AREA_FIRST_RECTANGLE = 1000;
    private final double EXPECTED_AREA_SECOND_RECTANGLE = 4;
    private final double EXPECTED_PERIMETER_FIRST_RECTANGLE = 220;
    private final double EXPECTED_PERIMETER_SECOND_RECTANGLE = 10;
    private final double DELTA = 0.001;

    @BeforeEach
    void setUp() {
        firstRectangle = new Rectangle(List.of(firstPoint, secondPoint, thirdPoint, fourthPoint));
        secondRectangle = new Rectangle(List.of(fifthPoint, sixthPoint, seventhPoint, eigthPoint));
    }

    @Test
    void getArea() {
        Assertions.assertTrue(firstRectangle.validate());
        double firstArea = firstRectangle.getArea();
        Assertions.assertEquals(EXPECTED_AREA_FIRST_RECTANGLE, firstArea);

        Assertions.assertTrue(secondRectangle.validate());
        double secondArea = secondRectangle.getArea();
        Assertions.assertEquals(EXPECTED_AREA_SECOND_RECTANGLE, secondArea, DELTA);
    }

    @Test
    void getPerimeter() {
        Assertions.assertTrue(firstRectangle.validate());
        double firstPerimeter = firstRectangle.getPerimeter();
        Assertions.assertEquals(EXPECTED_PERIMETER_FIRST_RECTANGLE, firstPerimeter, DELTA);

        Assertions.assertTrue(secondRectangle.validate());
        double secondPerimeter = secondRectangle.getPerimeter();
        Assertions.assertEquals(EXPECTED_PERIMETER_SECOND_RECTANGLE, secondPerimeter, DELTA);
    }
}

