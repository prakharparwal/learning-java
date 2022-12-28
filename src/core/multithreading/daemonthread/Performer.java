package core.multithreading.daemonthread;

public class Performer {

    public static void main(String[] args) {
        System.out.println(Thread.currentThread().getName());
        System.out.println("------");
        Test t = new Test();
        t.setDaemon(true);
        t.start();
        System.out.println("Something something");

        // t.setDaemon(true); //IllegalThreadStateException because thread is set to Daemon post the thread start

    }
}
