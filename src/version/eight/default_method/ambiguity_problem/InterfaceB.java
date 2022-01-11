package version.eight.default_method.ambiguity_problem;

public interface InterfaceB {
    default void myMethod() {
        System.out.println("myMethod of InterfaceB");
    }
}
