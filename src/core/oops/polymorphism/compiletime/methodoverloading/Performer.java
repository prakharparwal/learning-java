package core.oops.polymorphism.compiletime.methodoverloading;

public class Performer {

    public static void main(String[] args) {
        Calculator c = new Calculator();
        c.add(10, 20);
        c.add(10, 20, 30);
    }
}

