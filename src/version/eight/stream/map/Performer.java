package version.eight.stream.map;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;

public class Performer {
    public static void main(String[] args) {
        List<Person> persons = new ArrayList<>();
        persons.add(new Person(1, "Prakhar", 30));
        persons.add(new Person(2, "Sudeep", 29));
        persons.add(new Person(3, "Nikhil", 29));

        persons.stream().map((person) -> person.name().toUpperCase(Locale.ROOT)).forEach(System.out::println);
    }
}
