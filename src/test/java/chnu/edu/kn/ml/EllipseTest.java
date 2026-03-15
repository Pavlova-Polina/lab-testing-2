package chnu.edu.kn.ml;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class EllipseTest {

    @Test
    public void area_shouldReturnCorrectValue() {
        Ellipse ellipse = new Ellipse(8, 5);
        double result = ellipse.area();
        assertEquals(125.66, result, 0.01);
    }

    @Test
    public void majorAxisLength_shouldReturnCorrectValue() {
        Ellipse ellipse = new Ellipse(8, 5);
        double result = ellipse.majorAxisLength();
        assertEquals(16.0, result, 0.01);
    }

    @Test
    public void minorAxisLength_shouldReturnCorrectValue() {
        Ellipse ellipse = new Ellipse(8, 5);
        double result = ellipse.minorAxisLength();
        assertEquals(10.0, result, 0.01);
    }

    @Test
    public void circumferenceApprox_shouldReturnCorrectValue() {
        Ellipse ellipse = new Ellipse(8, 5);
        double result = ellipse.circumferenceApprox();
        assertEquals(41.39, result, 0.01);
    }

    @Test
    public void eccentricity_shouldReturnCorrectValue() {
        Ellipse ellipse = new Ellipse(8, 5);
        double result = ellipse.eccentricity();
        assertEquals(0.78, result, 0.01);
    }
}