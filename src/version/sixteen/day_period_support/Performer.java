package version.sixteen.day_period_support;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class Performer {

    public static void main(String[] args) {

        LocalDateTime localDateTime = LocalDateTime.now();

        System.out.println(localDateTime.format(DateTimeFormatter.ofPattern("h B")));
        //We can explore DateTimeFormatter for a lot of formatting options
    }
}
