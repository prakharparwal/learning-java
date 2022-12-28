package version.eight.parallelstream;

import java.util.List;
import java.util.function.Consumer;
import java.util.stream.Collectors;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class Performer {

    public static void main(String[] args) {
        List<Integer> tasks = IntStream.range(1, 50).boxed().collect(Collectors.toList());

        Consumer<Integer> tasksProcess = (task) -> {

            System.out.println("Started task: "+task);

            try {
                Thread.sleep(2000);
                System.out.println("Processed task: "+task);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        };

       // System.setProperty("java.util.concurrent.ForkJoinPool.common.parallelism", "4");
        tasks.parallelStream().forEach(tasksProcess);
    }
}
