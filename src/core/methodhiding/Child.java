package core.methodhiding;

public class Child extends Parent {

    public static void doSomething() {
        System.out.println("Child class method");
    }

    public void test() {
        System.out.println("CHILD CLASS METHOD");
    }
}
