package version.eight.stream.map;

import data.Person;
import repository.LearningJavaDB;

import java.util.List;
import java.util.Locale;

public class Performer {
    public static void main(String[] args) {
        List<Person> persons = LearningJavaDB.getAllPersons();

        persons.stream().map((person) -> person.name().toUpperCase(Locale.ROOT)).forEach(System.out::println);
    }
}
