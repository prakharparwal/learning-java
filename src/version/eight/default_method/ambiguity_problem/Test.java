package version.eight.default_method.ambiguity_problem;

public class Test implements InterfaceA, InterfaceB{

    @Override
    public void myMethod() {
        InterfaceA.super.myMethod();
    }
}
