package core.oops.inheritance;

public class Parent {

    private int test;

    public Parent() {
        System.out.println("Parent class constructor");
    }

    public void doSomething(String a, String b) {
        System.out.println("Parent class method");
    }

    public void printHello() {
        System.out.println("Hello from parent");
    }
}
