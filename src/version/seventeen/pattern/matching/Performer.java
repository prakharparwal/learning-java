package version.seventeen.pattern.matching;

public class Performer {

    public static void main(String[] args) {


        String test = null;

        switch(test) {
            case "Something" -> System.out.println("Given string is something");
            case "test" -> System.out.println("Given string is test");
            case null -> System.out.println("Given string is null");
            default -> System.out.println("Given string is not matching to any case");
        }



    }
}
