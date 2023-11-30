package test.java.com.github.matveisergin.figures.threedimensional;

import main.java.com.github.matveisergin.figures.Point;
import main.java.com.github.matveisergin.figures.threedimensional.TruncatedSphere;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.List;

public class TruncatedSphereTest {
    private TruncatedSphere firstTruncatedSphere;
    private TruncatedSphere secondTruncatedSphere;
    private Point firstPoint = new Point(0, 0, 0);
    private Point secondPoint = new Point(10, 10, 10);
    private Point thirdPoint = new Point(10, 10, 10);
    private Point fourthPoint = new Point(20, 30, 40);
    private Point fifthPoint = new Point(60, 30, 40);
    private Point sixthPoint = new Point(-20, 30, 40);
    private final double EXPECTED_AREA_FIRST_SPHERE = 1256.637;
    private final double EXPECTED_AREA_SECOND_SPHERE = 10053.096;
    private final double DELTA = 0.001;

    @BeforeEach
    void setUp() {
        firstTruncatedSphere = new TruncatedSphere(List.of(firstPoint, secondPoint, thirdPoint));
        secondTruncatedSphere = new TruncatedSphere(List.of(fourthPoint, fifthPoint, sixthPoint));
    }

    @Test
    void getArea() {
        Assertions.assertTrue(firstTruncatedSphere.validate());
        double firstArea = firstTruncatedSphere.getArea();
        Assertions.assertEquals(EXPECTED_AREA_FIRST_SPHERE, firstArea, DELTA);

        Assertions.assertTrue(secondTruncatedSphere.validate());
        double secondArea = secondTruncatedSphere.getArea();
        Assertions.assertEquals(EXPECTED_AREA_SECOND_SPHERE, secondArea, DELTA);
    }

}
