package core.multithreading.join;

public class Test2 extends Thread {

    @Override
    public void run() {
        System.out.println("Test2 thread");

        try {
            Performer2.t.join();
            for(int i=0;i<=5;i++) {
                System.out.println("Test2 thread "+i);
            }
        }catch (InterruptedException ie) {
            System.out.println("Exception");
        }
    }
}
