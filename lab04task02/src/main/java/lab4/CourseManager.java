package lab4;

import java.util.*;

public class CourseManager {

    // Buggy version - throws ConcurrentModificationException
    public static void removeUnsafe(List<String> subjects) {
        for (String s : subjects) {
            if (s.startsWith("6.")) {
                subjects.remove(s); // this line causes the exception
            }
        }
    }

    // Fixed version - uses Iterator
    public static void removeSafe(List<String> subjects) {
        Iterator<String> iter = subjects.iterator();
        while (iter.hasNext()) {
            String s = iter.next();
            if (s.startsWith("6.")) {
                iter.remove();
            }
        }
    }

    public static void main(String[] args) {
        List<String> subjects = new ArrayList<>(Arrays.asList("6.045", "6.005", "8.03", "6.813", "14.03"));

        try {
            removeUnsafe(new ArrayList<>(subjects)); // pass a copy to demonstrate the crash safely
        } catch (ConcurrentModificationException e) {
            System.out.println("Caught expected exception: " + e);
        }

        removeSafe(subjects);
        System.out.println("Final list: " + subjects); // should print [8.03, 14.03]
    }
}