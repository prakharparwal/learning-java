package version.eight.stream.flatMap;

import java.util.ArrayList;
import java.util.List;

public class Performer{
    public static void main(String[] args) {
        List<Person> friends = new ArrayList<>();
        friends.add(new Person(1, "Prakhar", 30));
        friends.add(new Person(2, "Sudeep", 29));
        friends.add(new Person(3, "Nikhil", 29));


        List<Person> cousins = new ArrayList<>();
        cousins.add(new Person(4, "Gunjan", 38));
        cousins.add(new Person(5, "Pratham", 19));
        cousins.add(new Person(6, "Nishu", 21));


        List<List<Person>> all = new ArrayList<>();
        all.add(friends);
        all.add(cousins);

        all.stream().flatMap(oneGroup -> oneGroup.stream().map(person -> person.name().toUpperCase())).forEach(System.out::println);

    }
}
