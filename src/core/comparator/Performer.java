package core.comparator;

import data.Person;
import repository.LearningJavaDB;

import java.util.List;
import java.util.stream.Collectors;

public class Performer {

    public static void main(String[] args) {
        List<Person> persons = LearningJavaDB.getAllPersons();
        persons.stream().sorted(new AgeComparator()).collect(Collectors.toList()).forEach(System.out::println);

        persons.stream().sorted(new NameComparator()).collect(Collectors.toList()).forEach(System.out::println);
    }
}
