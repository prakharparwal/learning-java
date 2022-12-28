package core.multithreading.priority;

public class Test1 extends Thread{

    @Override
    public void run() {
        System.out.println("Test1 thread priority:" + getPriority());
    }
}
