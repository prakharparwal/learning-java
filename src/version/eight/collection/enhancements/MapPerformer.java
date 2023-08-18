package version.eight.collection.enhancements;

import java.util.HashMap;
import java.util.Map;

public class MapPerformer {

    public static void main(String[] args) {
        Map<Integer, String> details = new HashMap<>();

        details.put(1, "Test");
        details.put(2, "Something");
        System.out.println(details);

        details.put(1, "Test Overridden");
        System.out.println(details);

        details.putIfAbsent(1, "Test again new entry");
        System.out.println(details);

        details.putIfAbsent(3, "Third");
        System.out.println(details);

        //Foreach
        details.forEach((key, value) -> {
            System.out.println(key);
            System.out.println("Value in all upper case: "+ value.toUpperCase());
        });

        //GetOrDefault
        System.out.println(details.getOrDefault(4,"No value found"));

    }
}
