package version.eight.default_method.ambiguity_problem;

public interface InterfaceA {

    default void myMethod() {
        System.out.println("myMethod of interface A");
    }
}
