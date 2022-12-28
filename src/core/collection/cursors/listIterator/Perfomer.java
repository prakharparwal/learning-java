package core.collection.cursors.listIterator;

import java.util.ArrayList;
import java.util.List;
import java.util.ListIterator;

public class Perfomer {

    public static void main(String[] args) {

        List<String> names = new ArrayList<>();
        names.add("First");
        names.add("Second");
        names.add("Third");

        ListIterator ltr = names.listIterator();

        while(ltr.hasNext()) {

            System.out.println(ltr.next());

            if(ltr.next() == "Second") {
                ltr.remove();
                ltr.add("_second");
            }

            if(ltr.next() == "Third") {
                ltr.set("_third");
            }
        }

        System.out.println(names);
    }
}
