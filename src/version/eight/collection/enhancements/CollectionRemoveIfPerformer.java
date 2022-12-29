package version.eight.collection.enhancements;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.function.Predicate;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class CollectionRemoveIfPerformer {

    public static void main(String[] args) {

        List<Integer> numbers = IntStream.of(1, 2, 3, 4, 5).boxed().collect(Collectors.toList());
        Predicate<Integer> evenNumbers = i -> i%2 == 0;

        numbers.removeIf(evenNumbers);

        System.out.println(numbers);
    }
}
