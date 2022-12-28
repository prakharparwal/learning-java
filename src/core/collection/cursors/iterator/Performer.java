package core.collection.cursors.iterator;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Performer {

    public static void main(String[] args) {

        List<Integer> numbers = new ArrayList<>();

        for(int i=0; i<=10; i++) {
            numbers.add(i);
        }

        Iterator itr = numbers.iterator();
        while (itr.hasNext()) {
            Integer number = (Integer) itr.next();
            if(number %2 != 0) {
                itr.remove();
            }
        }

        System.out.println(numbers);
    }
}
