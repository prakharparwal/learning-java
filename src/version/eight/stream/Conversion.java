package version.eight.stream;

import data.Person;
import repository.LearningJavaDB;

import java.time.LocalDate;
import java.util.DoubleSummaryStatistics;
import java.util.List;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

public class Conversion {

    public static void main(String[] args) {

        //Convert list to map
        List<Person> persons = LearningJavaDB.getAllPersons();

        //Create a map having dob as key and list of employees as value
        Map<LocalDate, List<Person>> myMap = persons.stream().collect(Collectors.groupingBy(Person::dateOfBirth));
        System.out.println(myMap);

        //Create a map having dob as key and employee's name as value
        //The below code will throw an exception IllegalStateException because of duplicate key
        /*        Map<LocalDate, String> dobToName = persons.stream().collect(Collectors.toMap(Person::dateOfBirth, Person::name));
        System.out.println(dobToName);*/
        Map<LocalDate, String> dobToName = persons.stream().collect(Collectors.toMap(Person::dateOfBirth, Person::name, (oldValue, newValue) -> oldValue));
        System.out.println(dobToName);

        //Create a map having dob as key and list of employee names as value
        Map<LocalDate, List<String>> dobToNames = persons.stream().collect(Collectors.groupingBy(Person::dateOfBirth, Collectors.mapping(Person::name, Collectors.toList())));
        System.out.println(dobToNames);

        //Create map with count as object and occurrence count as value
        List<String> fruits = List.of("apple", "grapes", "banana", "grapes", "apple", "papaya");
        Map<String, Long> fruitToCount = fruits.stream().collect(Collectors.groupingBy(Function.identity(), Collectors.counting()));
        System.out.println(fruitToCount);

        // Get statistics
        Map<LocalDate, DoubleSummaryStatistics> countToStatistics = persons.stream().collect(Collectors.groupingBy(Person::dateOfBirth, Collectors.summarizingDouble(Person::weight)));
        System.out.println(countToStatistics);


        //Get map of boolean to employee's names whose condition is getting satisfied and not satisfied
        Map<Boolean, List<String>> booleanToNames = persons.stream().collect(Collectors.partitioningBy(x -> x.dateOfBirth().isBefore(LocalDate.of(1994, 01, 01)), Collectors.mapping(Person::name, Collectors.toList())));
        System.out.println(booleanToNames);

    }
}
