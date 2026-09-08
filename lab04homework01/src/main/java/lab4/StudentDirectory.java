package lab4;

import java.util.*;

public class StudentDirectory {

    private Map<Integer, String> students = new HashMap<>();

    public void addStudent(int id, String name) {
        students.put(id, name);
    }

    public String getStudent(int id) {
        return students.get(id);
    }

    public Set<Integer> getAllIDs() {
        return Collections.unmodifiableSet(students.keySet());
    }
}