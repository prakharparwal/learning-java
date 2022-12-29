package data;

import java.time.LocalDate;

public record Person(int id, String name, LocalDate dateOfBirth) implements Comparable {
    @Override
    public int compareTo(Object o) {
        Person person = (Person) o;
        return this.name.compareTo(person.name);
    }
}
