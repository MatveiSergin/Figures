package test.java.com.github.matveisergin.figures.threedimensional;

import main.java.com.github.matveisergin.figures.Point;
import main.java.com.github.matveisergin.figures.threedimensional.Cone;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.List;

public class ConeTest {
    private Cone firstCone;
    private Cone secondCone;
    private Point firstPoint = new Point(0, 0, 0);
    private Point secondPoint = new Point(0, 5, 0);
    private Point thirdPoint = new Point(0, 0, 10);
    private Point fourthPoint = new Point(20, 30, 40);
    private Point fifthPoint = new Point(40, 50,  40);
    private Point sixthPoint = new Point(20, 30, 50);
    private final double EXPECTED_AREA_FIRST_CONE = 189.611;
    private final double EXPECTED_AREA_SECOND_CONE = 5591.393;
    private final double DELTA = 0.001;

    @BeforeEach
    void setUp() {
        firstCone = new Cone(List.of(firstPoint, secondPoint, thirdPoint));
        secondCone = new Cone(List.of(fourthPoint, fifthPoint, sixthPoint));
    }

    @Test
    void getArea() {
        Assertions.assertTrue(firstCone.validate());
        double firstArea = firstCone.getArea();
        Assertions.assertEquals(EXPECTED_AREA_FIRST_CONE, firstArea, DELTA);

        Assertions.assertTrue(secondCone.validate());
        double secondArea = secondCone.getArea();
        Assertions.assertEquals(EXPECTED_AREA_SECOND_CONE, secondArea, DELTA);
    }
}
