package version.eight.stream.reduction.aggregator;

import data.Person;
import repository.LearningJavaDB;

import java.time.LocalDate;
import java.time.Period;
import java.util.List;

public class Performer {

    public static void main(String[] args) {
        List<Person> persons = LearningJavaDB.getAllPersons();

        persons.stream().mapToInt(person -> Period.between(person.dateOfBirth(), LocalDate.now()).getYears()).forEach(System.out::println);

        System.out.println(persons.stream()
                .mapToInt(person -> Period.between(person.dateOfBirth(), LocalDate.now()).getYears())
                .average().getAsDouble()
        );
    }
}
