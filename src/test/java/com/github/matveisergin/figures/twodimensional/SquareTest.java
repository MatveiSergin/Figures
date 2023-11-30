package test.java.com.github.matveisergin.figures.twodimensional;

import main.java.com.github.matveisergin.figures.Point;
import main.java.com.github.matveisergin.figures.twodimensional.Square;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.List;
public class SquareTest {
    private Square firstSquare;
    private Square secondSquare;
    private Point firstPoint = new Point(0, 0);
    private Point secondPoint = new Point(10, 0);
    private Point thirdPoint = new Point(10, 10);
    private Point fourthPoint = new Point(0, 10);
    private Point fifthPoint = new Point(-1, -1);
    private Point sixthPoint = new Point(-1, -2);
    private Point seventhPoint = new Point(0, -2);
    private Point eigthPoint = new Point(0, -1);
    private final double EXPECTED_AREA_FIRST_SQUARE = 100;
    private final double EXPECTED_AREA_SECOND_SQUARE = 1;
    private final double EXPECTED_PERIMETER_FIRST_SQUARE = 40;
    private final double EXPECTED_PERIMETER_SECOND_SQUARE = 4;
    private final double DELTA = 0.001;

    @BeforeEach
    void setUp() {
        firstSquare = new Square(List.of(firstPoint, secondPoint, thirdPoint, fourthPoint));
        secondSquare = new Square(List.of(fifthPoint, sixthPoint, seventhPoint, eigthPoint));
    }

    @Test
    void getArea() {
        Assertions.assertTrue(firstSquare.validate());
        double firstArea = firstSquare.getArea();
        Assertions.assertEquals(EXPECTED_AREA_FIRST_SQUARE, firstArea);

        Assertions.assertTrue(secondSquare.validate());
        double secondArea = secondSquare.getArea();
        Assertions.assertEquals(EXPECTED_AREA_SECOND_SQUARE, secondArea, DELTA);
    }

    @Test
    void getPerimeter() {
        Assertions.assertTrue(firstSquare.validate());
        double firstPerimeter = firstSquare.getPerimeter();
        Assertions.assertEquals(EXPECTED_PERIMETER_FIRST_SQUARE, firstPerimeter, DELTA);

        Assertions.assertTrue(secondSquare.validate());
        double secondPerimeter = secondSquare.getPerimeter();
        Assertions.assertEquals(EXPECTED_PERIMETER_SECOND_SQUARE, secondPerimeter, DELTA);
    }
}
