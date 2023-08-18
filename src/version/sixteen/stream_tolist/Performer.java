package version.sixteen.stream_tolist;

import data.Person;
import repository.LearningJavaDB;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class Performer {

    public static void main(String[] args) {
        List<Person> persons = LearningJavaDB.getAllPersons();

        System.out.println(persons.stream().map(i -> i.name()).collect(Collectors.toList()));

        List<String> names = persons.stream().map(i -> i.name()).toList();
        System.out.println(names);

    }
}
