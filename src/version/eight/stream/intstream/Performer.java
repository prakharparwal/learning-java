package version.eight.stream.intstream;

import java.util.function.IntPredicate;
import java.util.function.Supplier;
import java.util.stream.IntStream;

public class Performer {

    public static void main(String[] args) {

        //Print numbers between range
        IntStream.range(0, 10).forEach(System.out::println);
        System.out.println("*******************");

        //Print numbers including upper limit
        IntStream.rangeClosed(0, 10).forEach(System.out::println);
        System.out.println("*******************");


        Supplier<IntStream> intStreamSupplier = () -> IntStream.of(1, 2, 3, 4, 5);
        System.out.println(intStreamSupplier.get().average());
        System.out.println(intStreamSupplier.get().max());
        System.out.println(intStreamSupplier.get().min());
        System.out.println(intStreamSupplier.get().sum());
        System.out.println(intStreamSupplier.get().summaryStatistics());
        System.out.println("*******************");


        //Get all the even numbers using predicates. "Condition satisfied scenario"
        IntPredicate isEven = x -> x % 2 == 0;
        IntStream.of(1, 2, 3, 4, 5).takeWhile(x -> x % 2 != 0).forEach(System.out::println);
        System.out.println("*******************");

        //Yha se condition satify hone band ho gyi, wha se pick karna
        intStreamSupplier.get().dropWhile(isEven).forEach(System.out::println);
        System.out.println("*******************");


        //Sum of all integer
        System.out.println(intStreamSupplier.get().reduce((a, b) -> a+b).getAsInt());
        System.out.println(intStreamSupplier.get().reduce(Integer::sum).getAsInt());
        System.out.println("*******************");

        //Sum of all with (firstNumber*2 and SecondNumber*3)
        System.out.println(intStreamSupplier.get().reduce((a, b) -> (a*2) + (b*3)));
    }
}
