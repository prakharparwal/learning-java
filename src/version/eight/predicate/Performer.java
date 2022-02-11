package version.eight.predicate;

import data.Person;
import repository.LearningJavaDB;

import java.time.LocalDate;
import java.util.List;
import java.util.function.Predicate;

public class Performer {
    public static void main(String[] args) {
        List<Person> persons = LearningJavaDB.getAllPersons();
        persons.stream().filter(new Predicate<Person>() {
            @Override
            public boolean test(Person person) {
                return person.dateOfBirth().isBefore(LocalDate.of(1993, 1, 1));
            }
        }).forEach(System.out::println);

        persons.stream()
                .filter((person) -> person.dateOfBirth().isBefore(LocalDate.of(1993, 1, 1)))
                .forEach(System.out::println);
    }
}
