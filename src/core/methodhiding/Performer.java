package core.methodhiding;

public class Performer {

    public static void main(String[] args) {

        Parent p = new Parent();
        Child c = new Child();
        Parent pc = new Child();

        p.doSomething();
        c.doSomething();
        pc.doSomething();

        System.out.println("_____");
        Parent.doSomething();
        Child.doSomething();

        System.out.println("___________");
        pc.test();
    }
}
