package version.eight.stream.reduction.reduce;

import data.Person;
import repository.LearningJavaDB;

import java.time.LocalDate;
import java.time.Period;
import java.util.List;

public class Performer {

    public static void main(String[] args) {
        List<Person> persons = LearningJavaDB.getAllPersons();
        System.out.println(persons.stream().map(person -> Period.between(person.dateOfBirth(), LocalDate.now()).getYears()).reduce(0, (a, b) -> a+b));
    }
}
