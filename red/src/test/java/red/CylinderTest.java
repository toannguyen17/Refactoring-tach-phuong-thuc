package red;

import org.junit.Test;

import static org.junit.Assert.*;

public class CylinderTest {

    @Test
    public void testGetVolume0And0() {
        int radius = 0;
        int height = 0;
        double expected = 0.0;
        double result = Cylinder.getVolume(radius, height);
        assertEquals(Double.doubleToLongBits(expected), Double.doubleToLongBits(result));
    }

    @Test
    public void testGetVolume1And2() {
        int radius = 1;
        int height = 2;
        double expected = 18.84955592153876;

        double result = Cylinder.getVolume(radius, height);
        assertEquals(Double.doubleToLongBits(expected), Double.doubleToLongBits(result));
    }
}
