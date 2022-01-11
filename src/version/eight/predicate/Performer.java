package version.eight.predicate;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Predicate;

public class Performer {
    public static void main(String[] args) {
        Person p = new Person(1, "Prakhar", 30);
        Person p1 = new Person(1, "Sudeep", 29);
        Person p2 = new Person(1, "Nikhil", 29);

        List<Person> persons = new ArrayList<Person>();
        persons.add(p);
        persons.add(p2);
        persons.add(p2);

        persons.stream().filter(new Predicate<Person>() {
            @Override
            public boolean test(Person person) {
                return person.age() < 30;
            }
        }).forEach(System.out::println);

        persons.stream().filter((person) -> person.age() > 29).forEach(System.out::println);
    }
}
