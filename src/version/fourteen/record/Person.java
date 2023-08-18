package version.fourteen.record;

import java.util.Objects;

public record Person(int id, String name) {

   /* public Person(String name) {
        this(000, name);
    }
*/
  /*  public Person(int id, String name, String test) {
        this.id = id;
        this.name = name;
    }

   public Person {
        Objects.requireNonNull(id);
        Objects.requireNonNull(name);
    }*/
    public static String SOME_FIELD = "SomeField";
    public static String someMethod() {
        return "Some method";
    }
}

/*



   */



  /*
*/