package core.multithreading.waystocreatethread.one;

public class Performer {

    public static void main(String[] args) {
        System.out.println(Thread.currentThread().getName());

        Test t = new Test();
        t.start();
        //t.start(); We cannot start a dead thread again, it will give IllegalThreadStateException
    }
}
