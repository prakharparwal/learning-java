package version.ten.unModifiable;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class Performer {

    public static void main(String... q) {

        List<Integer> numbers = new ArrayList<>();
        numbers.add(1);
        numbers.add(2);
        numbers.add(3);
        numbers.add(4);
        numbers.add(5);

        List<Integer> unModifiableList = numbers.stream().filter(i -> i%2 == 0).collect(Collectors.toUnmodifiableList());

        System.out.println(unModifiableList);

        // unModifiableList.add(6);
        // UnsupportedOperationException

    }
}
