package core.multithreading.waystocreatethread.one;

public class Test extends Thread{

    @Override
    public void run() {
        System.out.println("Thread of test class");
        System.out.println(currentThread().getName());
    }
}
