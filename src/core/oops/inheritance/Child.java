package core.oops.inheritance;

public class Child extends Parent {

    public Child() {
        super();
        System.out.println("Child class constructor");
    }

    public int doSomething(int a, int b) {
        System.out.println("Child class method");return 1;
    }

    public void sayBye() {
        System.out.println("Bye from child");
    }
}
