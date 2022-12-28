package core.multithreading.priority;

public class Test2 extends Thread{

    @Override
    public void run() {
        System.out.println("Priority of Test2 thread:"+getPriority());
        System.out.println("Test2 thread");
    }
}
