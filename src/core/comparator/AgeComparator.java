package core.comparator;

import data.Person;

import java.util.Comparator;

public class AgeComparator implements Comparator<Person> {

    @Override
    public int compare(Person o1, Person o2) {
        return o1.dateOfBirth().compareTo(o2.dateOfBirth());
    }
}
