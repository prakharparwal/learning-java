package version.ten.copyOf;

import java.util.ArrayList;
import java.util.List;

public class Performer {

    public static void main(String... q) {
        List<String> names = new ArrayList<>();
        names.add("Prakhar");
        names.add("Sudeep");
        names.add("Nikhil");

        List<String> copiedNames = List.copyOf(names);
        System.out.println(copiedNames);

        //copiedNames.add("TEST");
        //UnsupportedOperationException

    }
}
