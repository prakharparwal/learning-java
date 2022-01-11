package version.eight.default_method;

public interface Human {
    public String nature();

    default void dance() {
        System.out.println("Dancing");
    }

}
