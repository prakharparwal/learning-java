package core.multithreading.waystocreatethread.two;

public class Test implements Runnable{

    @Override
    public void run() {
        System.out.println("Thread task");
        System.out.println(Thread.currentThread().getName());
    }
}
