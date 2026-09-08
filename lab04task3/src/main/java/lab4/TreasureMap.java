package lab4;

import java.util.*;

public class TreasureMap {

    public static void main(String[] args) {
        Map<String, Double> treasures = new HashMap<>();
        treasures.put("beach", 25.0);
        treasures.put("palm", 50.0);
        treasures.put("cove", 75.0);

        // Update "palm" value = current value + size of map
        double currentPalm = treasures.get("palm");
        treasures.put("palm", currentPalm + treasures.size());

        // Sum all values using for-each
        double total = 0;
        for (double value : treasures.values()) {
            total += value;
        }

        System.out.println("Updated treasures: " + treasures);
        System.out.println("Total sum: " + total);
    }
}