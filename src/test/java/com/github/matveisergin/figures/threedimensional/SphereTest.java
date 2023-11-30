package test.java.com.github.matveisergin.figures.threedimensional;

import main.java.com.github.matveisergin.figures.Point;
import main.java.com.github.matveisergin.figures.threedimensional.Sphere;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.List;

public class SphereTest {

    private Sphere firstSphere;
    private Sphere secondSphere;
    private Point firstPoint = new Point(0, 0, 0);
    private Point secondPoint = new Point(0, 0, 10);
    private Point thirdPoint = new Point(10, 5, 3);
    private Point fourthPoint = new Point(20, 30, 40);
    private final double EXPECTED_AREA_FIRST_SPHERE = 1256.637;
    private final double EXPECTED_AREA_SECOND_SPHERE = 26313.980;
    private final double DELTA = 0.001;

    @BeforeEach
    void setUp() {
        firstSphere = new Sphere(List.of(firstPoint, secondPoint));
        secondSphere = new Sphere(List.of(thirdPoint, fourthPoint));
    }

    @Test
    void getArea() {
        Assertions.assertTrue(firstSphere.validate());
        double firstArea = firstSphere.getArea();
        Assertions.assertEquals(EXPECTED_AREA_FIRST_SPHERE, firstArea, DELTA);

        Assertions.assertTrue(secondSphere.validate());
        double secondArea = secondSphere.getArea();
        Assertions.assertEquals(EXPECTED_AREA_SECOND_SPHERE, secondArea, DELTA);
    }

}
