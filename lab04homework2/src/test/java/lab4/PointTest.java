package lab4;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class PointTest {

    @Test
    void testGetters() {
        Point p = new Point(3, 4);
        assertEquals(3, p.getX());
        assertEquals(4, p.getY());
    }

    @Test
    void testToString() {
        Point p = new Point(1, 2);
        assertEquals("Point(1, 2)", p.toString());
    }
}