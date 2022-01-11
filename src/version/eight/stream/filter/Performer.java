package version.eight.stream.filter;

import data.Person;
import util.LearningJavaDB;

import java.time.LocalDate;
import java.util.List;

public class Performer {

    public static void main(String[] args) {
        List<Person> persons = LearningJavaDB.getAllPersons();

        persons.stream()
                .filter(person -> person.dateOfBirth().isBefore(LocalDate.of(1993, 1, 1)))
                .forEach(System.out::println);
    }
}
