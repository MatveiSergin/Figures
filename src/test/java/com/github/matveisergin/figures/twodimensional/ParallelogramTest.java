package test.java.com.github.matveisergin.figures.twodimensional;

import main.java.com.github.matveisergin.figures.Point;
import main.java.com.github.matveisergin.figures.twodimensional.Parallelogram;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.List;

public class ParallelogramTest {
    private Parallelogram firstParallelogram;
    private Parallelogram secondParallelogram;
    private final Point firstPoint = new Point(0, 0);
    private final Point secondPoint = new Point(3, 4);
    private final Point thirdPoint = new Point(9, 4);
    private final Point fourthPoint = new Point(6, 0);
    private final Point fifthPoint = new Point(-5, 50);
    private final Point sixthPoint = new Point(-20, 50);
    private final Point seventhPoint = new Point(-15, 0);

    private final double EXPECTED_AREA_FIRST_PARALLELOGRAM = 24;
    private final double EXPECTED_AREA_SECOND_PARALLELOGRAM = 750;
    private final double EXPECTED_PERIMETER_FIRST_PARALLELOGRAM = 22;
    private final double EXPECTED_PERIMETER_SECOND_PARALLELOGRAM = 130.499;
    private final double DELTA = 0.001;
    @BeforeEach
    void setUp() {
        firstParallelogram = new Parallelogram(List.of(firstPoint, secondPoint, thirdPoint, fourthPoint));
        secondParallelogram = new Parallelogram(List.of(firstPoint, fifthPoint, sixthPoint, seventhPoint));
    }

    @Test
    void getArea() {
        Assertions.assertTrue(firstParallelogram.validate());
        double firstArea = firstParallelogram.getArea();
        Assertions.assertEquals(EXPECTED_AREA_FIRST_PARALLELOGRAM, firstArea);

        Assertions.assertTrue(secondParallelogram.validate());
        double secondArea = secondParallelogram.getArea();
        Assertions.assertEquals(EXPECTED_AREA_SECOND_PARALLELOGRAM, secondArea);
    }

    @Test
    void getPerimeter() {
        Assertions.assertTrue(firstParallelogram.validate());
        double firstPerimeter = firstParallelogram.getPerimeter();
        Assertions.assertEquals(EXPECTED_PERIMETER_FIRST_PARALLELOGRAM, firstPerimeter);

        Assertions.assertTrue(secondParallelogram.validate());
        double secondPerimeter = secondParallelogram.getPerimeter();
        Assertions.assertEquals(EXPECTED_PERIMETER_SECOND_PARALLELOGRAM, secondPerimeter, DELTA);
    }
}

