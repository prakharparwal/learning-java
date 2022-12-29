package version.nine.privatemethodininterface;

public interface Test {

    default void myMethod() {
        System.out.println("Test");
        someMethod();
        System.out.println("Something");
    }

    private void someMethod() {
        System.out.println("Some Method");
    }
}
