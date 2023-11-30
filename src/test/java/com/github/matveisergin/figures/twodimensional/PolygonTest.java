package test.java.com.github.matveisergin.figures.twodimensional;

import main.java.com.github.matveisergin.figures.Point;
import main.java.com.github.matveisergin.figures.twodimensional.Polygon;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.List;

public class PolygonTest {
    private Polygon firstPolygon;
    private Polygon secondPolygon;
    private final Point firstPoint = new Point(-4, 1);
    private final Point secondPoint = new Point(-2, 4);
    private final Point thirdPoint = new Point(2, 5);
    private final Point fourthPoint = new Point(5, 2);
    private final Point fifthPoint = new Point(0, -3);
    private final double EXPECTED_AREA_FIRST_POLYGON = 40;
    private final double EXPECTED_AREA_SECOND_POLYGON = 35;
    private final double EXPECTED_PERIMETER_FIRST_POLYGON = 24.699;
    private final double EXPECTED_PERIMETER_SECOND_POLYGON = 24.182;
    private final double DELTA = 0.001;

    @BeforeEach
    void setUp() {
        firstPolygon = new Polygon(List.of(firstPoint, secondPoint, thirdPoint, fourthPoint, fifthPoint));
        secondPolygon = new Polygon(List.of(firstPoint, thirdPoint, fourthPoint, fifthPoint));
    }

    @Test
    void getArea() {
        Assertions.assertTrue(firstPolygon.validate());
        double firstArea = firstPolygon.getArea();
        Assertions.assertEquals(EXPECTED_AREA_FIRST_POLYGON, firstArea);

        Assertions.assertTrue(secondPolygon.validate());
        double secondArea = secondPolygon.getArea();
        Assertions.assertEquals(EXPECTED_AREA_SECOND_POLYGON, secondArea);
    }

    @Test
    void getPerimeter() {
        Assertions.assertTrue(firstPolygon.validate());
        double perimeter = firstPolygon.getPerimeter();
        Assertions.assertEquals(EXPECTED_PERIMETER_FIRST_POLYGON, perimeter, DELTA);

        Assertions.assertTrue(secondPolygon.validate());
        double secondArea = secondPolygon.getPerimeter();
        Assertions.assertEquals(EXPECTED_PERIMETER_SECOND_POLYGON, secondArea, DELTA);
    }
}
