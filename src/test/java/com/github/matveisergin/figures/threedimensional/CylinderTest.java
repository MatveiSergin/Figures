package test.java.com.github.matveisergin.figures.threedimensional;

import main.java.com.github.matveisergin.figures.Point;
import main.java.com.github.matveisergin.figures.threedimensional.Cone;
import main.java.com.github.matveisergin.figures.threedimensional.Cylinder;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.List;

public class CylinderTest {
    private Cylinder firstCylinder;
    private Cylinder secondCylinder;
    private Point firstPoint = new Point(0, 0, 0);
    private Point secondPoint = new Point(0, 0, 10);
    private Point thirdPoint = new Point(0, 5, 0);
    private Point fourthPoint = new Point(20, 30, 40);
    private Point fifthPoint = new Point(20, 30,  60);
    private Point sixthPoint = new Point(30, 40, 60);
    private final double EXPECTED_AREA_FIRST_CYLINDER = 31.416;
    private final double EXPECTED_AREA_SECOND_CYLINDER = 88.858;
    private final double DELTA = 0.001;

    @BeforeEach
    void setUp() {
        firstCylinder = new Cylinder(List.of(firstPoint, secondPoint, thirdPoint));
        secondCylinder = new Cylinder(List.of(fourthPoint, fifthPoint, sixthPoint));
    }

    @Test
    void getArea() {
        Assertions.assertTrue(firstCylinder.validate());
        double firstArea = firstCylinder.getArea();
        Assertions.assertEquals(EXPECTED_AREA_FIRST_CYLINDER, firstArea, DELTA);

        Assertions.assertTrue(secondCylinder.validate());
        double secondArea = secondCylinder.getArea();
        Assertions.assertEquals(EXPECTED_AREA_SECOND_CYLINDER, secondArea, DELTA);
    }
}
