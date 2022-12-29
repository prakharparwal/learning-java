package core.oops.polymorphism.compiletime.methodoverloading;

public class Calculator {

    public void add(int i, int j) {
        System.out.println(i+j);
    }

    public void add(int i, int j, int k) {
        System.out.println(i+j+k);
    }

}
