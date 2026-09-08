package lab4;

import java.util.*;

public class Zoo {

    private List<String> animals = new ArrayList<>(Arrays.asList("lion", "tiger", "bear"));

    public List<String> getAnimals() {
        return Collections.unmodifiableList(animals);
    }

    public static void main(String[] args) {
        Zoo zoo = new Zoo();
        List<String> readOnlyAnimals = zoo.getAnimals();

        System.out.println("Animals: " + readOnlyAnimals);

        try {
            readOnlyAnimals.add("flamingo");
        } catch (UnsupportedOperationException e) {
            System.out.println("Caught expected exception: " + e);
        }
    }
}