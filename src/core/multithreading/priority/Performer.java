package core.multithreading.priority;

public class Performer {

    public static void main(String[] args) {
        System.out.println("Main thread priority: "+Thread.currentThread().getPriority());
        System.out.println("Updating main thread priority");
        Thread.currentThread().setPriority(Thread.MIN_PRIORITY);
        System.out.println("Main thread priority: "+Thread.currentThread().getPriority());
        Test1 t1 = new Test1();

        t1.setPriority(Thread.MAX_PRIORITY); //Can be done, setting priority after thread starts

        Test2 t2 = new Test2();
        t2.setPriority(Thread.MIN_PRIORITY);

        t1.start();
        t2.start();

        System.out.println("Main thread: Something something");
    }
}
