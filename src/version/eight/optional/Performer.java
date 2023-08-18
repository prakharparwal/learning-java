package version.eight.optional;

import data.Person;

import java.time.LocalDate;
import java.util.HashMap;
import java.util.Map;
import java.util.Optional;

public class Performer {

    public static void main(String[] args) {

        String test = "prakhar";
        System.out.println(test.length());

        Person p = new Person(1, "Test", LocalDate.now(), 65);
        Optional<Person> person = Optional.ofNullable(p);
        if(person.isPresent()) {
        doSomething();
        } else
        {
            throw new RuntimeException("RTE");
        }

        person.ifPresentOrElse(x -> process(x), () -> {
            throw new RuntimeException("RTE");
        });

        String name;

        Map<String, String> testMap = new HashMap<>();
        /*testMap.entrySet().forEach(x -> {
            if(x.getValue() == "test") {
                name = x.getKey();
            }
        });*/

        for(Map.Entry<String, String> entry: testMap.entrySet()) {
            if (entry.getValue() == "test") {
                name = entry.getKey();
            }
        }

    }
    public static void doSomething() {

    }

    public static void process(Person p) {

    }

    //isPresent()
    /*
    *
    *
    * isPresent
    * orElseGet(Supplier)
    * orElse(Value T)
    * orElseThrow()
    * ofNullable()
    *
    *
    *
    * */


}
