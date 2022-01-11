package version.eight.stream.flatMap;

import data.Person;
import util.LearningJavaDB;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;
import java.util.Locale;

public class Performer{
    public static void main(String[] args) {
        List<Person> friends = LearningJavaDB.getAllPersons();

        List<Person> cousins = new ArrayList<>();
        cousins.add(new Person(4, "Gunjan", LocalDate.of(1987, 1, 1)));
        cousins.add(new Person(5, "Pratham", LocalDate.of(1997, 1, 1)));
        cousins.add(new Person(6, "Nishu", LocalDate.of(1997, 10, 10)));


        List<List<Person>> all = new ArrayList<>();
        all.add(friends);
        all.add(cousins);

        all.stream().flatMap(oneGroup -> oneGroup.stream().map(person -> person.name().toUpperCase(Locale.ROOT))).forEach(System.out::println);
        System.out.println("----");

        all.stream().flatMap(oneGroup -> oneGroup.stream()).map(person -> person.name().toUpperCase(Locale.ROOT)).forEach(System.out::println);
        System.out.println("----");

        all.stream().flatMap(List::stream).map(person -> person.name().toUpperCase()).forEach(System.out::println);
        System.out.println("----");

        List<Student> students = new ArrayList<>();
        students.add(new Student(1, "Prakhar", List.of("Subject1", "Subject2")));
        students.add(new Student(2, "Sudeep", List.of("Subject3", "Subject4")));
        students.add(new Student(3, "Nikhil", List.of("Subject5", "Subject6")));

        students.stream().flatMap(student -> student.subjects().stream()).forEach(System.out::println);
        System.out.println("-----");

    }
}

record Student(int id, String name, List<String> subjects) {}
