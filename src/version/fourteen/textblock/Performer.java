package version.fourteen.textblock;

public class Performer {
    public static void main(String[] args) {
        String test = """
                Hi this is the text block \
                feature of java
                """;
        System.out.println("TEST1###"+test);

        String test2 = """
                Hi this is the "text" block
                feature of java
                """;
        System.out.println("TEST2###: "+test2);

        String test3 = """
                
                """;
        System.out.println("TEST3###"+test3+"##DONE");

        String test4 = """
                Something with single space\sand then we can write further
                """;

        System.out.println("TEST4###: "+test4);

    }
}
