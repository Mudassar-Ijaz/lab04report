package lab4;

import org.junit.jupiter.api.Test;
import java.util.Set;
import static org.junit.jupiter.api.Assertions.*;

public class StudentDirectoryTest {

    @Test
    void testAddAndGetStudent() {
        StudentDirectory dir = new StudentDirectory();
        dir.addStudent(1, "Ali");
        assertEquals("Ali", dir.getStudent(1));
    }

    @Test
    void testGetAllIDsReturnsCorrectSet() {
        StudentDirectory dir = new StudentDirectory();
        dir.addStudent(1, "Ali");
        dir.addStudent(2, "Sara");
        Set<Integer> ids = dir.getAllIDs();
        assertTrue(ids.contains(1) && ids.contains(2));
    }

    @Test
    void testGetAllIDsIsUnmodifiable() {
        StudentDirectory dir = new StudentDirectory();
        dir.addStudent(1, "Ali");
        Set<Integer> ids = dir.getAllIDs();
        assertThrows(UnsupportedOperationException.class, () -> ids.add(99));
    }
}