package core.comparable;

import data.Person;
import repository.LearningJavaDB;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Performer {

    public static void main(String[] args) {
        List<Person> persons = LearningJavaDB.getAllPersons();
        persons.stream().forEach(System.out::println);
        persons.stream().sorted().forEach(System.out::println);
    }
}
