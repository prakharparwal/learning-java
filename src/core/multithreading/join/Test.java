package core.multithreading.join;

public class Test extends Thread {

    @Override
    public void run() {
        System.out.println("Test thread");
        try {
            for(int i=0; i<= 5; i++) {
                Thread.sleep(1000);
                System.out.println(Thread.currentThread().getName()+" "+i);
            }
        } catch(InterruptedException ie) {
            System.out.println("OK");
        }
    }
}
