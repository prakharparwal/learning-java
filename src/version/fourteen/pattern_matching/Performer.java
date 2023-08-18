package version.fourteen.pattern_matching;

public class Performer {

    public static void main(String[] args) {

        Object obj = "Something";

        if (obj instanceof String) {
            String str = (String) obj;
            int len = str.length();
            System.out.println(len);
        }

        if (obj instanceof String str) {
            int len = str.length();
            System.out.println(len);
        }



    }
}
