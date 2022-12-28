package core.multithreading.waystocreatethread.two;

public class Performer {

    public static void main(String[] args) {
        System.out.println(Thread.currentThread().getName());
        Test t = new Test();
        Thread th = new Thread(t);
        th.start();
        //th.start(); We cannot start a dead thread again, it will throw IllegalThreadStateException
    }
}
