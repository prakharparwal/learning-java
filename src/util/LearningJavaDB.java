package util;

import data.Person;

import java.time.LocalDate;
import java.util.List;

public class LearningJavaDB {

    public static List<Person> getAllPersons() {
        List<Person> persons = List.of(
                new Person(1, "Prakhar", LocalDate.of(1992, 9, 19)),
                new Person(2, "Sudeep", LocalDate.of(1993, 5, 26)),
                new Person(3, "Nikhil", LocalDate.of(1993, 5, 07))
        );
        return persons;
    }
}
